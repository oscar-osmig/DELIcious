package com.pluralsight.screens;

import com.pluralsight.order.GenerateReceipt;

import java.io.IOException;

public class CancelOrder {

    public static void cancel() throws InterruptedException, IOException {
        // Sandwich Screen data
        SandwichScreen.sandwhiches.clear();
        SandwichScreen.isToasted = false;
        SandwichScreen.totalSandwichCost = 0;

        // Drinks Screen data
        DrinksScreen.drinksList.clear();
        DrinksScreen.drinksCost = 0;
        DrinksScreen.drinkReceipt = "";

        // Chips Screen data
        ChipsScreen.chipsList.clear();
        ChipsScreen.chipsCost = 0;
        ChipsScreen.chipReceipt = "";

        // Generate receipt data
        GenerateReceipt.orderTotalCost = 0;
        GenerateReceipt.customerName = "";
        GenerateReceipt.orderID = "";
        GenerateReceipt.sandwichReceipt= "";
        GenerateReceipt.totalCostReceipt = "";
        GenerateReceipt.delicious = "";
        GenerateReceipt.chipReceipt = "";
        GenerateReceipt.drinkReceipt = "";

        // Checkout Screen data

        // Order Screen
        OrderScreen.orders.clear();

        System.out.println(" * Order has been clear *");
        Thread.sleep(5);
        DELIcious.channel();

    }
}
