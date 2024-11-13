package com.pluralsight.features;

import com.pluralsight.screens.DELIcious;
import com.pluralsight.screens.LoginScreen;

import java.io.*;
import java.lang.ref.Cleaner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Login {

    public static boolean loggedInUser = false;
    public static boolean scannedCard = false;
    public static boolean skipped = false;
    public static boolean registered = false;
    public static boolean foundUserName = false;
    public static String[] loggedInUserDetails = new String[50];

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        System.out.print(q);
        return scanner.nextLine();
    }

    public static void login() throws IOException, InterruptedException {

        LoginScreen.loginScreen();
        boolean run = false;
        do {
            String answer = getAnswer("\n" + DELIcious.spacing + "Your answer: ");
            switch (answer){
                case "1" -> {
                    scannedCard = true;
                    // TODO: clear screen after moving to next screen ( ClearScreen.clearConsole)
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
                    ClearScreen.clearConsole();
                    DELIcious.channel();
                }
                case "0" -> {
                    run = false;
                    OutroAnimation.playOutro();
                    System.out.println("\n\n\n\n\n" +DELIcious.spacing + "Good Bye :)");
                    Thread.sleep(3000);
                    ClearScreen.clearConsole();
                    System.exit(0);
                }
            }
        }while (run);

    }
    public static String nameSpaceDifference = "";
    private static void registereNewCustomer() throws IOException, InterruptedException {
        //Osmig Torres|000001|not mad lad|infinite|2024-11-09:
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/pluralsight/customers/usernames.txt", true));

        do {
            String username = getAnswer(DELIcious.spacing + "Username: ");
            if (!username.isEmpty() && username.length() <= "osmig torres".length()){
                int usernameLength = username.length();
                int referenceLegtn = "osmig torres".length();
                int delta = referenceLegtn - usernameLength;
                    if (delta > 0){
                        for (int i = 0; i < delta; i++){
                            nameSpaceDifference += " ";
                        }
                    }

                List<String> askUserName = findUsername(username);
                if (askUserName != null){
                    ClearScreen.clearConsole();
                    System.out.println(DELIcious.spacing + "* username not available *");
                    // set array current user logged in
                    loggedInUserDetails = askUserName.get(0).split("\\|");
                }else {
                    String password = getAnswer(DELIcious.spacing + "Password: ");
                    // assign  6 digits id
                    int userID = GenerateID.generateUserId();
                    // give 10k point for making account
                    String points = "10000";
                    // get today's date
                    String todaysDate = String.valueOf(LocalDate.now());
                    // write to file
                    SaveToFile.saveCustomer(username, userID, password, points, todaysDate);
                    ClearScreen.clearConsole();
                    System.out.println("\n" + DELIcious.spacing + "Alright! let's get to the fun part!\n" +
                            DELIcious.spacing + "< Also you got 10k points >");
                    // set logging to true
                    Login.registered = true;
                    // set user = to the recent made user
                    user = username + nameSpaceDifference;
                    // direct to DELIcious board
                    DELIcious.channel();
                    System.exit(0);
                }

            }else {
                ClearScreen.clearConsole();
                int userLength = "osmig torres".length();
                System.out.println(DELIcious.spacing + "* username length should be less than " +
                        DELIcious.spacing + userLength + " chars long *");
            }

        }while (true);

    }


    public static String user = "";
    public static String[] foundUserDetails = new String[6];
    private static void askUsernamePassword() throws IOException, InterruptedException {

        do {
            String userName = getAnswer("\n" + DELIcious.spacing + "Username: ");
            List<String> USER = findUsername(userName);
            //System.out.println(USER);
            if (USER == null) {
                String makeAccount = getAnswer("\n" + DELIcious.spacing + "Username not found. \n"
                        + DELIcious.spacing + "Would like to make an account? (y/n)");
                if (makeAccount.equalsIgnoreCase("y")) {
                    registereNewCustomer();
                } else if (makeAccount.equalsIgnoreCase("n")){
                    skipped = true;
                    loggedInUser = false;
                    System.out.println("\n"+ DELIcious.spacing + "You've entered as guest!");
                    ClearScreen.clearConsole();
                    DELIcious.channel();
                    return;
                }
            }
//             System.out.println(Arrays.toString(foundUserDetails));
//                loggedInUserDetails = USER.get(9).split("\\|");
//                String[] userDetails = USER.get(9).split("\\|");
                if (foundUserDetails[0].equalsIgnoreCase(userName.trim())) {
                    user = foundUserDetails[0];
                    String passWord = getAnswer("\n" + DELIcious.spacing + "Password: ");
                    if (foundUserDetails[2].trim().equalsIgnoreCase(passWord)) {
                        loggedInUser = true;
                        user = foundUserDetails[0];
                        ClearScreen.clearConsole();
                        DELIcious.channel();
                        return;
                    } else {
                        System.out.println(DELIcious.spacing + "* Wrong username or password *");
                    }
                }

        }while (true);
    }
    // TODO: check this logic
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
            if (userRN[0].equals(userName)){
                foundUserDetails = userRN.clone();
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
                    ClearScreen.clearConsole();
                    DELIcious.channel();
                    return;
                }
            }else{
                System.out.println("\n" + DELIcious.spacing + "An Error occurred. \n"
                        + DELIcious.spacing + "* Please login or skip login *");
                ClearScreen.clearConsole();
                login();
                return;
            }
        }while (true);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        LogoAnimation.playLogo();
        login();
    }
}
