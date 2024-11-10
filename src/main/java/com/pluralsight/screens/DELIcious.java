package com.pluralsight.screens;

import com.pluralsight.features.Login;

import java.io.IOException;
import java.util.Scanner;

public class DELIcious{

    private static boolean running = true;

//    public static void main(String[] args) throws InterruptedException, IOException {
//        channel();
//    }

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
                case null -> displaySignatureSandwich();
                case "3" -> {
                    CancelOrder.cancel();
                    System.exit(0);
                }
                default -> System.out.println(spacing + "* Choice not available *");
            }
        }while(running);
    }

    private static void displaySignatureSandwich() {
    }

    private static void displayMenu() {
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
        if (Login.loggedInUser == true) {
            return "\n" +
                    spacing + "**************************************************\n" +
                    spacing + "*                                                *\n" +
                    spacing + "             WELCOME BACK " + user + "!               \n" +
                    spacing + "*                       TO                       *\n" +
                    spacing + "*               DELIcious SANDWICHES             *\n" +
                    spacing + "*                                                *\n" +
                    spacing + "**************************************************\n" +
                    spacing + "       Fresh Ingredients, Made Just for You!      \n" +
                    spacing + "--------------------------------------------------\n" ;

        }
            return "\n" +

                    spacing + "**************************************************\n" +
                    spacing + "*                                                *\n" +
                    spacing + "*          WELCOME TO DELIcious SANDWICHES       *\n" +
                    spacing + "*                                                *\n" +
                    spacing + "**************************************************\n" +
                    spacing + "       Fresh Ingredients, Made Just for You!      \n" +
                    spacing + "--------------------------------------------------\n" ;



    }

}