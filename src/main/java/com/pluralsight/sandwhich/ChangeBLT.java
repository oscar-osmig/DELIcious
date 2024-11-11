package com.pluralsight.sandwhich;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.PremiumToppingName;
import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.screens.DELIcious;
import com.pluralsight.screens.SandwichScreen;
import com.pluralsight.screens.SignatureSandwichScreen;
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
                    changeRegularTopping(bltSandwhich, currentRegularTopping);
                }
                case "7" -> changeToasted(bltSandwhich);
                case "8" -> SandwichScreen.sandwhiches.add(bltSandwhich);
                default -> System.out.println(DELIcious.spacing + "* Please choose available options *");
            }
        }while (true);
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
                    bltSandwhich.setSize(BreadSize.FOUR_INCH);
                    //System.out.println(bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                    break;
                case "2" :
                    run = false;
                    bltSandwhich.setSize(BreadSize.EIGHT_INCH);
                    System.out.println(bltSandwhich);
                    SignatureSandwichScreen.orderSignature();
                    break;
                case "3" :
                    run = false;
                    bltSandwhich.setSize(BreadSize.TWELVE_INCH);
                    System.out.println(bltSandwhich);
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
        System.out.println(currentPremiumTopping.get(1));
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

        List<RegularTopping> currentPremiumTopping = bltSandwhich.getRegularToppings();
        boolean run = true;
        do {
            String answer = getAnswer(DELIcious.spacing + "Topping >> ");
            switch (answer){
                case "1" -> {
                    run = false;
                    changeRegular(RegularToppingName.CUCUMBERS, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "2" -> {
                    run = false;
                    changeRegular(RegularToppingName.PEPPERS, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "3" -> {
                    run = false;
                    changeRegular(RegularToppingName.ONIONS, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "4" -> {
                    run = false;
                    changeRegular(RegularToppingName.LETTUCE, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "5" -> {
                    run = false;
                    changeRegular(RegularToppingName.TOMATOES, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "6" -> {
                    run = false;
                    changeRegular(RegularToppingName.JALAPENOS, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "7" -> {
                    run = false;
                    changeRegular(RegularToppingName.PICKLES, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "8" -> {
                    run = false;
                    changeRegular(RegularToppingName.GUACAMOLE, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }
                case "9" -> {
                    run = false;
                    changeRegular(RegularToppingName.MUSHROOMS, currentPremiumTopping, bltSandwhich, currentRegularTopping);
                    SignatureSandwichScreen.orderSignature();
                }

                case "0" -> SignatureSandwichScreen.orderSignature();
            }
        }while (run);

    }

    private static void changeRegular(RegularToppingName changeTo, List<RegularTopping> currentPremiumTopping, BLTSandwhich bltSandwhich, RegularToppingName currentRegularTopping) {
        List<RegularTopping> regularToppingList = new ArrayList<>();
        //RegularToppingName addToo = RegularToppingName.NONE;
        System.out.println(currentRegularTopping);
        for (RegularTopping topping : currentPremiumTopping){
            if (!topping.getRegularTopping().getType().equalsIgnoreCase("sauce")){
                if (!topping.getRegularTopping().equals(currentRegularTopping))
                     regularToppingList.add(topping);
            }
        }
        System.out.println(regularToppingList);
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
