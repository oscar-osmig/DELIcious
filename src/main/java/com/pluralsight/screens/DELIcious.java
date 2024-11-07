package com.pluralsight.screens;

import java.util.Scanner;

public class DELIcious{
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    public static void main(String[] args) {
        channel();
    }

    public static void channel(){
        do {
            homeScreenMenu();
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" -> {
                    running = false;
                    OrderScreen.channel();
                }
                case "2" -> running = false;
                default -> System.out.println("\nChoice not available");
            }
        }while(running);
    }

    private static void homeScreenMenu() {
        System.out.println("""
                
                1. New Order\
                
                2. Exit""");

    }

}