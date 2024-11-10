package com.pluralsight.order;

import com.pluralsight.features.GenerateOrderID;
import com.pluralsight.features.SaveReceiptToFile;
import com.pluralsight.otherProducts.*;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.screens.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static com.pluralsight.screens.SandwichScreen.*;


public  class GenerateReceipt {
    public static String customerName;
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
    public static String sandwichReceipt = "";
    public static String totalCostReceipt = "";
    public static void generateReceipt(List<Order> orders) throws InterruptedException, IOException {

        for (Order order : orders){
            if (order instanceof SandwichOrder){
                 sandwiches = ((SandwichOrder) order).sandwiches;
                //printSandwich(sandwiches);
                orderTotalCost += totalSandwichCost;
                System.out.println(orderTotalCost);
            }else if (order instanceof DrinksOrder){
                drinks = ((DrinksOrder) order).drinks;
                //DrinksScreen.printDrinks(drinks);
                orderTotalCost += DrinksScreen.drinksCost;
                System.out.println(orderTotalCost);
            } else if (order instanceof ChipsOrder) {
                chips = ((ChipsOrder) order).chips;
                //ChipsScreen.printChips(chips);
                orderTotalCost += ChipsScreen.chipsCost;
                System.out.println(orderTotalCost);

            }
        }
            printReceipt();

            if (orderTotalCost != 0) {
                totalCostReceipt += lineDivider +
                        "                TOTAL ORDER COST\n" +
                        lineDivider +
                        "                Subtotal:        $" + orderTotalCost + "\n" +
                        "                Tax (0%):        $0 (included)\n" +
                        lineDivider +
                        "                GRAND TOTAL:     $" + orderTotalCost + "\n" +
                        lineDivider +
                        " Thank you for dining with DELIcious Sandwiches!!\n" +
                        "===================================================\n";
                System.out.println(totalCostReceipt);
                customerName = getChoice("\nLastly, what's your name: ");

                System.out.println("\nEnter 'Y' to confirm, 'N' to go back, and 0 to cancel order");
                do {
                        String choice = getChoice("Confirm? ");
                        switch (choice) {
                            case "Y", "y" -> {
                                System.out.println("\n             * RECEIPT HAS BEEN SAVE *        \n");
                                String delicious = receiptBanner();
                                SaveReceiptToFile.saveReceipt(
                                        customerName+",\n" + delicious + ",\n" + sandwichReceipt + drinkReceipt + chipReceipt + totalCostReceipt);
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

    public static void printReceipt() throws IOException {
        if (sandwiches != null) {
            printSandwich(sandwiches);
        }
        if (drinks != null){
            printDrinks(drinks);
        }

        if (chips != null) {
            printChips(chips);
        }
    }
    public static String chipReceipt = "";
    public static void printChips(List<Chips> chipsList){
        ChipsScreen.chipsCost = 0;
        chipReceipt = "\n------               SHIPS ORDER             ------\n";
        for (Chips chips : chipsList){
            if (chips instanceof SunChips){
                chipReceipt += "    -- Chips: \n" +
                        lineDivider +
                        "        -- Name/Brand: " +((SunChips) chips).getName() + "\n" +
                        lineDivider +
                        "        -- Size: " + ((SunChips) chips).getSize() + "\n" +
                        lineDivider +
                        "        -- Price: 1.50\n" +
                        lineDivider;
                ChipsScreen.chipsCost = 1.5;

            } else if (chips instanceof Doritos) {
                chipReceipt += "\n    -- Chips: \n" +
                        lineDivider +
                        "        -- Name/Brand: " +((Doritos) chips).getName() + "\n" +
                        lineDivider +
                        "        -- Size: " + ((Doritos) chips).getSize() + "\n" +
                        lineDivider+
                        "        -- Price: 1.50\n" +
                        lineDivider;
                ChipsScreen.chipsCost = 1.5;
            }

        }
        System.out.println(chipReceipt);
        chipReceipt += "    ---- CHIPS COST: " + ChipsScreen.chipsCost + "\n\n";


    }

    public static String drinkReceipt = "";
    public static void printDrinks(List<Drinks> drinksList) {
        DrinksScreen.drinksCost = 0;
        drinkReceipt += "------               DRINK ORDER             ------\n";
        for (Drinks drink : drinksList){
            if (drink instanceof Soda){
                drinkReceipt +=
                        "    -- Soda\n" +
                        lineDivider +
                        "    -- Name/Brand:    " +((Soda) drink).getName() + "\n" +
                        lineDivider +
                        "    -- Size:          " + ((Soda) drink).getSize() + "\n" +
                        lineDivider +
                        "    -- Flavor:        " + ((Soda) drink).getFlavor() + "\n" +
                        lineDivider +
                        "    -- Calories:      " + ((Soda) drink).getCalories() + "\n" +
                        lineDivider +
                        "    -- Price:         " + ((Soda) drink).getPrice() + "\n" +
                        lineDivider;
                DrinksScreen.drinksCost += ((Soda) drink).getPrice();
            } else if (drink instanceof OrangeJuice) {
                drinkReceipt += "    -- Orange Juice    \n" +
                        lineDivider +
                        "    -- Size:          " + ((OrangeJuice) drink).getSize() + "\n" +
                        lineDivider +
                        "    -- Flavor:        Orange? ..." + "\n" +
                        lineDivider +
                        "    -- Calories:      80 cal" + "\n" +
                        lineDivider +
                        "    -- Price:         " + ((OrangeJuice) drink).getPrice() + "\n" +
                        lineDivider;
                DrinksScreen.drinksCost += ((OrangeJuice) drink).getPrice();
            }

        }
        System.out.println(drinkReceipt);
        drinkReceipt += "    ---- Drinks Cost: " + DrinksScreen.drinksCost + "\n\n";

    }

    public static String date = String.valueOf(LocalDate.now());
    public static String delicious = "";
    public static String orderID = "";
    public static String receiptBanner() throws IOException {
        orderID = GenerateOrderID.generateOrderId();
//        orderID =  GenerateOrderID.generateOrderId();
        delicious = "\n===================================================\n" +
                "                  DELIcious     \n" +
                "                 Customer Receipt\n" +
                "===================================================\n\n" +
                ", Date: " + date + "\n" +
                ",Order ID " + orderID + "\n\n" ;
        //System.out.println(orderID);
        return delicious;
    }

    public static String lineDivider = "---------------------------------------------------\n";
    public static void printSandwich(List<Sandwhich> sandwiches) throws IOException {
        sandwichReceipt = "";
        if (sandwiches != null){
            for (int i = 0; i < sandwiches.size(); i++){
                sandwichReceipt +=
                        lineDivider +
                        "                 SANDWICHES ORDERED\n" +
                        lineDivider + "\n" +
                        "------               Sandwich " + (i+1) + "              ------\n" +
                        lineDivider +
                        "    -- Toasted:          " + (sandwiches.get(i).isToasted() ? "Yes \n" : "No \n") +
                        lineDivider +
                        "    -- Bread Type:       " + sandwiches.get(i).getBreadType() + "\n" +
                        lineDivider +
                        "    -- Bread Size:       " + sandwiches.get(i).getSize() + "\n" +
                        lineDivider +
                        "    -- Premium Toppings: \n" +
                        "       - Meats:          " + "\n" + "             " + getMeat(i) + "\n" +
                        "       - Cheese:         " + "\n" + "             " + getCheeses(i) + "\n" +
                        lineDivider +
                        "    -- Regular Toppings:\n" + "             " + printRegularToppings(i) + "\n" +
                        lineDivider +
                        "    -- Sauce:            " + "\n" + "             " + printSauce(i) + "\n" +
                        lineDivider +
                        "    -- Side:             " + "             " + printSide(i) + "\n" +
                        lineDivider +
                        "     -- Total:            $" + printTotal(i) + "\n" +
                        lineDivider + "\n";
                System.out.println(sandwichReceipt);
                }

        }

    }
}
