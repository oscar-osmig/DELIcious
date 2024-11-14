package com.pluralsight.features.effects;

public class Print {

    public static void print(String s, int speed) throws InterruptedException {

            char[] fromString = s.toCharArray();
            char[] var3 = fromString;
            int var4 = fromString.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                char c = var3[var5];
                System.out.print(c);
                Thread.sleep((long)speed);
            }

    }
}
