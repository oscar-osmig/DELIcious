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
    public static String customerName = "";

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
                //System.out.println(orderTotalCost);
            }else if (order instanceof DrinksOrder){
                drinks = ((DrinksOrder) order).drinks;
                //DrinksScreen.printDrinks(drinks);
                orderTotalCost += DrinksScreen.drinksCost;
                //System.out.println(orderTotalCost);
            } else if (order instanceof ChipsOrder) {
                chips = ((ChipsOrder) order).chips;
                //ChipsScreen.printChips(chips);
                orderTotalCost += ChipsScreen.chipsCost;
                //System.out.println(orderTotalCost);

            }
        }
            printReceipt();

            if (orderTotalCost != 0) {
                totalCostReceipt += DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "                TOTAL ORDER COST\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "                Subtotal:        $" + orderTotalCost + "\n" +
                        DELIcious.spacing + "                Tax (0%):        $0 (included)\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "                GRAND TOTAL:     $" + orderTotalCost + "\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + " Thank you for dining with DELIcious Sandwiches!!\n" +
                        DELIcious.spacing + "===================================================\n";
                        System.out.println(totalCostReceipt);
                customerName = getChoice("\n" + DELIcious.spacing + "Lastly, what's your name: ");

                System.out.println("\n" + DELIcious.spacing + "Enter 'Y' to confirm, 'N' to go back, and 0 to cancel order");
                do {
                        String choice = getChoice(DELIcious.spacing + "Confirm? ");
                        switch (choice) {
                            case "Y", "y" -> {
                                System.out.println("\n" + DELIcious.spacing + "             * RECEIPT HAS BEEN SAVE *        \n");
                                String delicious = receiptBanner();
                                SaveReceiptToFile.saveReceipt(
                                        customerName+",\n" + delicious + ",\n" + sandwichReceipt + drinkReceipt + chipReceipt + totalCostReceipt);
                                System.out.println("\n" + DELIcious.spacing + "Do you want to make a new order? (y/n)\n");
                                String answer = getChoice(DELIcious.spacing + "Your Answer: ");
                                switch (answer) {
                                    case "y", "Y" -> OrderScreen.channel();
                                    case "N", "n" -> {
                                        Thread.sleep(5);
                                        DELIcious.channel();
                                        return;
                                    }
                                    case "0", "o", "O" -> {
                                        CancelOrder.cancel();
                                    }
                                    default -> System.out.println(DELIcious.spacing + "* Please answer valid options *");
                                }
                            }

                            case "n", "N" -> OrderScreen.channel();
                            case "0", "o", "O" -> {
                                Thread.sleep(5);
                                CancelOrder.cancel();
                                return;
                            }
                            default -> System.out.println("\n" + DELIcious.spacing +  "* Please choose valid option * \n");
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
        chipReceipt = "\n" + DELIcious.spacing +  "------               SHIPS ORDER             ------\n";
        for (Chips chips : chipsList){
            if (chips instanceof SunChips){
                chipReceipt += DELIcious.spacing + "    -- Chips: \n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "        -- Name/Brand: " +((SunChips) chips).getName() + "\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "        -- Size: " + ((SunChips) chips).getSize() + "\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "        -- Price: 1.50\n" +
                        DELIcious.spacing + lineDivider;
                ChipsScreen.chipsCost = 1.5;

            } else if (chips instanceof Doritos) {
                chipReceipt += "\n" + DELIcious.spacing + "    -- Chips: \n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "        -- Name/Brand: " +((Doritos) chips).getName() + "\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "        -- Size: " + ((Doritos) chips).getSize() + "\n" +
                        DELIcious.spacing + lineDivider +
                        DELIcious.spacing + "        -- Price: 1.50\n" +
                        DELIcious.spacing + lineDivider;
                ChipsScreen.chipsCost = 1.5;
            }

        }
        System.out.println(chipReceipt);
        chipReceipt += DELIcious.spacing + "    ---- CHIPS COST: " + ChipsScreen.chipsCost + "\n\n";


    }

    public static String drinkReceipt = "";
    public static void printDrinks(List<Drinks> drinksList) {
        DrinksScreen.drinksCost = 0;
        drinkReceipt += DELIcious.spacing + "------               DRINK ORDER             ------\n";
        for (Drinks drink : drinksList){
            if (drink instanceof Soda){
                drinkReceipt +=
                                DELIcious.spacing + "    -- Soda\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Name/Brand:    " +((Soda) drink).getName() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Size:          " + ((Soda) drink).getSize() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Flavor:        " + ((Soda) drink).getFlavor() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Calories:      " + ((Soda) drink).getCalories() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Price:         " + ((Soda) drink).getPrice() + "\n" +
                                DELIcious.spacing + lineDivider;
                DrinksScreen.drinksCost += ((Soda) drink).getPrice();
            } else if (drink instanceof OrangeJuice) {
                drinkReceipt += DELIcious.spacing + "    -- Orange Juice    \n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Size:          " + ((OrangeJuice) drink).getSize() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Flavor:        Orange? ..." + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Calories:      80 cal" + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Price:         " + ((OrangeJuice) drink).getPrice() + "\n" +
                                DELIcious.spacing + lineDivider;
                DrinksScreen.drinksCost += ((OrangeJuice) drink).getPrice();
            }

        }
        System.out.println(drinkReceipt);
        drinkReceipt += DELIcious.spacing + "    ---- Drinks Cost: " + DrinksScreen.drinksCost + "\n\n";

    }

    public static String date = String.valueOf(LocalDate.now());
    public static String delicious = "";
    public static String orderID = "";
    public static String receiptBanner() throws IOException {
        orderID = GenerateOrderID.generateOrderId();
//        orderID =  GenerateOrderID.generateOrderId();
        delicious = "\n" + DELIcious.spacing + "===================================================\n" +
                           DELIcious.spacing + "                  DELIcious     \n" +
                           DELIcious.spacing + "                 Customer Receipt\n" +
                           DELIcious.spacing + "===================================================\n\n" +
                           DELIcious.spacing + ", Date: " + date + "\n" +
                           DELIcious.spacing + ",Order ID " + orderID + "\n\n" ;
        //System.out.println(orderID);
        return delicious;
    }

    public static String lineDivider = "---------------------------------------------------\n";
    public static void printSandwich(List<Sandwhich> sandwiches) throws IOException {
        sandwichReceipt = "";
        if (sandwiches != null){
            for (int i = 0; i < sandwiches.size(); i++){
                sandwichReceipt +=
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "                 SANDWICHES ORDERED\n" +
                                DELIcious.spacing + lineDivider + "\n" +
                                DELIcious.spacing + "------               Sandwich " + (i+1) + "              ------\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Toasted:          " + (sandwiches.get(i).isToasted() ? "Yes \n" : "No \n") +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Bread Type:       " + sandwiches.get(i).getBreadType() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Bread Size:       " + sandwiches.get(i).getSize() + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Premium Toppings: \n" +
                                DELIcious.spacing + "       - Meats:          " + "\n" + DELIcious.spacing + "             " + getMeat(i) + "\n" +
                                DELIcious.spacing + "       - Cheese:         " + "\n" +  DELIcious.spacing + "             " + getCheeses(i) + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Regular Toppings:\n" + DELIcious.spacing + "             " + printRegularToppings(i) + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Sauce:            " + "\n" + DELIcious.spacing  + "             " + printSauce(i) + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "    -- Side:             " + "             " + printSide(i) + "\n" +
                                DELIcious.spacing + lineDivider +
                                DELIcious.spacing + "     -- Total:            $" + printTotal(i) + "\n" +
                                DELIcious.spacing + lineDivider + "\n";
                System.out.println(sandwichReceipt);
                }

        }

    }
}
