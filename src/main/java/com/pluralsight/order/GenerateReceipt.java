package com.pluralsight.order;

import com.pluralsight.otherProducts.Chips;
import com.pluralsight.otherProducts.Drinks;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.screens.*;

import java.util.List;
import java.util.Scanner;


public  class GenerateReceipt {

    private static String getChoice(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }

    public static double orderTotalCost = 0;

    public static void generateReceipt(List<Order> orders) throws InterruptedException {
        for (Order order : orders){
            if (order instanceof SandwichOrder){
                System.out.println(((SandwichOrder) order).sandwiches);
            }else if (order instanceof DrinksOrder){
                System.out.println(((DrinksOrder) order).drinks);
            } else if (order instanceof ChipsOrder) {
                System.out.println(((ChipsOrder) order).chips);
            }
        }

            if (orderTotalCost != 0) {
                System.out.println("\n    ---- TOTAL ORDER COST: " + orderTotalCost);
                System.out.println("\n        * RECEIPT HAS BEEN SAVE *        \n");
                do {
                    String another = getChoice("Make another order? (y/n) ");
                    switch (another){
                        case "y", "Y" -> OrderScreen.channel();
                        case "n", "N" -> {
                            System.out.println("Good Bye");
                            System.exit(0);
                        }
                        default -> System.out.println("\n* Please answer valid choice *");
                    }
                }while (true);

            }


    }


}
