package com.pluralsight.screens;

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
        boolean running = true;
        System.out.println("\n--- ORDER CHIPS --- \n 1. Sun Chips \n 2. Doritos \n 3. Back");
        do {
            String choice = getChoice("Your choice: ");
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
                default -> System.out.println("* Please choose available option *");

            }
        }while (running);

    }

    private static void addDoritos() throws InterruptedException, IOException {
        boolean running = true;
        System.out.println( "\n-- Doritos Sizes -- \n 1. Small (S) \n 2. Medium (M) \n 3. Large (L) \n * <enter> 0 to get back * ");
        do {
            String choice = getChoice("Add Size: ");
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
        boolean running = true;
        System.out.println( "\n-- Sun Chips Sizes -- \n 1. Small (S) \n 2. Medium (M) \n 3. Large (L) \n * <enter> 0 to get back * ");
        do {
            String choice = getChoice("Add Size: ");
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
        String chipReceipt = "\n------------ CHIPS ORDERED ------------\n";
        for (Chips chips : chipsList){
            if (chips instanceof SunChips){
                chipReceipt += "\nChips: \n" +
                        "    -- Name/Brand: " +((SunChips) chips).getName() + "\n" +
                        "    -- Size: " + ((SunChips) chips).getSize() + "\n" +
                        "    -- Price: 1.50\n";
                chipsCost += 1.5;


            } else if (chips instanceof Doritos) {
                chipReceipt += "\nChips: \n" +
                        "    -- Name/Brand: " +((Doritos) chips).getName() + "\n" +
                        "    -- Size: " + ((Doritos) chips).getSize() + "\n" +
                        "    -- Price: 1.50\n";
                chipsCost += 1.5;

            }

        }
        chipReceipt += "\n---- CHIPS COST: " + chipsCost + "\n";
        System.out.println(chipReceipt);
    }
}
