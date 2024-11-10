package com.pluralsight.features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GenerateOrderID {



        public static String generateOrderId() {
            return UUID.randomUUID().toString();
        }
    // doesn't require any tracking of previous assigned id
    public static void main(String[] args) throws IOException {
        String id = generateOrderId();
        System.out.println(id);
    }
}
