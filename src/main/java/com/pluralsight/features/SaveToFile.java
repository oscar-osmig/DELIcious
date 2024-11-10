package com.pluralsight.features;

import com.pluralsight.order.GenerateReceipt;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SaveToFile {
    static String receiptsFolderPath = "src/main/java/com/pluralsight/receipts/";

    public static void saveReceipt(String receipt) throws IOException {
        String localDate = String.valueOf(LocalDate.now());
        String localTime = String.valueOf(LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
        localDate = localDate.replace("-", "");
        localTime = localTime.replace(":", "");
        String fileName = GenerateReceipt.customerName;
        //System.out.println(localTime);
        //System.out.println(localDate);
        //receiptsFolderPath +fileName.strip()
        BufferedWriter bw = new BufferedWriter(new FileWriter(receiptsFolderPath+localDate+ "-" + localTime + ".txt"));
        bw.write(receipt);
        bw.close();

    }
    String customerFolderPath = "com/pluralsight/customers/usernames.txt/";

    public static void saveCustomer(String username, int userID, String password, String points, String todaysDate) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/pluralsight/customers/usernames.txt", true));
        String userFormat = "\n" + username.trim() + "|" + userID + "|" + password.trim() + "|" + points.trim() + "|" + todaysDate + ":";
        bw.write(userFormat);
        bw.close();
    }
}
