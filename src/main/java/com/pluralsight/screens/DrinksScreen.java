package com.pluralsight.screens;

import com.pluralsight.features.ClearScreen;
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
        ClearScreen.clearConsole();
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                  ORDER DRINK                   *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "             Choose your drink:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥤 Soda\n" +
                DELIcious.spacing + "             2. 🍊 Orange Juice\n" +
                DELIcious.spacing + "             3. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");
        do {
            String choice = getChoice(DELIcious.spacing + "Your choice: ");
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
                default -> System.out.println(DELIcious.spacing + "* Please choose available option *");

            }
        }while (running);

    }

    private static void addJuice() throws InterruptedException, IOException {
        ClearScreen.clearConsole();
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*              ORANGE JUICE SIZES                *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "               Choose your Orange Juice size:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "              1. Small (S)\n" +
                DELIcious.spacing + "              2. Medium (M)\n" +
                DELIcious.spacing + "              3. Large (L)\n" +
                DELIcious.spacing + "              0. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "      Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");
        do {
            String choice = getChoice(DELIcious.spacing + "Add Size: ");
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
                default -> System.out.println(DELIcious.spacing + "* Please choose valid option *");
            }
        }while (running);
    }
    public static String drinkReceipt = "";
    public static void printDrinks(List<Drinks> drinksList) {
        ClearScreen.clearConsole();
        drinksCost = 0;
        drinkReceipt = "\n" + DELIcious.spacing + "------               DRINK ORDER              ------\n";
        for (Drinks drink : drinksList){
            if (drink instanceof Soda){
                drinkReceipt +=  "\n" + DELIcious.spacing + "Soda: \n" +
                        DELIcious.spacing + "    -- Name/Brand: " +((Soda) drink).getName() + "\n" +
                        DELIcious.spacing + "    -- Size: " + ((Soda) drink).getSize() + "\n" +
                        DELIcious.spacing + "    -- Flavor: " + ((Soda) drink).getFlavor() + "\n"  +
                        DELIcious.spacing + "    -- Calories: " + ((Soda) drink).getCalories() + "\n" +
                        DELIcious.spacing + "    -- Price: " +  ((Soda) drink).getPrice() + "\n";
                drinksCost += ((Soda) drink).getPrice();
            } else if (drink instanceof OrangeJuice) {
                drinkReceipt += "\n" + DELIcious.spacing + "Orange Juice: \n" +
                        DELIcious.spacing + "    -- Size: " + ((OrangeJuice) drink).getSize() + "\n" +
                        DELIcious.spacing + "    -- Flavor: orange?..." + "\n" +
                        DELIcious.spacing + "    -- Calories: 80 cal" + "\n" +
                        DELIcious.spacing + "    -- Price: " + ((OrangeJuice) drink).getPrice() + "\n";
                drinksCost += ((OrangeJuice) drink).getPrice();
            }

        }

        drinkReceipt += "\n" + DELIcious.spacing + "---- Drinks Cost: " + drinksCost + "\n";
        System.out.println(drinkReceipt);

    }



    static void addSoda() throws InterruptedException, IOException {
        ClearScreen.clearConsole();
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                  ORDER DRINK                   *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "             Choose your drink:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             Available sizes: S, M, L\n" +
                DELIcious.spacing + "       1. 🥤 Coke (Original flavor, 140 cal)\n" +
                DELIcious.spacing + "       2. 🍊 Fanta (Orange flavor, 150 cal)\n" +
                DELIcious.spacing + "       3. 🥤 Pepsi (Original flavor, 180 cal)\n" +
                DELIcious.spacing + "       0. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");
        do {
            String choice = getChoice(DELIcious.spacing + "Add Soda: ");
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
                default -> System.out.println(DELIcious.spacing + "* Please a soda in stock *");
            }
        }while (running);

    }


    public static String getSodaSize(){
        String getSize = getChoice(DELIcious.spacing + "Size? ");
        if (getSize.equalsIgnoreCase("S")){
            return "S";
        } else if (getSize.equalsIgnoreCase("M")) {
            return "M";
        } else if (getSize.equalsIgnoreCase("L")) {
            return "L";
        }else {
            System.out.println(DELIcious.spacing + "* Please choose right size * ");
            getSodaSize();
        }
        return "null";
    }

}
