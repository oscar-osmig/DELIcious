package com.pluralsight.screens;

import java.util.Scanner;

public class DELIcious{

    private static boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        channel();
    }

    public static void channel() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        do {
            homeScreenMenu();
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" -> {
                    running = false;
                    OrderScreen.channel();
                }
                case "2" -> {
                    System.exit(0);
                }
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