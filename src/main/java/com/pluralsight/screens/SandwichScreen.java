package com.pluralsight.screens;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.BreadTypes;
import com.pluralsight.enums.PremiumToppingName;
import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.order.GenerateReceipt;
import com.pluralsight.order.Order;
import com.pluralsight.order.SandwichOrder;
import com.pluralsight.otherProducts.OtherProducts;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichScreen {
    public static List<Sandwhich> sandwhiches = new ArrayList<>();
    static boolean isToasted = false;
    public static double totalSandwichCost = 0;

    private static String getChoice(String txt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        return scanner.nextLine();
    }

    public static void makeSandwichOrder() throws InterruptedException, IOException {

        BreadTypes breadTypes = getBreadType();
        //System.out.println(breadTypes);
        System.out.println();

        BreadSize breadSize = getBreadSize();
        //System.out.println(breadSize);
        System.out.println();

        List<PremiumTopping> premiumToppings = getPremiumToppings(breadSize);
        //System.out.println(premiumToppings);
        System.out.println();

        List<RegularTopping> regularToppings = getRegularToppings(breadSize);
        //System.out.println(regularToppings);


        sandwhiches.add(new Sandwhich(breadSize, breadTypes, isToasted, regularToppings, premiumToppings));
        //System.out.println(sandwhiches.getFirst());
        printSandwich(sandwhiches);
        OrderScreen.orders.add(new SandwichOrder(sandwhiches));
        //System.out.println(OrderScreen.orders);
        //System.out.println("Sandwich total is: " + totalSandwichCost);
        OrderScreen.channel();

    }

    public static void printSandwich(List<Sandwhich> sandwhiches) {
        /*                --- DElIcious ---
        sandwich:
                Bread Type:  %s %s %s %s
                -------------------------------
                Meats: %s, %s, %s %s
                ------------------------------
                Cheese:  %s %s %s %s
                -----------------------------
                Regular Toppings:  %s %s %s %s
                        ---------------------
                        sides:  %s %s %s %s
                        ---------------------
                        sauce:  %s %s %s %s
                        ---------------------
                Total: %s
                --------------------------------
         */
        for (int i = 0; i < sandwhiches.size(); i++){
            System.out.print("\n" +
                    DELIcious.spacing + "              ------         Sandwich " + (i+1) + "      ------             \n" +
                    DELIcious.spacing + "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Toasted: " + (sandwhiches.get(i).isToasted() ? "    Yes\n" : "    No\n") +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Bread Type: " + sandwhiches.get(i).getBreadType() + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Bread Size: " + sandwhiches.get(i).getSize() + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Premium Toppings:" + "\n" +
                    DELIcious.spacing +      "    -- Meats: " + "\n" + DELIcious.spacing + "             " + getMeat(i) + "\n" +
                    DELIcious.spacing +      "    -- Cheese: " + "\n" + DELIcious.spacing + "             " + getCheeses(i) + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Regular Toppings: " + "\n" + DELIcious.spacing + "             " + printRegularToppings(i) + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Sauce: " + "\n" + DELIcious.spacing + "             " + printSauce(i) + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Side" + "\n" +DELIcious.spacing +  "             " + printSide(i) + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n" +
                    DELIcious.spacing +      "    -- Total: " + printTotal(i) + "\n" +
                    DELIcious.spacing +      "-----------------------------------------------------------------\n\n");

        }


    }

    public static String printSide(int i) {
        List<RegularTopping> premiumToppings = sandwhiches.get(i).getRegularToppings();
        StringBuilder sides = new StringBuilder();
        int counter = 1;
        for(RegularTopping topping : premiumToppings){
            if (topping.getRegularTopping().getType().equals("side")){
                sides.append(topping.getRegularTopping().toString()).append(", ");
                if (counter == 4){
                    sides.append("\n             ");
                    counter = 0;
                }
                counter++;
            }
        }
        if (sides.length() > 2) {
            return sides.substring(0, sides.length() - 2);
        }else {
            return sides.toString();
        }
    }

    public static String printSauce(int i) {
        List<RegularTopping> premiumToppings = sandwhiches.get(i).getRegularToppings();
        StringBuilder sauces = new StringBuilder();
        int counter = 1;
        for(RegularTopping topping : premiumToppings){
            if (topping.getRegularTopping().getType().equals("sauce")){
                sauces.append(topping.getRegularTopping().toString()).append(", ");
                if (counter == 4){
                    sauces.append("\n             ");
                    counter = 0;
                }
                counter++;
            }
        }
        if (sauces.length() > 2) {
            return sauces.substring(0, sauces.length() - 2);
        }else {
            return sauces.toString();
        }
    }

    public static double printTotal(int i) {
        totalSandwichCost = 0;
        totalSandwichCost += sandwhiches.get(i).calculateSandwichCost();
        return sandwhiches.get(i).calculateSandwichCost();

    }

    public static String printRegularToppings(int i) {
        List<RegularTopping> premiumToppings = sandwhiches.get(i).getRegularToppings();
        StringBuilder regular = new StringBuilder();
        int counter = 1;
        for(RegularTopping topping : premiumToppings){
            if (counter == 4){
                regular.append("\n             ");
                counter = 0;
            }
            if (!topping.getRegularTopping().getType().equals("side")){
               regular.append(topping.getRegularTopping().toString()).append(", ");
            }

            counter++;
        }
        if (regular.length() > 2) {
            return regular.substring(0, regular.length() - 2);
        }else {
            return regular.toString();
        }
    }

    public static String getCheeses(int i) {
        List<PremiumTopping> premiumToppings = sandwhiches.get(i).getPremiumToppings();
        StringBuilder cheeses = new StringBuilder();
        int counter = 1;
        for(PremiumTopping topping : premiumToppings){
            if (topping.getPremiumTopping().getType().equals("cheese")){
                cheeses.append(topping.getPremiumTopping().toString()).append(", ");
                if (counter == 4){
                    cheeses.append("\n             ");
                    counter = 0;
                }
                counter++;
            }
        }
        if (cheeses.length() > 2) {
            return cheeses.substring(0, cheeses.length() - 2);
        }else {
            return cheeses.toString();
        }
    }

    public static String getMeat(int i){
         List<PremiumTopping> premiumToppings = sandwhiches.get(i).getPremiumToppings();
         StringBuilder toppings = new StringBuilder();
         int counter = 1;
         for(PremiumTopping topping : premiumToppings){
             if (topping.getPremiumTopping().getType().equals("meat")){
                 toppings.append(topping.getPremiumTopping().toString()).append(", ");
                 if (counter == 4){
                     toppings.append("\n             ");
                     counter = 0;
                 }
                 counter++;
             }
         }
         if (toppings.length() > 2) {
             return toppings.substring(0, toppings.length() - 2);
         }else {
             return toppings.toString();
         }
    }


    private static List<RegularTopping> getRegularToppings(BreadSize breadSize) {
        boolean running = true;
        List<RegularTopping> regularToppings = new ArrayList<>();

        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                REGULAR TOPPINGS                *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "               Choose your regular toppings:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥒 Cucumber\n" +
                DELIcious.spacing + "             2. 🌶 Pepper\n" +
                DELIcious.spacing + "             3. 🧅 Onions\n" +
                DELIcious.spacing + "             4. 🥬 Lettuce\n" +
                DELIcious.spacing + "             5. 🍅 Tomatoes\n" +
                DELIcious.spacing + "             6. 🌶 Jalapenos\n" +
                DELIcious.spacing + "             7. 🥒 Pickles\n" +
                DELIcious.spacing + "             8. 🥑 Guacamole\n" +
                DELIcious.spacing + "             9. 🍄 Mushrooms\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");

        int count = 0;
        do {

            String choice = getChoice(DELIcious.spacing + "Add topping: ");
            switch (choice) {
                case "1" -> regularToppings.add(new RegularTopping(RegularToppingName.CUCUMBERS));
                case "2" -> regularToppings.add(new RegularTopping(RegularToppingName.PEPPERS));
                case "3" -> regularToppings.add(new RegularTopping(RegularToppingName.ONIONS));
                case "4" -> regularToppings.add(new RegularTopping(RegularToppingName.LETTUCE));
                case "5" -> regularToppings.add(new RegularTopping(RegularToppingName.TOMATOES));
                case "6" -> regularToppings.add(new RegularTopping(RegularToppingName.JALAPENOS));
                case "7" -> regularToppings.add(new RegularTopping(RegularToppingName.PICKLES));
                case "8" -> regularToppings.add(new RegularTopping(RegularToppingName.GUACAMOLE));
                case "9" -> regularToppings.add(new RegularTopping(RegularToppingName.MUSHROOMS));
                default -> {
                    System.out.println(DELIcious.spacing + "* Please choice a valid option *");
                    continue;
                }
            }
            if (count == 0) { System.out.print(DELIcious.spacing + "Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(DELIcious.spacing + ">> ");}

            String add = getChoice("");
            if (!add.equalsIgnoreCase("")){
                System.out.println(DELIcious.spacing + "Interesting choices, now choose the sauce!");
                getSauce(regularToppings);
                running = false;
            }
        }while (running) ;

        return regularToppings;
    }

    private static void getSauce(List<RegularTopping> regularToppings) {
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                    SAUCES                      *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "             Choose your sauce:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥄 Mayo\n" +
                DELIcious.spacing + "             2. 🧂 Mustard\n" +
                DELIcious.spacing + "             3. 🍅 Ketchup\n" +
                DELIcious.spacing + "             4. 🥗 Ranch\n" +
                DELIcious.spacing + "             5. 🏝 Thousand Island\n" +
                DELIcious.spacing + "             6. 🍋 Vinaigrette\n" +
                DELIcious.spacing + "             7. 🍲 Au Jus (side)\n" +
                DELIcious.spacing + "             8. 🍶 Sauce (side)\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");

        int count = 0;

        do {

            String choice = getChoice(DELIcious.spacing + "Add Sauce: ");
            switch (choice) {
                case "1" -> regularToppings.add(new RegularTopping(RegularToppingName.MAYO));
                case "2" -> regularToppings.add(new RegularTopping(RegularToppingName.MUSTARD));
                case "3" -> regularToppings.add(new RegularTopping(RegularToppingName.KETCHUP));
                case "4" -> regularToppings.add(new RegularTopping(RegularToppingName.RANCH));
                case "5" -> regularToppings.add(new RegularTopping(RegularToppingName.THOUSAND_ISLAND));
                case "6" -> regularToppings.add(new RegularTopping(RegularToppingName.VINAIGRETTE));
                case "7" -> regularToppings.add(new RegularTopping(RegularToppingName.AU_JUS));
                case "8" -> regularToppings.add(new RegularTopping(RegularToppingName.SAUCE));
                default -> {
                    System.out.println(DELIcious.spacing + "* Please choice a valid option *");
                    continue;
                }
            }

            if (count == 0) { System.out.print(DELIcious.spacing + "Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(DELIcious.spacing + ">> ");}

            String add = getChoice("");
            if (!add.equalsIgnoreCase("")){
                String toasted = getChoice(DELIcious.spacing + "Lastly would you like the sandwich toasted? (y/n) ");
                isToasted = toasted.equalsIgnoreCase("y");
                System.out.println("\n" +DELIcious.spacing + "          * Awesome selection for a sandwich! *" + "\n" +DELIcious.spacing +
                        "          Would you like adding anything else?");

                running = false;
            }
        }while (running);

    }


    private static List<PremiumTopping> getPremiumToppings(BreadSize breadSize){
        boolean running = true;
        List<PremiumTopping> premiumToppings = new ArrayList<>();
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*            PREMIUM TOPPINGS - MEAT             *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "              Select your meat topping:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥩 Steak\n" +
                DELIcious.spacing + "             2. 🍖 Ham\n" +
                DELIcious.spacing + "             3. 🥓 Salami\n" +
                DELIcious.spacing + "             4. 🍖 Roast Beef\n" +
                DELIcious.spacing + "             5. 🍗 Chicken\n" +
                DELIcious.spacing + "             6. 🥓 Bacon\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");


        int count = 0;
        do {
            String choice = getChoice(DELIcious.spacing + "Add topping: ");
            switch (choice) {
                case "1" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.STEAK, breadSize));
                case "2" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.HAM, breadSize));
                case "3" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.SALAMI, breadSize));
                case "4" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.ROAST_BEEF, breadSize));
                case "5" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.CHICKEN, breadSize));
                case "6" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.BACON, breadSize));
                default -> {
                    System.out.println(DELIcious.spacing + "* Please choice a valid option *");
                    continue;
                }
            }
            if (count == 0) { System.out.print(DELIcious.spacing + "Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(DELIcious.spacing + ">> ");}

            String add = getChoice("");
            if (!add.equalsIgnoreCase("")){
                System.out.println(DELIcious.spacing + "Interesting choices, now choose the cheese!");
                running = false;
                getCheese(premiumToppings, breadSize);
            }
        }while (running);

        return premiumToppings;
    }

    private static void getCheese(List<PremiumTopping> premiumToppings, BreadSize breadSize){
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                CHEESE SELECTION                *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "                Choose your cheese:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🧀 American\n" +
                DELIcious.spacing + "             2. 🧀 Provolone\n" +
                DELIcious.spacing + "             3. 🧀 Cheddar\n" +
                DELIcious.spacing + "             4. 🧀 Swiss\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");

        int count = 0;
        do {

            String choice = getChoice(DELIcious.spacing + "Add Cheese: ");
            switch (choice){
                case "1" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.AMERICAN, breadSize));
                case "2" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.PROVOLONE, breadSize));
                case "3" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.CHEDDAR, breadSize));
                case "4" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.SWISS, breadSize));
                default -> {
                    System.out.println(DELIcious.spacing + "* Please choice a valid option *");
                    continue;
                }
            }
            if (count == 0) { System.out.print(DELIcious.spacing + "Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(DELIcious.spacing + ">> ");}

            String add = getChoice("");
            if (!add.equalsIgnoreCase("")){
                System.out.println(DELIcious.spacing + "Interesting choices, now choose regular toppings!");
                running = false;
            }
        }while (running);

    }

    private static BreadTypes getBreadType() {
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                   BREAD TYPE                   *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "         Please select your preferred bread:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🍞 WHITE\n" +
                DELIcious.spacing + "             2. 🍞 WHEAT\n" +
                DELIcious.spacing + "             3. 🍞 RYE\n" +
                DELIcious.spacing + "             4. 🌯 WRAP\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");
