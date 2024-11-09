package com.pluralsight.screens;

import com.pluralsight.order.GenerateReceipt;
import com.pluralsight.order.Order;
import com.pluralsight.otherProducts.Chips;
import com.pluralsight.otherProducts.Drinks;
import com.pluralsight.sandwhich.Sandwhich;

import java.util.List;
import java.util.Scanner;

public class CheckoutScreen {


    private static String getChoice(String text){
        Scanner myScanner = new Scanner(System.in);
        System.out.print(text);
        return myScanner.nextLine();
    }


    static void checkOut(List<Order> orders) throws InterruptedException {

        //System.out.println(order);
        if (!orders.isEmpty()) {
            GenerateReceipt.generateReceipt(orders);
            System.out.println("\nEnter 'Y' to confirm, 'N' to go back, and 0 to cancel order");
            boolean running = true;
            do {

                String choice = getChoice("Confirm? ");
                switch (choice) {
                    case "Y", "y" -> {
                            System.out.println("Do you want to make a new order? (y/n)");
                            String answer = getChoice("Your Answer: ");
                            switch (answer) {
                                case "y", "Y" -> OrderScreen.channel();
                                case "N", "n" -> {
                                    System.out.println("Good bye!");
                                    return;
                                }
                                case "0", "o", "O" -> {
                                    OrderScreen.cancelOrder();
                                }
                                default -> System.out.println("* Please answer valid options *");
                            }
                    }

                    case "n", "N" -> OrderScreen.channel();
                    case "0", "o", "O" -> {
                        Thread.sleep(5);
                        DELIcious.channel();
                    }
                    default -> System.out.println("\n * Please choose valid option * \n");
                }
            } while (true);

        }


            System.out.println("\n\n* No order has been made *");
            do {
                String startOrder = getChoice("Start order? (y/n) ");
                switch (startOrder){
                    case "y", "Y" -> {
                        OrderScreen.channel();
                    }
                    case "n", "N" -> {
                        Thread.sleep(5);
                        DELIcious.channel();
                        return;
                    }
                    default -> System.out.println("\n *Please answer valid option *");
                }
            }while (true);



    }


}
