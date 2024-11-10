package com.pluralsight.screens;

import java.io.IOException;
import java.util.Scanner;

public class SignatureSandwichScreen {

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        q = scanner.nextLine();
        return q;
    }

    static void displaySignatureSandwich() {
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*               SIGNATURE SANDWICHES             *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "         Customize your order below:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥪  BLT \n" +
                DELIcious.spacing + "             2. 🥪  Philly Cheese Stake\n" +
                DELIcious.spacing + "             0. 🚪  Exit\n\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                DELIcious.spacing + "**************************************************\n");
                System.out.println();
    }

    public static void orderSignature() throws IOException, InterruptedException {
        displaySignatureSandwich();
        do {
            String choice = getAnswer(DELIcious.spacing + "Your choice: ");
            switch (choice){
                case "1" -> handleBLT();
                case "2" -> handlePhilly();
                case "0" -> {
                    DELIcious.channel();
                    System.exit(0);
                }
                default -> System.out.println(DELIcious.spacing + " * Please choose an available option *");
            }
        }while (true);

    }

    private static void handlePhilly() {
    }

    public static void handleBLT(){
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                  BLT SANDWICH                  *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "       Ingredients for this sandwich below:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥖 8 inch\n" +
                DELIcious.spacing + "             2. 🥓 Bacon\n" +
                DELIcious.spacing + "             3. 🧀 Cheddar\n" +
                DELIcious.spacing + "             4. 🥬 Lettuce\n" +
                DELIcious.spacing + "             5. 🍅 Tomatoes\n" +
                DELIcious.spacing + "             6. 🥗 Ranch\n" +
                DELIcious.spacing + "             7. 🥪 Toasted " +
                DELIcious.spacing + "             0. 🚪  Exit\n\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                DELIcious.spacing + "**************************************************\n");
        System.out.println();
        askIfChanges();
    }

    private static void askIfChanges() {
        String change = getAnswer(DELIcious.spacing + "Type the one you wish to change >>");
        do {
            switch (change){
                case "1" -> changeSize();
                case "2" -> changeMeat();
                case "3" -> changeCheese();
                case "4", "5", "6" -> changeRegularTopping();
                case "7" -> changeToasted();
                
            }
        }while (true);
    }

    private static void changeSize() {
    }

    private static void changeMeat() {
    }

    private static void changeCheese() {
    }

    private static void changeRegularTopping() {
    }

    private static void changeToasted() {
    }
}
