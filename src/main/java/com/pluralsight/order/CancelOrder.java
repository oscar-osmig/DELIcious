package com.pluralsight.order;

import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.features.Login;
import com.pluralsight.sandwhich.BLTSandwhich;
import com.pluralsight.sandwhich.ChangeBLT;
import com.pluralsight.screens.*;

import java.io.IOException;

public class CancelOrder {

    public static void cancel() throws InterruptedException, IOException {
        // Sandwich Screen data
        SandwichScreen.sandwhiches.clear();
        SandwichScreen.isToasted = false;
        SandwichScreen.totalSandwichCost = 0;

        // Drinks Screen data
        DrinksScreen.drinksList.clear();
        DrinksScreen.drinksCost = 0;
        DrinksScreen.drinkReceipt = "";

        // Chips Screen data
        ChipsScreen.chipsList.clear();
        ChipsScreen.chipsCost = 0;
        ChipsScreen.chipReceipt = "";

        // Generate receipt data
        GenerateReceipt.orderTotalCost = 0;
        GenerateReceipt.customerName = "";
        GenerateReceipt.orderID = "";
        GenerateReceipt.sandwichReceipt= "";
        GenerateReceipt.totalCostReceipt = "";
        GenerateReceipt.delicious = "";
        GenerateReceipt.chipReceipt = "";
        GenerateReceipt.drinkReceipt = "";

        // User login data
        Login.loggedInUser = false;
        Login.scannedCard = false;
        Login.skipped = false;
        Login.foundUserName = false;
        Login.user = "";
        Login.userID = "";
        Login.nameSpaceDifference = "";
        Login.loggedInUserDetails = null;


        // Signature sandwich data
        SignatureSandwichScreen.bltSandwhich = new BLTSandwhich();
        ChangeBLT.currentRegularTopping = RegularToppingName.NONE;

        // Order Screen
        OrderScreen.orders.clear();

        System.out.println(DELIcious.spacing + " * Thank you for visiting! *");
        Thread.sleep(5);
        DELIcious.channel();



    }
}
