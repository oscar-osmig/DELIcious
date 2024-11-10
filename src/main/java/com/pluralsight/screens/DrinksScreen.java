package com.pluralsight.screens;

import com.pluralsight.order.DrinksOrder;
import com.pluralsight.order.Order;
import com.pluralsight.otherProducts.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DrinksScreen {
    public static List<Drinks> drinksList = new ArrayList<>();
    public static double drinksCost = 0;

    private static String getChoice(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }

    static void addDrink() throws InterruptedException, IOException {
        boolean running = true;
        System.out.println("\n--- ORDER DRINK --- \n 1. Soda \n 2. Orange Juice \n 3. Back");
        do {
            String choice = getChoice("Your choice: ");
            switch (choice){
                case "1" -> addSoda();
                case "2" -> addJuice();
                case "3" -> {
                    OrderScreen.orders.add(new DrinksOrder(drinksList));
                    //System.out.println(OrderScreen.orders);
                    printDrinks(drinksList);
                    running = false;
                    //System.out.println("Drinks total is: " + drinksCost);
                    OrderScreen.channel();
                }
                default -> System.out.println("* Please choose available option *");

            }
        }while (running);

    }

    private static void addJuice() throws InterruptedException, IOException {
        boolean running = true;
        System.out.println( "\n-- Orange Juice Sizes -- \n 1. Small (S) \n 2. Medium (M) \n 3. Large (L) \n * <enter> 0 to get back * ");
        do {
            String choice = getChoice("Add Size: ");
            switch (choice){
                case "1" -> {
                    drinksList.add(new OrangeJuice("S"));
                }
                case "2" -> {
                    drinksList.add(new OrangeJuice("M"));
                }
                case "3" -> {
                    drinksList.add(new OrangeJuice("L"));
                }
                case "0" -> {
                    running = false;
                    addDrink();
                }
                default -> System.out.println("* Please choose valid option *");
            }
        }while (running);
    }
    public static String drinkReceipt = "";
    public static void printDrinks(List<Drinks> drinksList) {
        drinksCost = 0;
        drinkReceipt = "\n------               DRINK ORDER              ------\n";
        for (Drinks drink : drinksList){
            if (drink instanceof Soda){
                drinkReceipt += "\nSoda: \n" +
                                   "    -- Name/Brand: " +((Soda) drink).getName() + "\n" +
                                   "    -- Size: " + ((Soda) drink).getSize() + "\n" +
                                   "    -- Flavor: " + ((Soda) drink).getFlavor() + "\n"  +
                                   "    -- Calories: " + ((Soda) drink).getCalories() + "\n" +
                                   "    -- Price: " +  ((Soda) drink).getPrice() + "\n";
                drinksCost += ((Soda) drink).getPrice();
            } else if (drink instanceof OrangeJuice) {
                drinkReceipt += "\nOrange Juice: \n" +
                        "    -- Size: " + ((OrangeJuice) drink).getSize() + "\n" +
                        "    -- Flavor: orange?..." + "\n" +
                        "    -- Calories: 80 cal" + "\n" +
                        "    -- Price: " + ((OrangeJuice) drink).getPrice() + "\n";
                drinksCost += ((OrangeJuice) drink).getPrice();
            }

        }

        drinkReceipt += "\n---- Drinks Cost: " + drinksCost + "\n";
        System.out.println(drinkReceipt);

    }



    static void addSoda() throws InterruptedException, IOException {
        boolean running = true;
        System.out.println("\n--- ORDER DRINK --- \n1. Coke (original flavor, 140 cal, S M L)" +
                "\n2. Fanta (orange flavor, 150 cal)" +
                "\n3. Pepsi (original flavor, 180 cal)" +
                "\n* <enter> 0 to get back * \n");
        do {
            String choice = getChoice("Add Soda: ");
            switch (choice){
                case "1" -> {
                    String size = getSodaSize();
                    drinksList.add(new Soda("Coke", "Original", 140, size));
                }
                case "2" -> {
                    String size = getSodaSize();
                    drinksList.add(new Soda("Fanta", "Orange", 150, size));
                }
                case "3" -> {
                    String size = getSodaSize();
                    drinksList.add(new Soda("Pepsi", "Original", 180, size));
                }
                case "0" -> {
                    running = false;
                    addDrink();
                }
                default -> System.out.println("* Please a soda in stock *");
            }
        }while (running);

    }


    public static String getSodaSize(){
        String getSize = getChoice("Size? ");
        if (getSize.equalsIgnoreCase("S")){
            return "S";
        } else if (getSize.equalsIgnoreCase("M")) {
            return "M";
        } else if (getSize.equalsIgnoreCase("L")) {
            return "L";
        }else {
            System.out.println("* Please choose right size * ");
            getSodaSize();
        }
        return "null";
    }

}
