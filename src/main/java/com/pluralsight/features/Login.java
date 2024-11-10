package com.pluralsight.features;

import com.pluralsight.screens.CancelOrder;
import com.pluralsight.screens.DELIcious;
import com.pluralsight.screens.LoginScreen;

import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static boolean loggedInUser = false;
    public static boolean scannedCard = false;
    public static boolean skipped = false;

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void login() throws IOException, InterruptedException {

        LoginScreen.loginScreen();

        do {
            String answer = getAnswer("\n" + DELIcious.spacing + "Your answer: ");
            switch (answer){
                case "1" -> {
                    scanCard();
                }
                case "2" -> {
                    askUsernamePassword();
                }
                case "3" -> {

                    DELIcious.channel();
                }
                case "0" -> {
                    CancelOrder.cancel();
                    return;
                }
            }
        }while (true);

    }

    private static void askUsernamePassword() {
    }

    private static void scanCard() {
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        login();
    }
}
