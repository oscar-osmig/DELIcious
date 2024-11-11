package com.pluralsight.screens;

import com.pluralsight.features.ClearScreen;
import com.pluralsight.order.ChipsOrder;
import com.pluralsight.order.Order;
import com.pluralsight.otherProducts.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChipsScreen {
    public static List<Chips> chipsList = new ArrayList<>();
    public static double chipsCost = 0;

    private static String getChoice(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }

    static void addShips() throws InterruptedException, IOException {
        ClearScreen.clearConsole();
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                  ORDER CHIPS                   *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "              Choose your preferred chips\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "              1. Sun Chips\n" +
                DELIcious.spacing + "              2. Doritos\n" +
                DELIcious.spacing + "              3. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");
        do {
            String choice = getChoice(DELIcious.spacing + "Your choice: ");
            switch (choice){
                case "1" -> addSunChips();
                case "2" -> addDoritos();
                case "3" -> {
                    OrderScreen.orders.add(new ChipsOrder(chipsList));
                    //System.out.println(OrderScreen.orders);
                    printChips(chipsList);
                    running = false;
                    OrderScreen.channel();
                }
                default -> System.out.println(DELIcious.spacing + "* Please choose available option *");

            }
        }while (running);

    }

    private static void addDoritos() throws InterruptedException, IOException {
        ClearScreen.clearConsole();
        boolean running = true;
        System.out.println( "\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*               DORITOS SIZES                    *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "               Choose your Doritos size:\n" +
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
                    chipsList.add(new Doritos("Doritos", "S"));
                }
                case "2" -> {
                    chipsList.add(new Doritos("Doritos", "M"));
                }
                case "3" -> {
                    chipsList.add(new Doritos("Doritos", "L"));
                }
                case "0" -> {
                    running = false;
                    //printChips(chipsList);
                    addShips();
                }
            }
        }while (running);
    }

    private static void addSunChips() throws InterruptedException, IOException {
        ClearScreen.clearConsole();
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                SUN CHIPS SIZES                  *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "               Choose your Sun Chips size:\n" +
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
                    chipsList.add(new SunChips("Sun Chips", "S"));
                }
                case "2" -> {
                    chipsList.add(new SunChips("Sun Chips", "M"));
                }
                case "3" -> {
                    chipsList.add(new SunChips("Sun Chips", "L"));
                }
                case "0" -> {
                    running = false;
                    //printChips(chipsList);
                    addShips();
                }
            }
        }while (running);
    }

    public static String chipReceipt = "";
    public static void printChips(List<Chips> chipsList){
        chipsCost = 0;
        String chipReceipt = "\n" + DELIcious.spacing + "------------ CHIPS ORDERED ------------\n";
        for (Chips chips : chipsList){
            if (chips instanceof SunChips){
                chipReceipt += "\n" + DELIcious.spacing + "Chips: \n" +
                        DELIcious.spacing + "    -- Name/Brand: " +((SunChips) chips).getName() + "\n" +
                        DELIcious.spacing + "    -- Size: " + ((SunChips) chips).getSize() + "\n" +
                        DELIcious.spacing + "    -- Price: 1.50\n";
                chipsCost += 1.5;


            } else if (chips instanceof Doritos) {
                chipReceipt += "\n" + DELIcious.spacing + "Chips: \n" +
                        DELIcious.spacing + "    -- Name/Brand: " +((Doritos) chips).getName() + "\n" +
                        DELIcious.spacing + "    -- Size: " + ((Doritos) chips).getSize() + "\n" +
                        DELIcious.spacing + "    -- Price: 1.50\n";
                chipsCost += 1.5;

            }

        }
        chipReceipt += "\n" + DELIcious.spacing + "---- CHIPS COST: " + chipsCost + "\n";
        System.out.println(chipReceipt);
    }
}
