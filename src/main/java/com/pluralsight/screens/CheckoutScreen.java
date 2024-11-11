package com.pluralsight.screens;

import com.pluralsight.features.ClearScreen;
import com.pluralsight.order.GenerateReceipt;
import com.pluralsight.order.Order;
import com.pluralsight.otherProducts.Chips;
import com.pluralsight.otherProducts.Drinks;
import com.pluralsight.sandwhich.Sandwhich;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CheckoutScreen {


    private static String getChoice(String text){
        Scanner myScanner = new Scanner(System.in);
        System.out.print(text);
        return myScanner.nextLine();
    }


    public static void checkOut(List<Order> orders) throws InterruptedException, IOException {
        ClearScreen.clearConsole();
        //System.out.println(order);
        if (!orders.isEmpty()) {
            GenerateReceipt.generateReceipt(orders);

        }


            System.out.println(DELIcious.spacing + "* No order has been made *");
            do {
                String startOrder = getChoice(DELIcious.spacing + "Start order? (y/n) ");
                switch (startOrder){
                    case "y", "Y" -> {
                        ClearScreen.clearConsole();
                        OrderScreen.channel();
                    }
                    case "n", "N" -> {
                        ClearScreen.clearConsole();
                        DELIcious.channel();
                        return;
                    }
                    default -> System.out.println("\n " + DELIcious.spacing + "* Please answer valid option *");
                }
            }while (true);



    }


}