//        int count = 1;
//        for (BreadTypes breadType : BreadTypes.values()){
//            System.out.println( count + ". " + breadType);
//            count++;
//        }
        System.out.println();
        String choice = getChoice(DELIcious.spacing + "Your Choice: ");
        BreadTypes breadTypes = null;
        switch (choice) {
            case "1" -> breadTypes = BreadTypes.WHITE;
            case "2" -> breadTypes = BreadTypes.WHEAT;
            case "3" -> breadTypes = BreadTypes.TYE;
            case "4" -> breadTypes = BreadTypes.WRAP;
            default -> System.out.println(DELIcious.spacing + "* Choice not available *");
        }
        System.out.println(DELIcious.spacing + "Nice! let's choose the size~");
        return breadTypes;
    }


    private static BreadSize getBreadSize() {
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                   BREAD SIZE                   *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "         Please select the size of your bread:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥖 4 inch\n" +
                DELIcious.spacing + "             2. 🥖 8 inch\n" +
                DELIcious.spacing + "             3. 🥖 12 inch\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");

        String sizeChoice = getChoice(DELIcious.spacing + "Add Size: ");
        BreadSize breadSize = null;
        switch (sizeChoice) {
            case "1" -> breadSize = BreadSize.FOUR_INCH;
            case "2" -> breadSize = BreadSize.EIGHT_INCH;
            case "3" -> breadSize = BreadSize.TWELVE_INCH;
            default -> System.out.println("Choice not available");
        }

        return breadSize;
    }

}
