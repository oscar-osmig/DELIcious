package com.pluralsight.sandwhich;

import com.pluralsight.screens.DELIcious;

import java.util.Scanner;

public class ChangeBLT {

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        q = scanner.nextLine();
        return q;
    }

    public static void askIfChangesBLT(BLTSandwhich bltSandwhich) {
        String change = getAnswer(DELIcious.spacing + "Type the one you wish to change >>");
        do {
            switch (change){
                case "1" -> changeSize(bltSandwhich);
                case "2" -> changeMeat(bltSandwhich);
                case "3" -> changeCheese(bltSandwhich);
                case "4", "5", "6" -> changeRegularTopping(bltSandwhich);
                case "7" -> changeToasted(bltSandwhich);
                default -> System.out.println(DELIcious.spacing + "* Please choose available options *");

            }
        }while (true);
    }

    private static void changeSize(BLTSandwhich bltSandwhich) {

    }

    private static void changeMeat(BLTSandwhich bltSandwhich) {
    }

    private static void changeCheese(BLTSandwhich bltSandwhich) {
    }

    private static void changeRegularTopping(BLTSandwhich bltSandwhich) {
    }

    private static void changeToasted(BLTSandwhich bltSandwhich) {
    }
}
