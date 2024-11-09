package com.pluralsight.screens;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.BreadTypes;
import com.pluralsight.enums.PremiumToppingName;
import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.otherProducts.OtherProducts;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichScreen {
    public static List<Sandwhich> sandwhiches = new ArrayList<>();

    private static boolean isToasted = false;
    private static final Scanner scanner = new Scanner(System.in);
    public static double totalSandwichCost = 0;

    private static String getChoice(){
        System.out.print("Your choice: ");
        return scanner.nextLine();
    }

    public static void makeSandwichOrder() {

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
            System.out.print("              ------         Sandwich " + (i+1) + "      ------             \n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Toasted: " + (sandwhiches.get(i).isToasted() ? "    Yes\n" : "    No\n") +
                         "-----------------------------------------------------------------\n" +
                         "    -- Bread Type: " + sandwhiches.get(i).getBreadType() + "\n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Bread Size: " + sandwhiches.get(i).getSize() + "\n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Premium Toppings:" + "\n" +
                         "    -- Meats: " + "\n" + "             " + getMeat(i) + "\n" +
                         "    -- Cheese: " + "\n" + "             " + getCheeses(i) + "\n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Regular Toppings: " + "\n" + "             " + printRegularToppings(i) + "\n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Sauce: " + "\n" + "             " + printSauce(i) + "\n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Side" + "\n" + "             " + printSide(i) + "\n" +
                         "-----------------------------------------------------------------\n" +
                         "    -- Total: " + printTotal(i) + "\n" +
                         "-----------------------------------------------------------------\n\n");

        }

    }

    private static String printSide(int i) {
        List<RegularTopping> premiumToppings = sandwhiches.get(i).getRegularToppings();
        StringBuilder sides = new StringBuilder();
        int counter = 1;
        for(RegularTopping topping : premiumToppings){
            if (topping.getRegularTopping().getType().equals("side")){
                sides.append(topping.getRegularTopping().toString()).append(", ");
                if (counter == 5){
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

    private static String printSauce(int i) {
        List<RegularTopping> premiumToppings = sandwhiches.get(i).getRegularToppings();
        StringBuilder sauces = new StringBuilder();
        int counter = 1;
        for(RegularTopping topping : premiumToppings){
            if (topping.getRegularTopping().getType().equals("sauce")){
                sauces.append(topping.getRegularTopping().toString()).append(", ");
                if (counter == 5){
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
        totalSandwichCost += sandwhiches.get(i).calculateSandwichCost();
        return sandwhiches.get(i).calculateSandwichCost();

    }

    private static String printRegularToppings(int i) {
        List<RegularTopping> premiumToppings = sandwhiches.get(i).getRegularToppings();
        StringBuilder regular = new StringBuilder();
        int counter = 1;
        for(RegularTopping topping : premiumToppings){
            if (counter == 5){
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

    private static String getCheeses(int i) {
        List<PremiumTopping> premiumToppings = sandwhiches.get(i).getPremiumToppings();
        StringBuilder cheeses = new StringBuilder();
        int counter = 1;
        for(PremiumTopping topping : premiumToppings){
            if (topping.getPremiumTopping().getType().equals("cheese")){
                cheeses.append(topping.getPremiumTopping().toString()).append(", ");
                if (counter == 5){
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
                 if (counter == 5){
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

        System.out.println("--- REGULAR TOPPING ---");
        System.out.println("\n 1. Cucumber \n 2. Pepper \n 3. Onions \n 4. Lettuce \n 5. Tomatoes \n 6. Jalapenos" +
                "\n 7. Pickles \n 8. Guacamole \n 9. Mushrooms");
        String choice;
        int count = 0;
        do {
            System.out.print("\nAdd topping: ");
            choice = scanner.nextLine();
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
                    System.out.println("Please choice a valid option");
                    continue;
                }
            }
            if (count == 0) { System.out.print("Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(">> ");}

            String add = scanner.nextLine();
            if (!add.equalsIgnoreCase("")){
                System.out.println("\nInteresting choices, now choose the sauce!");
                getSauce(regularToppings);
                running = false;
            }
        }while (running) ;

        return regularToppings;
    }

    private static void getSauce(List<RegularTopping> regularToppings) {
        boolean running = true;
        System.out.println("-- SAUCE");
        System.out.println("\n 1. Mayo \n 2. Mustard \n 3. Ketchup \n 4. Ranch \n 5. Thousand Island " +
                "\n 6. Vinaigrette \n 7. Au Jus (side) \n 8. sauce (side)");
        String choice;
        int count = 0;

        do {
            System.out.print("\nAdd Sauce: ");
            choice = scanner.nextLine();
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
                    System.out.println("Please choice a valid option");
                    continue;
                }
            }

            if (count == 0) { System.out.print("Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(">> ");}

            String add = scanner.nextLine();
            if (!add.equalsIgnoreCase("")){
                System.out.print("\nLastly would you like the sandwich toasted? (y/n) ");
                String toasted = scanner.nextLine();
                isToasted = toasted.equalsIgnoreCase("y");
                System.out.println("\nAwesome selection!" +
                        "\nWould you like adding anything else?");
                running = false;
            }
        }while (running);

    }


    private static List<PremiumTopping> getPremiumToppings(BreadSize breadSize){
        boolean running = true;
        List<PremiumTopping> premiumToppings = new ArrayList<>();
        System.out.println("--- PREMIUM TOPPINGS ---");
        System.out.println("-- MEAT");

        System.out.println("\n 1. Steak \n 2. Ham \n 3. Salami \n 4. Roast Beef \n 5. Chicken \n 6. Bacon");
        String choice;
        int count = 0;
        do {
            System.out.print("\nAdd topping: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.STEAK, breadSize));
                case "2" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.HAM, breadSize));
                case "3" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.SALAMI, breadSize));
                case "4" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.ROAST_BEEF, breadSize));
                case "5" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.CHICKEN, breadSize));
                case "6" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.BACON, breadSize));
                default -> {
                    System.out.println("Please choice a valid option");
                    continue;
                }
            }
            if (count == 0) { System.out.print("Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(">> ");}

            String add = scanner.nextLine();
            if (!add.equalsIgnoreCase("")){
                System.out.println("\nInteresting choices, now choose the cheese!");
                running = false;
                getCheese(premiumToppings, breadSize);
            }
        }while (running);

        return premiumToppings;
    }

    private static void getCheese(List<PremiumTopping> premiumToppings, BreadSize breadSize){
        boolean running = true;
        System.out.println("-- CHEESE");
        System.out.println("\n 1. American \n 2. Provolone \n 3. Cheddar \n 4. Swiss");
        int count = 0;
        do {
            System.out.print("\nAdd Cheese: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.AMERICAN, breadSize));
                case "2" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.PROVOLONE, breadSize));
                case "3" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.CHEDDAR, breadSize));
                case "4" -> premiumToppings.add(new PremiumTopping(PremiumToppingName.SWISS, breadSize));
                default -> {
                    System.out.println("Please choice a valid option");
                    continue;
                }
            }
            if (count == 0) { System.out.print("Press <enter> to keep adding or / to stop adding >>  "); count++;}
            else if (count == 1) { System.out.print(">> ");}

            String add = scanner.nextLine();
            if (!add.equalsIgnoreCase("")){
                System.out.println("\nInteresting choices, now choose regular toppings!");
                running = false;
            }
        }while (running);

    }

    private static BreadTypes getBreadType() {
        System.out.println("\n--- BREAD TYPE ---");
        int count = 1;
        for (BreadTypes breadType : BreadTypes.values()){
            System.out.println( count + ". " + breadType);
            count++;
        }
        System.out.println();
        String choice = getChoice();
        BreadTypes breadTypes = null;
        switch (choice) {
            case "1" -> breadTypes = BreadTypes.WHITE;
            case "2" -> breadTypes = BreadTypes.WHEAT;
            case "3" -> breadTypes = BreadTypes.TYE;
            case "4" -> breadTypes = BreadTypes.WRAP;
            default -> System.out.println("Choice not available");
        }
        System.out.println("Nice! let's choose the size~");
        return breadTypes;
    }


    private static BreadSize getBreadSize() {
        System.out.println("--- BREAD SIZE ---");
        System.out.println("Select size: " + "\n1. 4 inch" + "\n2. 8 inch" + "\n3. 12 inch\n");
        String sizeChoice = getChoice();
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
