package com.pluralsight.screens;

import com.pluralsight.order.GenerateReceipt;
import com.pluralsight.order.Order;

import java.util.Scanner;

public class CheckoutScreen {
    private static Scanner myScanner = new Scanner(System.in);

    private static String getChoice(String text){
        System.out.print(text);
        return myScanner.nextLine();
    }


    static void checkOut() {
        boolean running = true;
        Order order = new Order(SandwichScreen.sandwhiches, DrinksScreen.drinksList, ChipsScreen.chipsList);
        //System.out.println(order);
        if ((!SandwichScreen.sandwhiches.isEmpty() && !DrinksScreen.drinksList.isEmpty() && !ChipsScreen.chipsList.isEmpty())) {
            GenerateReceipt.generateReceipt(order);
            System.out.println("\nEnter 'Y' to confirm, 'N' to go back, and 0 to cancel order");

            do {
                String choice = getChoice("Confirm? ");
                switch (choice) {
                    case "Y", "y" -> {

                        System.out.println("Do you want to make a new order? (y/n)");
                        String answer = getChoice("Your Answer: ");
                        switch (answer) {
                            case "y", "Y" -> OrderScreen.channel();
                            case "N", "n" -> {
                                System.out.println("Good Bye");
                                return;
                            }
                            case "0", "o", "O" -> {
                                running = false;
                                OrderScreen.cancelOrder();
                            }
                            default -> System.out.println("* Please answer valid options *");
                        }
                    }
                }
            } while (running);
        }else {

            System.out.println("\n\n* No order has been made *");
            do {
                String startOrder = getChoice("Start order? (y/n) ");
                switch (startOrder){
                    case "y", "Y" -> {
                        OrderScreen.channel();
                    }
                    case "n", "N" -> {
                        return;
                    }
                    default -> System.out.println("\n *Please answer valid option *");
                }
            }while (running);


        }
    }


}
