package com.pluralsight.order;

import com.pluralsight.otherProducts.Chips;
import com.pluralsight.otherProducts.Drinks;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.screens.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static com.pluralsight.screens.SandwichScreen.*;


public  class GenerateReceipt {

    private static String getChoice(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }

    public static double orderTotalCost = 0;
    // TODO: make printing receipt the same order(sandwiches, drinks, chips) no matter what
    static List<Sandwhich> sandwiches;
    static List<Drinks> drinks;
    static List<Chips> chips;
    static List<Integer> orderTheyCame = new ArrayList<>();
    public static void generateReceipt(List<Order> orders) throws InterruptedException {

        for (Order order : orders){
            if (order instanceof SandwichOrder){
                 sandwiches = ((SandwichOrder) order).sandwiches;
                //printSandwich(sandwiches);
                orderTotalCost += totalSandwichCost;
            }else if (order instanceof DrinksOrder){
                drinks = ((DrinksOrder) order).drinks;
                //DrinksScreen.printDrinks(drinks);
                orderTotalCost += DrinksScreen.drinksCost;
            } else if (order instanceof ChipsOrder) {
                chips = ((ChipsOrder) order).chips;
                //ChipsScreen.printChips(chips);
                orderTotalCost += ChipsScreen.chipsCost;
            }
        }

            printReceipt();

            if (orderTotalCost != 0) {
                System.out.println("\n         ---- TOTAL ORDER COST: " + orderTotalCost + " ----          ");
                System.out.println("\n             * RECEIPT HAS BEEN SAVE *        \n");

                System.out.println("\nEnter 'Y' to confirm, 'N' to go back, and 0 to cancel order");
                do {

                        String choice = getChoice("Confirm? ");
                        switch (choice) {
                            case "Y", "y" -> {
                                System.out.println("\n * RECEIPT HAS BEEN SAVE *\n");
                                System.out.println("\nDo you want to make a new order? (y/n)\n");
                                String answer = getChoice("Your Answer: ");
                                switch (answer) {
                                    case "y", "Y" -> OrderScreen.channel();
                                    case "N", "n" -> {
                                        Thread.sleep(5);
                                        DELIcious.channel();
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
                                return;
                            }
                            default -> System.out.println("\n * Please choose valid option * \n");
                        }
                    } while (true);


            }

    }

    public static void printReceipt(){
        if (sandwiches != null) {
            printSandwich(sandwiches);
        }
        if (drinks != null){
            DrinksScreen.printDrinks(drinks);
        }

        if (chips != null) {
            ChipsScreen.printChips(chips);
        }
    }

    public static void printSandwich(List<Sandwhich> sandwiches) {
        if (sandwiches != null){
            for (int i = 0; i < sandwiches.size(); i++){
                System.out.print("\n              ------         Sandwich " + (i+1) + "      ------             \n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Toasted: " + (sandwiches.get(i).isToasted() ? "    Yes\n" : "    No\n") +
                        "-----------------------------------------------------------------\n" +
                        "    -- Bread Type: " + sandwiches.get(i).getBreadType() + "\n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Bread Size: " + sandwiches.get(i).getSize() + "\n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Premium Toppings:" + "\n" +
                        "    -- Meats: " + "\n" + "             " + getMeat(i) + "\n" +
                        "    -- Cheese: " + "\n" + "             " + getCheeses(i) + "\n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Regular Toppings: " + "\n" + "             " + printRegularToppings(i) + "\n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Sauce: " + "\n" + "             " + printSauce(i) + "\n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Side" + "\n" + "             " + printSide(i) + "\n" +
                        "-----------------------------------------------------------------\n" +
                        "    -- Total: " + printTotal(i) + "\n" +
                        "-----------------------------------------------------------------\n\n");

                }

        }

    }
}
