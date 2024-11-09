package com.pluralsight.screens;

import java.util.Scanner;

public class OrderScreen {
    private static final Scanner scanner = new Scanner(System.in);

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
            case "1" -> SandwichScreen.makeSandwichOrder();
            case "2" -> AddOtherScreen.addDrink();
            case "3" -> AddOtherScreen.addShips();
            case "4" -> checkOut();
            case "0" -> cancelOrder();
        }
    }

    private static void checkOut() {
    }

    private static void cancelOrder() {
        DELIcious.channel();
    }


}
