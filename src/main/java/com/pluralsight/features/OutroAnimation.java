package com.pluralsight.features;

import com.pluralsight.screens.DELIcious;

import java.util.concurrent.TimeUnit;

public class OutroAnimation {

    public static void playOutro() throws InterruptedException {
        String[] frames = {
                        // frame #1
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|o   .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+ // line 4
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n",

                // frame #2
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "| o  .    .    .    .    .    .    .    .    |\n"+ // line 5
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n",

                // frame #2
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|  o .    .    .    .    .    .    .    .    |\n"+ // line 6
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n",

                // frame #3
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    o    .    .    .    .    .    .    .    |\n"+ // line 7
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n",

                // frame #4
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .o   .    .    .    .    .    .    .    |\n"+ // line 9
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n",

                // frame #5
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    . o  .    .    .    .    .    .    .    |\n"+ // line 10
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n",

                // frame #6
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+ // line 9
                        DELIcious.spacing +         " _   _  o _    _    _    _    _    _    _   _\n",

                // frame #7
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .   o.    .    .    .    .    .    .    |\n"+ // line 8
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #8
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    o    .    .    .    .    .    .    |\n"+ // line 7
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #9
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .o   .    .    .    .    .    .    |\n"+ // line 6
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #10
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    . o  .    .    .    .    .    .    |\n"+ // line 5
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #11
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .  o .    .    .    .    .    .    |\n"+ // line 4
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #12
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .   o.    .    .    .    .    .    |\n"+ // line 3
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #13
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    o    .    .    .    .    .    |\n"+ // line 2
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #14
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .o   .    .    .    .    .    |\n"+ // line 1
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #14
                        DELIcious.spacing +         " _   _    _    _ o  _    _    _    _    _   _\n"+ // line 2
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",

                // frame #14
                        DELIcious.spacing +         " _   _    _    _    _    _    _    _    _   _\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+ // line 3
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         "|    .    .    .    .    .    .    .    .    |\n"+
                        DELIcious.spacing +         " _   _    _    _     _    _    _    _    _   _\n",










        };

        for (int i = 0; i < 1; i++){
            for (String frame : frames){
                System.out.println("\n\n\n\n\n" +frame);
                TimeUnit.MILLISECONDS.sleep(199);
                ClearScreen.clearConsole();
            }
        }
        //ClearScreen.clearConsole();

    }

}
