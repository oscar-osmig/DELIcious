package com.pluralsight.screens;

import com.pluralsight.features.Login;
import com.pluralsight.sandwhich.ChangeBLT;

import java.io.IOException;
import java.util.Scanner;

public class DELIcious{

    private static boolean running = true;

    private static String getChoice(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine();
    }

    public static void channel() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        do {
            homeScreenMenu();
            System.out.print(spacing+ "Your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "0" -> displayMenu();
                case "1" -> {
                    running = false;
                    OrderScreen.channel();
                }
                case "2" -> SignatureSandwichScreen.orderSignature();
                case "3" -> {
                    Login.login();
                    System.exit(0);
                }
                default -> System.out.println(spacing + "* Choice not available *");
            }
        }while(running);
    }

    private static void displayMenu() throws IOException, InterruptedException {

        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "                   MAIN MENU" +
                DELIcious.spacing + "--------------------------------------------------\n\n" +

                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                1. BLT SANDWICH                 *\n" +
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
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                DELIcious.spacing + "**************************************************\n\n"+

                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*             2. PHILLY CHEESE STAKE             *\n" +
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
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "             Enter 0 to get back\n" +
                DELIcious.spacing + "**************************************************\n"
        );
        running = true;
        do {
            String choice = getChoice(spacing + "Your choice >> ");
            switch (choice){
                case "1" -> SignatureSandwichScreen.handleBLT();
                case "2" -> SignatureSandwichScreen.handlePhilly();
                case "0" -> DELIcious.channel();
                default -> System.out.println(spacing + "* please choose available option *");
            }
        }while (running);

    }

    public static String spacing = "                                                         ";
    private static void homeScreenMenu() {
        String welcome = welcomeSign();
        System.out.println( welcome +
                "\n" +
                spacing + "         Please select an option below:\n" +
                "\n" +
                spacing + "             0. 🍽️  [MAIN MENU]\n" +
                spacing + "             1. 🍽️  New Order\n" +
                spacing + "             2. 🍽️  Signature\n" +
                spacing + "             3. 🚪  Exit\n" +
                "\n" +
                spacing + "--------------------------------------------------\n" +
                spacing + "   Enter your choice and press Enter to continue\n" +
                spacing + "**************************************************\n");

    }

    public static String welcomeSign(){
        String user = Login.user;
        if (Login.loggedInUser == true || Login.registered == true) {
            return "\n" +
                    spacing + "**************************************************\n" +
                    spacing + "*                                                *\n" +
                    spacing + "*               WELCOME BACK " + user + "        *\n" +
                    spacing + "*                       TO                       *\n" +
                    spacing + "*               DELIcious SANDWICHES             *\n" +
                    spacing + "*                                                *\n" +
                    spacing + "**************************************************\n" +
                    spacing + "       Fresh Ingredients, Made Just for You!      \n" +
                    spacing + "--------------------------------------------------\n" ;

        }
            if (Login.skipped) {
                return "\n" +

                        spacing + "**************************************************\n" +
                        spacing + "*                                                *\n" +
                        spacing + "*          WELCOME TO DELIcious SANDWICHES       *\n" +
                        spacing + "*                                                *\n" +
                        spacing + "**************************************************\n" +
                        spacing + "       Fresh Ingredients, Made Just for You!      \n" +
                        spacing + "--------------------------------------------------\n";

            }

            return "\n" +

                spacing + "**************************************************\n" +
                spacing + "*                                                *\n" +
                spacing + "*          WELCOME TO DELIcious SANDWICHES       *\n" +
                spacing + "*                                                *\n" +
                spacing + "**************************************************\n" +
                spacing + "       Fresh Ingredients, Made Just for You!      \n" +
                spacing + "--------------------------------------------------\n";
    }

}