package com.pluralsight.sandwhich;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.PremiumToppingName;
import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.order.DrinksOrder;
import com.pluralsight.order.GenerateReceipt;
import com.pluralsight.order.Order;
import com.pluralsight.order.SandwichOrder;
import com.pluralsight.screens.*;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Topping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeBLT {

    public static String getAnswer(String q){
        Scanner scanner = new Scanner(System.in);
        System.out.print(q);
        q = scanner.nextLine();
        return q;
    }
    public static RegularToppingName currentRegularTopping = RegularToppingName.NONE;
    public static void askIfChangesBLT(BLTSandwhich bltSandwhich) throws IOException, InterruptedException {
        String change = getAnswer(DELIcious.spacing + "Type the one you wish to change >> ");
        boolean run = true;
        do {
            switch (change){
                case "1" -> changeSize(bltSandwhich);
                case "2" -> changeMeat(bltSandwhich);
                case "3" -> changeCheese(bltSandwhich);
                case "4" -> {
                    currentRegularTopping = RegularToppingName.LETTUCE;
                    changeRegularTopping(bltSandwhich, currentRegularTopping);
                }
                case "5" -> {
                    currentRegularTopping = RegularToppingName.TOMATOES;
                    changeRegularTopping(bltSandwhich, currentRegularTopping);
                }
                case "6" -> {
                    currentRegularTopping = RegularToppingName.RANCH;
                    changeSauce(bltSandwhich, currentRegularTopping);
                }
                case "7" -> changeToasted(bltSandwhich);
                case "8" -> {
                    run = false;
                   GenerateReceipt.orderTotalCost += bltSandwhich.calculateSandwichCost();
                    SandwichScreen.sandwhiches.add(bltSandwhich);
                    SandwichOrder sandwichOrder = new SandwichOrder(SandwichScreen.sandwhiches);
                    OrderScreen.orders.add(sandwichOrder);
                    CheckoutScreen.checkOut(OrderScreen.orders);
                    //System.out.println(OrderScreen.orders);
                    //OrderScreen.channel();
                }
                default -> System.out.println(DELIcious.spacing + "* Please choose available options *");
            }
        }while (run);
    }

    private static void changeSize(BLTSandwhich bltSandwhich) throws IOException, InterruptedException {
        System.out.println(
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "                BLT sizes below:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥖 4 inch\n" +
                DELIcious.spacing + "             2. 🥖 8 inch\n" +
                DELIcious.spacing + "             3. 🥖 12 inch\n" +
                DELIcious.spacing + "             0. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                DELIcious.spacing + "**************************************************\n"
        );
        boolean run = true;
        do {
            String size = getAnswer(DELIcious.spacing + "Size: ");
            switch (size){
                case "1" :
                    run = false;
                    BLTSandwhich.defaultSize = BreadSize.FOUR_INCH;
                    bltSandwhich.setSize(BreadSize.FOUR_INCH);
                    //System.out.println(bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                    break;
                case "2" :
                    run = false;
                    BLTSandwhich.defaultSize = BreadSize.EIGHT_INCH;
                    bltSandwhich.setSize(BreadSize.EIGHT_INCH);
                    //System.out.println(bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                    break;
                case "3" :
                    run = false;
                    BLTSandwhich.defaultSize = BreadSize.TWELVE_INCH;
                    bltSandwhich.setSize(BreadSize.TWELVE_INCH);
                    //System.out.println(bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                    break;
                case "0" :
                    run = false;
                    SignatureSandwichScreen.orderSignature();
                    break;
                default :
                    System.out.println(DELIcious.spacing + "* Please choose available option *");
                    break;
            }
        }while (run);

    }

    private static void changeMeat(BLTSandwhich bltSandwhich) throws IOException, InterruptedException {
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*            PREMIUM TOPPINGS - MEAT             *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "              Select your meat topping:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥩 Steak\n" +
                DELIcious.spacing + "             2. 🍖 Ham\n" +
                DELIcious.spacing + "             3. 🥓 Salami\n" +
                DELIcious.spacing + "             4. 🍖 Roast Beef\n" +
                DELIcious.spacing + "             5. 🍗 Chicken\n" +
                DELIcious.spacing + "             6. 🥓 Bacon\n" +
                DELIcious.spacing + "             0. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n"
        );
        List<PremiumTopping> currentPremiumTopping = bltSandwhich.getPremiumToppings();
        boolean run = true;
        do {
            String answer = getAnswer(DELIcious.spacing + "Topping >> ");
            switch (answer){
                case "1" -> {
                    run = false;
                    changePremiumMeat(PremiumToppingName.STEAK, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "2" -> {
                    run = false;
                    changePremiumMeat(PremiumToppingName.HAM, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "3" -> {
                    run = false;
                    changePremiumMeat(PremiumToppingName.SALAMI, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "4" -> {
                    run = false;
                    changePremiumMeat(PremiumToppingName.ROAST_BEEF, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "5" -> {
                    run = false;
                    changePremiumMeat(PremiumToppingName.CHICKEN, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "6" -> {
                    run = false;
                    changePremiumMeat(PremiumToppingName.BACON, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "0" -> SignatureSandwichScreen.orderSignature();
            }
        }while (run);
    }

    private static void changePremiumMeat(PremiumToppingName premiumToppingName, List<PremiumTopping> currentPremiumTopping, BLTSandwhich bltSandwhich) {
        //System.out.println(currentPremiumTopping.get(1));
        List<PremiumTopping> premiumToppingList = new ArrayList<>();
        for (PremiumTopping topping : currentPremiumTopping){
            if (!topping.getPremiumTopping().getType().equalsIgnoreCase("meat")){
                premiumToppingList.add(topping);
            }
        }

        if (premiumToppingName.equals(PremiumToppingName.STEAK)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.STEAK, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.HAM)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.HAM, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.SALAMI)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.SALAMI, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.ROAST_BEEF)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.ROAST_BEEF, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.CHICKEN)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.CHICKEN, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.BACON)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.BACON, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }
//            System.out.println(premiumToppingList.get(1));
//            System.out.println(bltSandwhich.getPremiumToppings());
    }

    private static void changeCheese(BLTSandwhich bltSandwhich) throws IOException, InterruptedException {
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*            PREMIUM TOPPINGS - CHEESE           *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "             Select your cheese topping:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🧀 American\n" +
                DELIcious.spacing + "             2. 🧀 Provolone\n" +
                DELIcious.spacing + "             3. 🧀 Cheddar\n" +
                DELIcious.spacing + "             4. 🧀 Swiss\n" +
                DELIcious.spacing + "             0. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n"
        );

        List<PremiumTopping> currentPremiumTopping = bltSandwhich.getPremiumToppings();
        boolean run = true;
        do {
            String answer = getAnswer(DELIcious.spacing + "Topping >> ");
            switch (answer){
                case "1" -> {
                    run = false;
                    changePremiumCheese(PremiumToppingName.AMERICAN, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "2" -> {
                    run = false;
                    changePremiumCheese(PremiumToppingName.PROVOLONE, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "3" -> {
                    run = false;
                    changePremiumCheese(PremiumToppingName.CHEDDAR, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }
                case "4" -> {
                    run = false;
                    changePremiumCheese(PremiumToppingName.SWISS, currentPremiumTopping, bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                }

                case "0" -> SignatureSandwichScreen.orderSignature();
            }
        }while (run);
    }

    private static void changePremiumCheese(PremiumToppingName premiumToppingName, List<PremiumTopping> currentPremiumTopping, BLTSandwhich bltSandwhich) {
        System.out.println(currentPremiumTopping.get(1));
        List<PremiumTopping> premiumToppingList = new ArrayList<>();
        for (PremiumTopping topping : currentPremiumTopping){
            if (!topping.getPremiumTopping().getType().equalsIgnoreCase("cheese")){
                premiumToppingList.add(topping);
            }
        }

        if (premiumToppingName.equals(PremiumToppingName.AMERICAN)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.AMERICAN, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.PROVOLONE)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.PROVOLONE, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.CHEDDAR)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.CHEDDAR, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }else if (premiumToppingName.equals(PremiumToppingName.SWISS)){
            premiumToppingList.add(new PremiumTopping(PremiumToppingName.SWISS, currentPremiumTopping.getFirst().getBreadSize()));
            bltSandwhich.setPremiumToppings(premiumToppingList);
        }
//            System.out.println(premiumToppingList.get(1));
//            System.out.println(bltSandwhich.getPremiumToppings());
    }

    private static void changeRegularTopping(BLTSandwhich bltSandwhich, RegularToppingName currentRegularTopping) throws IOException, InterruptedException {
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                REGULAR TOPPINGS                *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "               Choose your regular toppings:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥒 Cucumber\n" +
                DELIcious.spacing + "             2. 🌶 Pepper\n" +
                DELIcious.spacing + "             3. 🧅 Onions\n" +
                DELIcious.spacing + "             4. 🥬 Lettuce\n" +
                DELIcious.spacing + "             5. 🍅 Tomatoes\n" +
                DELIcious.spacing + "             6. 🌶 Jalapenos\n" +
                DELIcious.spacing + "             7. 🥒 Pickles\n" +
                DELIcious.spacing + "             8. 🥑 Guacamole\n" +
                DELIcious.spacing + "             9. 🍄 Mushrooms\n" +
                DELIcious.spacing + "             0. 🔙 Back\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");

        List<RegularTopping> currentRegularToppingList = bltSandwhich.getRegularToppings();
        boolean run = true;
        do {
            String answer = getAnswer(DELIcious.spacing + "Topping >> ");
            switch (answer){
                case "1" -> {
                    run = false;
                    changeRegular(RegularToppingName.CUCUMBERS, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "2" -> {
                    run = false;
                    changeRegular(RegularToppingName.PEPPERS, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "3" -> {
                    run = false;
                    changeRegular(RegularToppingName.ONIONS, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "4" -> {
                    run = false;
                    changeRegular(RegularToppingName.LETTUCE, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "5" -> {
                    run = false;
                    changeRegular(RegularToppingName.TOMATOES, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "6" -> {
                    run = false;
                    changeRegular(RegularToppingName.JALAPENOS, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "7" -> {
                    run = false;
                    changeRegular(RegularToppingName.PICKLES, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "8" -> {
                    run = false;
                    changeRegular(RegularToppingName.GUACAMOLE, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "9" -> {
                    run = false;
                    changeRegular(RegularToppingName.MUSHROOMS, currentRegularToppingList, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }

                case "0" -> SignatureSandwichScreen.orderSignature();
            }
        }while (run);

    }

    public static void changeSauce(BLTSandwhich bltSandwhich, RegularToppingName currentRegularTopping) throws IOException, InterruptedException {
        boolean running = true;
        System.out.println("\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "*                    SAUCES                      *\n" +
                DELIcious.spacing + "*                                                *\n" +
                DELIcious.spacing + "**************************************************\n" +
                DELIcious.spacing + "             Choose your sauce:\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                "\n" +
                DELIcious.spacing + "             1. 🥄 Mayo\n" +
                DELIcious.spacing + "             2. 🧂 Mustard\n" +
                DELIcious.spacing + "             3. 🍅 Ketchup\n" +
                DELIcious.spacing + "             4. 🥗 Ranch\n" +
                DELIcious.spacing + "             5. 🏝 Thousand Island\n" +
                DELIcious.spacing + "             6. 🍋 Vinaigrette\n" +
                DELIcious.spacing + "             7. 🍲 Au Jus (side)\n" +
                DELIcious.spacing + "             8. 🍶 Sauce (side)\n" +
                "\n" +
                DELIcious.spacing + "--------------------------------------------------\n" +
                DELIcious.spacing + "   Enter your choice and press Enter to confirm\n" +
                DELIcious.spacing + "**************************************************\n");

        List<RegularTopping> currentRegularToppingList = bltSandwhich.getRegularToppings();
        do {
            String answer = getAnswer(DELIcious.spacing + "Sauce >> ");
            switch (answer){
                case "1" -> {
                    running = false;
                    changeTheSauce(RegularToppingName.MAYO,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "2" -> {
                    running = false;
                    changeRegular(RegularToppingName.MUSTARD,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "3" -> {
                    running = false;
                    changeRegular(RegularToppingName.KETCHUP,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "4" -> {
                    running = false;
                    changeRegular(RegularToppingName.RANCH,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "5" -> {
                    running = false;
                    changeRegular(RegularToppingName.THOUSAND_ISLAND,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "6" -> {
                    running = false;
                    changeRegular(RegularToppingName.VINAIGRETTE,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "7" -> {
                    running = false;
                    changeTheSauce(RegularToppingName.AU_JUS,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "8" -> {
                    running = false;
                    changeTheSauce(RegularToppingName.SAUCE,currentRegularToppingList ,bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }

                case "0" -> SignatureSandwichScreen.orderSignature();
            }


        }while (running);
    }

    public static void changeTheSauce(RegularToppingName changeTo, List<RegularTopping> currentRegularTopping, BLTSandwhich bltSandwhich, RegularToppingName RegularTopping){
        List<RegularTopping> sauceList = new ArrayList<>();
        //System.out.println(bltSandwhich.getRegularToppings());
        //System.out.println(RegularTopping);
        for (RegularTopping topping : currentRegularTopping){
            if (!topping.getRegularTopping().getType().equalsIgnoreCase("sauce")){
                if (!topping.getRegularTopping().equals(RegularTopping))
                    sauceList.add(topping);
            }
        }
        //System.out.println(sauceList);

        if (changeTo.equals(RegularToppingName.MAYO)){
            sauceList.add(new RegularTopping(RegularToppingName.MAYO));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.MUSTARD)){
            sauceList.add(new RegularTopping(RegularToppingName.MUSTARD));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.KETCHUP)){
            sauceList.add(new RegularTopping(RegularToppingName.KETCHUP));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.RANCH)){
            sauceList.add(new RegularTopping(RegularToppingName.RANCH));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.THOUSAND_ISLAND)){
            sauceList.add(new RegularTopping(RegularToppingName.THOUSAND_ISLAND));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.VINAIGRETTE)){
            sauceList.add(new RegularTopping(RegularToppingName.VINAIGRETTE));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.AU_JUS)){
            sauceList.add(new RegularTopping(RegularToppingName.PICKLES));
            bltSandwhich.setRegularToppings(sauceList);
        }
        else if (changeTo.equals(RegularToppingName.SAUCE)){
            sauceList.add(new RegularTopping(RegularToppingName.SAUCE));
            bltSandwhich.setRegularToppings(sauceList);
        }
        //System.out.println(sauceList);

    }



    private static void changeRegular(RegularToppingName changeTo, List<RegularTopping> currentPremiumTopping, BLTSandwhich bltSandwhich, RegularToppingName currentRegularTopping) {
        List<RegularTopping> regularToppingList = new ArrayList<>();
        //RegularToppingName addToo = RegularToppingName.NONE;
        //System.out.println(currentRegularTopping);
        for (RegularTopping topping : currentPremiumTopping){
            if (!topping.getRegularTopping().getType().equalsIgnoreCase("regular")){
                if (!topping.getRegularTopping().equals(currentRegularTopping))
                     regularToppingList.add(topping);
            }
        }
        //System.out.println(regularToppingList);
        if (changeTo.equals(RegularToppingName.CUCUMBERS)){
            regularToppingList.add(new RegularTopping(RegularToppingName.CUCUMBERS));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.PEPPERS)){
            regularToppingList.add(new RegularTopping(RegularToppingName.PEPPERS));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.ONIONS)){
            regularToppingList.add(new RegularTopping(RegularToppingName.ONIONS));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.LETTUCE)){
            regularToppingList.add(new RegularTopping(RegularToppingName.LETTUCE));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.TOMATOES)){
            regularToppingList.add(new RegularTopping(RegularToppingName.TOMATOES));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.JALAPENOS)){
            regularToppingList.add(new RegularTopping(RegularToppingName.JALAPENOS));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.PICKLES)){
            regularToppingList.add(new RegularTopping(RegularToppingName.PICKLES));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.GUACAMOLE)){
            regularToppingList.add(new RegularTopping(RegularToppingName.GUACAMOLE));
            bltSandwhich.setRegularToppings(regularToppingList);
        }
        else if (changeTo.equals(RegularToppingName.MUSHROOMS)){
            regularToppingList.add(new RegularTopping(RegularToppingName.MUSHROOMS));
            bltSandwhich.setRegularToppings(regularToppingList);
        }

        //System.out.println(regularToppingList);
    }

    private static void changeToasted(BLTSandwhich bltSandwhich) throws IOException, InterruptedException {
        System.out.println(
                        DELIcious.spacing + "**************************************************\n" +
                        DELIcious.spacing + "                   Toast BLT? \n" +
                        DELIcious.spacing + "--------------------------------------------------\n" +
                        "\n" +
                        DELIcious.spacing + "             1. ✅ Yes\n" +
                        DELIcious.spacing + "             2. ❌ No\n" +
                        DELIcious.spacing + "             0. 🔙 Back\n" +
                        "\n" +
                        DELIcious.spacing + "--------------------------------------------------\n" +
                        DELIcious.spacing + "   Enter your choice and press Enter to continue\n" +
                        DELIcious.spacing + "**************************************************\n"
        );

        boolean run = true;
        do {
            String answer = getAnswer(DELIcious.spacing + "Toasted >> ");
            switch (answer){
                case "1" -> {
                    run = false;
                    bltSandwhich.setToasted(true);
                    SignatureSandwichScreen.orderSignature();
                }
                case "2" -> {
                    run = false;
                    bltSandwhich.setToasted(false);
                    SignatureSandwichScreen.orderSignature();
                }
                case "0" -> SignatureSandwichScreen.orderSignature();
            }
        }while (run);

    }
}
