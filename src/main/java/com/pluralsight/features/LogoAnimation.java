package com.pluralsight.features;

import com.pluralsight.screens.DELIcious;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LogoAnimation {

    public static void playLogo() throws InterruptedException, IOException {
        String[] frames = {
                DELIcious.spacing +         "o    .    .    .    .    .\n",
                DELIcious.spacing +         ".  o .    .    .    .    .\n",
                DELIcious.spacing +         ".    o    .    .    .    .\n",
                DELIcious.spacing +         ".    .  o .    .    .    .\n",
                DELIcious.spacing +         ".    .    o    .    .    .\n", // 5
                DELIcious.spacing +         ".    .    .  o .    .    .\n",
                DELIcious.spacing +         ".    .    .    o    .    .\n",
                DELIcious.spacing +         ".    .    .    .  o .    .\n",
                DELIcious.spacing +         ".    .    .    .    o    .\n",
                DELIcious.spacing +         ".    .    .    .    .  o .\n", //10
                DELIcious.spacing +         "|    .    .    .    .   o|\n",
                DELIcious.spacing +         "|    .    .    .    . o  .\n",
                DELIcious.spacing +         "|    .    .    .    o    .\n",
                DELIcious.spacing +         "|    .    .    . o  .    .\n",
                DELIcious.spacing +         "|    .    .    o    .    .\n", //15
                DELIcious.spacing +         "|    .    . o  .    .    .\n",
                DELIcious.spacing +         "|    .    o    .    .    .\n",
                DELIcious.spacing +         "|    . o  .    .    .    .\n",
                DELIcious.spacing +         "|    o    .    .    .    .\n",
                DELIcious.spacing +         "| o  .    .    .    .    .\n", //20
                DELIcious.spacing +         "|o   .    .    .    .    .\n",
                DELIcious.spacing +         "o    .    .    .    .    |\n",
                DELIcious.spacing +         ".  o .    .    .    .    |\n",
                DELIcious.spacing +         ".    o    .    .    .    |\n",
                DELIcious.spacing +         ".    .  o .    .    .    |\n", // 25
                DELIcious.spacing +         ".    .    o    .    .    |\n",
                DELIcious.spacing +         ".    .    .  o .    .    |\n",
                DELIcious.spacing +         ".    .    .    o    .    |\n",
                DELIcious.spacing +         ".    .    .    .  o .    |\n",
                DELIcious.spacing +         ".    .    .    .    o    |\n", //30
                DELIcious.spacing +         ".    .    .    .    .  o |\n",
                DELIcious.spacing +         "|    .    .    .    .   o|\n",
                DELIcious.spacing +         "|    .    .    .    . o  .\n",
                DELIcious.spacing +         "|    .    .    .    o    .\n",
                DELIcious.spacing +         "|    .    .    . o  .    .\n", //35
                DELIcious.spacing +         "|    .    .    o    .    .\n",
                DELIcious.spacing +         "|    .    . o  .    .    .\n",
                DELIcious.spacing +         "|    .    o    .    .    .\n",
                DELIcious.spacing +         "|    . o  .    .    .    .\n",
                DELIcious.spacing +         "|    o    .    .    .    .\n", //40
                DELIcious.spacing +         "| o  .    .    .    .    .\n",
                DELIcious.spacing +         "|o   .    .    .    .    .\n",



        };




        for (int i = 0; i < 1; i++){
            for (String frame : frames){
                System.out.println("\n\n\n\n\n" +frame);
                TimeUnit.MILLISECONDS.sleep(119);
                ClearScreen.clearConsole();
            }
        }
        ClearScreen.clearConsole();
        Login.login();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        playLogo();
//        OutroAnimation.playOutro();
    }
}
