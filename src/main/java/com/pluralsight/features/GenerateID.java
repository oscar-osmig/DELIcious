package com.pluralsight.features;

import java.io.IOException;
import java.util.*;

public class GenerateID {



        public static String generateOrderId() {
            return UUID.randomUUID().toString();
        }
    // doesn't require any tracking of previous assigned id
    public static void main(String[] args) throws IOException {
        String id = generateOrderId();
        System.out.println(id);
    }

    public static int generateUserId() {
        // range 0 to 899999
        return Math.abs(UUID.randomUUID().hashCode() % 900000 ) + 100000;
    }

}
