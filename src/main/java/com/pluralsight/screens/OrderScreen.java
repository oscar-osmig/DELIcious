package com.pluralsight.screens;

import com.pluralsight.order.Order;
import com.pluralsight.otherProducts.Chips;
import com.pluralsight.otherProducts.Drinks;
import com.pluralsight.sandwhich.Sandwhich;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderScreen {
    public static List<Order>  orders = new ArrayList<>();
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

    public static void channel() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        orderScreen();
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> SandwichScreen.makeSandwichOrder();
            case "2" -> DrinksScreen.addDrink();
            case "3" -> ChipsScreen.addShips();
            case "4" -> {
                CheckoutScreen.checkOut(orders);
                System.exit(0);
            }
            case "0" -> {
                System.out.println("\n * Order cleared * \n");
                Thread.sleep(2);
                DELIcious.channel();
            }
        }
    }

    public static void cancelOrder() throws InterruptedException, IOException {
        DELIcious.channel();
    }


}
