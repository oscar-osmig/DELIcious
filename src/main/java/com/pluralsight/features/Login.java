package com.pluralsight.features;

import com.pluralsight.screens.DELIcious;
import com.pluralsight.screens.LoginScreen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    public static boolean loggedInUser = false;
    public static boolean scannedCard = false;
    public static boolean skipped = false;
    public static boolean registered = false;

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        System.out.print(q);
        return scanner.nextLine();
    }

    public static void login() throws IOException, InterruptedException {

        LoginScreen.loginScreen();

        do {
            String answer = getAnswer("\n" + DELIcious.spacing + "Your answer: ");
            switch (answer){
                case "1" -> {
                    scannedCard = true;
                    scanCard();
                }
                case "2" -> {
                    loggedInUser = true;
                    askUsernamePassword();
                }
                case "3" -> {
                     registered = true;
                    registereNewCustomer();
                }
                case "4" -> {
                    DELIcious.channel();
                }
                case "0" -> {
                    return;
                }
            }
        }while (true);

    }

    private static void registereNewCustomer() {

    }
    public static String user = "";
    private static void askUsernamePassword() throws IOException, InterruptedException {
        do {
            String userName = getAnswer("\n" + DELIcious.spacing + "Username: ");
            List<String> USER = findUsername(userName);
            assert USER != null;
            String[] userDetails = USER.get(0).split("\\|");
            if (userDetails[0].equalsIgnoreCase(userName.trim())){
                user = userDetails[0];
                String passWord = getAnswer("\n" + DELIcious.spacing + "Password: ");
                if (userDetails[2].trim().equalsIgnoreCase(passWord)){
                    DELIcious.channel();
                    return;
                }
            }else{
               String makeAccount = getAnswer("\n" + DELIcious.spacing + "Username not found. \n"
                        + DELIcious.spacing + "Would like to make an account? (y/n)");
               if (makeAccount.equalsIgnoreCase("y")){
                   registereNewCustomer();
               }else{
                   skipped = true;
                   DELIcious.channel();
                   return;
               }
            }
        }while (true);
    }
    public static boolean foundUserName = false;
    public static List<String> findUsername(String userName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/pluralsight/customers/usernames.txt"));
        String lines;
        br.readLine();
        List<String> users = new ArrayList<>();
        while ((lines = br.readLine()) != null){
            lines = lines.replace(":", "");
            users.add(lines);

        }

        for(String user : users){
            String[] userRN = user.split("\\|");
            if (userRN[0].equalsIgnoreCase(userName)){
                return users;
            }
        }


//        System.out.println(users.getFirst());
        foundUserName = false;
        return null;
    }

    public static List<String> findID(String id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/pluralsight/customers/usernames.txt"));
        String lines;
        br.readLine();
        List<String> users = new ArrayList<>();
        while ((lines = br.readLine()) != null){
            lines = lines.replace(":", "");
            users.add(lines);

        }
        //System.out.println(users);
        for(String user : users){
            String[] userRN = user.split("\\|");
            if (userRN[1].equalsIgnoreCase(id)){
                return users;
            }
        }
        return null;
    }

    public static String userID = "";
    private static void scanCard() throws IOException, InterruptedException {
        do {
            String ID = getAnswer("\n" + DELIcious.spacing + "ID: ");
            List<String> USER = findID(ID);
            assert USER != null;


            if (USER != null){
                String[] userDetails = USER.get(0).split("\\|");
                if (userDetails[1].equalsIgnoreCase(ID.trim())) {
                    userID = userDetails[0];
                    user = userDetails[0];
                    loggedInUser = true;
                    DELIcious.channel();
                    return;
                }
            }else{
                System.out.println("\n" + DELIcious.spacing + "An Error occurred. \n"
                        + DELIcious.spacing + "* Please login or skip login *");
                skipped = true;
                login();
                return;
            }
        }while (true);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        login();
    }
}
