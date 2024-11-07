package com.pluralsight.screens;

import java.util.Scanner;

public class OrderScreen {
    private static final Scanner scanner = new Scanner(System.in);
    public static void orderScreen(){
        System.out.println("""
                1. Add SandWhich\
                
                2. Add Drink\
                
                3. Add Chips\
                
                4. Checkout\
                
                0. Cancel Order""");
    }

    public static void channel(){
        System.out.println();
        orderScreen();
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> makeOrder();
            case "2", "3" -> addOtherProduct();
            case "4" -> checkOut();
            case "0" -> cancelOrder();
        }
    }

    private static void cancelOrder() {
        DELIcious.channel();
    }


    public static void addOtherProduct() {


    }


    public static void checkOut() {

    }


    public static void makeOrder() {

    }
}
