package com.pluralsight.features;

import java.io.IOException;

public class ClearScreen {

    public static void clearConsole(){
        try {
            // For Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Unix-based systems (Linux/Mac)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
