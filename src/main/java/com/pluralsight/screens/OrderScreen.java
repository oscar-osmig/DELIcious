package com.pluralsight.screens;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.BreadTypes;
import com.pluralsight.enums.PremiumToppings;
import com.pluralsight.enums.RegularToppings;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderScreen {
    private static final Scanner scanner = new Scanner(System.in);
    public static List<Sandwhich> sandwhiches = new ArrayList<>();
    private static boolean isToasted = false;
    public static void orderScreen(){
        System.out.println("--- ORDER SCREEN ---");
        System.out.println("""
                1. Add SandWhich\
                
                2. Add Drink\
                
                3. Add Chips\
                
                4. Checkout\
                
                0. Cancel Order\
                """);
        System.out.println();
    }

    public static void channel(){
        System.out.println();
        orderScreen();
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> makeSandwichOrder();
            case "2", "3" -> addOtherProduct();
            case "4" -> checkOut();
            case "0" -> cancelOrder();
        }
    }

    private static void checkOut() {
    }

    private static void addOtherProduct() {
    }


    private static String getChoice(){
        System.out.println("Your choice: ");
        return scanner.nextLine();
    }

    public static void makeSandwichOrder() {
       // Sandwhich sandwhich = new Sandwhich();


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
        System.out.println(sandwhiches);


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
                case "1" -> regularToppings.add(new RegularTopping(RegularToppings.CUCUMBERS));
                case "2" -> regularToppings.add(new RegularTopping(RegularToppings.PEPPERS));
                case "3" -> regularToppings.add(new RegularTopping(RegularToppings.ONIONS));
                case "4" -> regularToppings.add(new RegularTopping(RegularToppings.LETTUCE));
                case "5" -> regularToppings.add(new RegularTopping(RegularToppings.TOMATOES));
                case "6" -> regularToppings.add(new RegularTopping(RegularToppings.JALAPENOS));
                case "7" -> regularToppings.add(new RegularTopping(RegularToppings.PICKLES));
                case "8" -> regularToppings.add(new RegularTopping(RegularToppings.GUACAMOLE));
                case "9" -> regularToppings.add(new RegularTopping(RegularToppings.MUSHROOMS));
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
                case "1" -> regularToppings.add(new RegularTopping(RegularToppings.MAYO));
                case "2" -> regularToppings.add(new RegularTopping(RegularToppings.MUSTARD));
                case "3" -> regularToppings.add(new RegularTopping(RegularToppings.KETCHUP));
                case "4" -> regularToppings.add(new RegularTopping(RegularToppings.RANCH));
                case "5" -> regularToppings.add(new RegularTopping(RegularToppings.THOUSAND_ISLAND));
                case "6" -> regularToppings.add(new RegularTopping(RegularToppings.VINAIGRETTE));
                case "7" -> regularToppings.add(new RegularTopping(RegularToppings.AU_JUS));
                case "8" -> regularToppings.add(new RegularTopping(RegularToppings.SAUCE));
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
                System.out.println("\nAwesome we'll prepare your sandwich right away!");
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
                case "1" -> premiumToppings.add(new PremiumTopping(PremiumToppings.STEAK, breadSize));
                case "2" -> premiumToppings.add(new PremiumTopping(PremiumToppings.HAM, breadSize));
                case "3" -> premiumToppings.add(new PremiumTopping(PremiumToppings.SALAMI, breadSize));
                case "4" -> premiumToppings.add(new PremiumTopping(PremiumToppings.ROAST_BEEF, breadSize));
                case "5" -> premiumToppings.add(new PremiumTopping(PremiumToppings.CHICKEN, breadSize));
                case "6" -> premiumToppings.add(new PremiumTopping(PremiumToppings.BACON, breadSize));
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
                case "1" -> premiumToppings.add(new PremiumTopping(PremiumToppings.AMERICAN, breadSize));
                case "2" -> premiumToppings.add(new PremiumTopping(PremiumToppings.PROVOLONE, breadSize));
                case "3" -> premiumToppings.add(new PremiumTopping(PremiumToppings.CHEDDAR, breadSize));
                case "4" -> premiumToppings.add(new PremiumTopping(PremiumToppings.SWISS, breadSize));
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


    private static void cancelOrder() {
        DELIcious.channel();
    }


}
