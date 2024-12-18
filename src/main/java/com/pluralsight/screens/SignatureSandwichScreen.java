package com.pluralsight.screens;

import com.pluralsight.features.ClearScreen;
import com.pluralsight.sandwhich.BLTSandwhich;
import com.pluralsight.sandwhich.ChangeBLT;

import java.io.IOException;
import java.util.Scanner;

public class SignatureSandwichScreen {

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        System.out.print(q);
        q = scanner.nextLine();
        return q;
    }

    static void displaySignatureSandwich() {
        ClearScreen.clearConsole();
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
                DELIcious.spacing + "             0. 🔙  Back\n" +
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
                case "1" -> {
                    ClearScreen.clearConsole();
                    handleBLT();
                }
                case "2" -> {
                    ClearScreen.clearConsole();
                    handlePhilly();
                }
                case "0" -> {
                    ClearScreen.clearConsole();
                    DELIcious.channel();
                    System.exit(0);
                }
                default -> System.out.println(DELIcious.spacing + " * Please choose an available option *");
            }
        }while (true);

    }

    public static void handlePhilly() throws InterruptedException, IOException {
        System.out.println(
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "     It was around 600 lines to handle BLT :) \n" +
                DELIcious.spacing + "--------------------------------------------------\n");
                Thread.sleep(2000);
                SignatureSandwichScreen.displaySignatureSandwich();
    }

    public static BLTSandwhich bltSandwhich = new BLTSandwhich();
    public static void handleBLT() throws IOException, InterruptedException {
        ClearScreen.clearConsole();

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
                DELIcious.spacing + "             7. 🥪 Toasted\n" +
                DELIcious.spacing + "             8. ✅ Add to order\n" +
                DELIcious.spacing + "             0. 🚪  Exit\n\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                DELIcious.spacing + "**************************************************\n");
        System.out.println();
        ChangeBLT.askIfChangesBLT(bltSandwhich);
    }


}
