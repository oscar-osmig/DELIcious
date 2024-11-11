package com.pluralsight.screens;

import com.pluralsight.order.CancelOrder;
import com.pluralsight.order.Order;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderScreen {
    public static List<Order>  orders = new ArrayList<>();
    public static void orderScreen(){
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                  ORDER SCREEN                  *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "         Customize your order below:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥪  Add Sandwich\n" +
                DELIcious.spacing + "             2. 🥤  Add Drink\n" +
                DELIcious.spacing + "             3. 🍟  Add Chips\n" +
                DELIcious.spacing + "             4. 💳  Checkout\n" +
                DELIcious.spacing + "             0. ❌  Cancel Order\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                DELIcious.spacing + "**************************************************\n");
        System.out.println();
    }

    public static void channel() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        orderScreen();
        System.out.print(DELIcious.spacing + "Your choice: ");
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
                CancelOrder.cancel();
                Thread.sleep(2);
                DELIcious.channel();
            }
        }
    }

}
