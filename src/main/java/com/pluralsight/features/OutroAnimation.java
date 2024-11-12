package com.pluralsight.features;

import com.pluralsight.order.SandwichOrder;
import com.pluralsight.screens.DELIcious;

import java.util.concurrent.TimeUnit;

public class OutroAnimation {

    public static void playOutro() throws InterruptedException {
        String[] frames = {
                        // 280 frames/ 3,144 lines of code: 7 hours of work, 4 hours of investigation and search online
                        // for ascii animation techniques....
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    o    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    o    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                //     ------------------------------ FULL ROTATION  ------------------------------
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    o    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    o    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // --------------------------     SECOND REVOLUTION   --------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    o    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    o    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // -----------------------------  THIRD REVOLUTION  ----------------------------
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    o    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    o    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // ------------------------------  FOURTH REV0LOTION ----------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    o    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",


                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    o    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // ---------------------------     FIFTH REVOLUTION ---------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    o    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    o    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // --------------------------- SIXTH REVOLUTION ------------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    o    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    o    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // --------------------------  SEVENTH REVOLUTION ---------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    o    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    .    .    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    o    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    o    _    _    _    _    _    _    _    _\n",

                //  ---------------------------- EIGHTH  REVOLUTION -----------------------------
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    o    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    o    _    _    _    _    _    _    _\n",

                //  ---------------------------- NINTH  REVOLUTION -----------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    o    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",


                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    o    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    o    _    _    _    _    _    _\n",

                // --------------------------    10th revolution   ------------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    o   _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",


                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    o    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    o    _    _    _    _    _\n",

                // -------------------------- 11th REVOLUTION ------------------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    o    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    o    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    o    _    _    _    _\n",

                // ---------------------        12th REVOLUTION              -----------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    o    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    o    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    o    _    _    _\n",

                // ------------------------ 13th REVOLUTION -----------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    o    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    o    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    o    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    o    _    _\n",

                // ------------------------------ REVOLUTION #? -------------------------------

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    o    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    o\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    o    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    o    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    o    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    o    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    o    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    o    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    o    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    o    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n" +
                        DELIcious.spacing + "o    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "|    .    .    .    .    .    .    .    .    |\n" +
                        DELIcious.spacing + "_    _    _    _    _    _    _    _    _    _\n",

                // FINALLY BACK FROM WHERE IT STARTED ??????????????????????

        };

        //Frames per second = 262 frames / 10 seconds (desired duration) = 26.2 frames per second
        // delay per frame = 1 / 26.2 ~ 0.038 milliseconds

        System.out.println(frames.length);
        Thread.sleep(5000);

        for (int i = 0; i < 3; i++){
            for (String frame : frames){
                System.out.println("\n\n\n\n\n" +frame);
                TimeUnit.MILLISECONDS.sleep(38);
                ClearScreen.clearConsole();
            }
        }
        //ClearScreen.clearConsole();

    }

}
