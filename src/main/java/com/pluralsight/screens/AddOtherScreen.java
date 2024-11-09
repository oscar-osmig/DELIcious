package com.pluralsight.screens;

import com.pluralsight.otherProducts.*;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddOtherScreen {
    static Scanner scanner = new Scanner(System.in);
    List<OtherProducts> otherProductsList = new ArrayList<>();
    static List<Drinks> drinksList = new ArrayList<>();
    static List<Chips> chipsList = new ArrayList<>();
    private static double drinksCost;

    private static String getChoice(String text){
        System.out.print(text);
        return scanner.nextLine();
    }

    static void addOtherProduct() {


    }

    static void addDrink(){
        boolean running = true;
        System.out.println("\n--- ORDER DRINK --- \n 1. Soda \n 2. Orange Juice \n 3. Back");
        do {
            String choice = getChoice("Your choice: ");
            switch (choice){
                case "1" -> addSoda();
                case "2" -> addJuice();
                case "3" -> {
                    running = false;
                    OrderScreen.channel();
                }
                default -> System.out.println("* Please choose available option *");

            }
        }while (running);

    }

    private static void addJuice() {
        boolean running = true;
        System.out.println( "\n-- Orange Juice Sizes -- \n 1. Small (S) \n 2. Medium (M) \n 3. Large (L) \n * <enter> 0 to get back * ");
        do {
            String choice = getChoice("Add Size: ");
            switch (choice){
                case "1" -> {
                    drinksList.add(new OrangeJuice("S"));
                    drinksCost += 1.5;
                }
                case "2" -> {
                    drinksList.add(new OrangeJuice("M"));
                    drinksCost += 1.5;
                }
                case "3" -> {
                    drinksList.add(new OrangeJuice("L"));
                    drinksCost += 1.5;
                }
                case "0" -> {
                    running = false;
                    printDrinks();
                    addDrink();
                }
            }
        }while (running);
    }

    private static void printDrinks() {
        System.out.println("------------ DRINKS ORDERED ------------");
        for (Drinks drink : drinksList){
            if (drink instanceof Soda){
                System.out.println("\nSoda: \n" +
                                   "    -- Name/Brand: " +((Soda) drink).getName() + "\n" +
                                   "    -- Size: " + ((Soda) drink).getSize() + "\n" +
                                   "    -- Flavor: " + ((Soda) drink).getFlavor() + "\n"  +
                                   "    -- Calories: " + ((Soda) drink).getCalories() + "\n" +
                                   "    -- Price: " + ((Soda) drink).getPrice() + "\n"
                );


            } else if (drink instanceof OrangeJuice) {
                System.out.println("Orange Juice: \n" +
                        "    -- Size: " + ((OrangeJuice) drink).getSize() + "\n" +
                        "    -- Price: 1.50 \n" );

            }
        }
        System.out.println("---- Drinks Cost: " + drinksCost + "\n");
    }

    static void addSoda(){
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
                    drinksCost += 2;
                }
                case "2" -> {
                    String size = getSodaSize();
                    drinksList.add(new Soda("Fanta", "Orange", 150, size));
                    drinksCost += 2.5;
                }
                case "3" -> {
                    String size = getSodaSize();
                    drinksList.add(new Soda("Pepsi", "Original", 180, size));
                    drinksCost += 3;
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

    static void addShips(){

    }
}
