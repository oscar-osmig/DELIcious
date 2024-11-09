package com.pluralsight.order;

import com.pluralsight.screens.ChipsScreen;
import com.pluralsight.screens.DrinksScreen;
import com.pluralsight.screens.SandwichScreen;

import java.util.List;

public  class GenerateReceipt {
    public double orderTotalCost = 0;

    //TODO: layering like maiike thought me

    public static void generateReceipt(Order order){
        if (!SandwichScreen.sandwhiches.isEmpty() && !DrinksScreen.drinksList.isEmpty() && !ChipsScreen.chipsList.isEmpty()) {
            SandwichScreen.printSandwich(order.sandwhiches);
            DrinksScreen.printDrinks(order.drinksList);
            ChipsScreen.printChips(order.chipsList);
            System.out.println("\n    ---- ORDER TOTAL COST: " + (ChipsScreen.chipsCost + DrinksScreen.drinksCost + SandwichScreen.totalSandwichCost));
            System.out.println("\nReceipt has been filed!");
        } else if (!DrinksScreen.drinksList.isEmpty() && !ChipsScreen.chipsList.isEmpty()) {
            SandwichScreen.printSandwich(SandwichScreen.sandwhiches);
        } else {
            System.out.println("\nNo order has been made et");

        }


    }


}
