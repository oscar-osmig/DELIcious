package com.pluralsight.screens;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.BreadTypes;
import com.pluralsight.enums.PremiumToppingName;
import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Topping;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new PremiumTopping(PremiumToppingName.SWISS, BreadSize.FOUR_INCH));
        toppings.add(new RegularTopping(RegularToppingName.VINAIGRETTE));

        // use during making receipt
        System.out.printf( " %s " , PremiumToppingName.HAM);

//        if (toppings.get(1) instanceof RegularTopping){
//            System.out.println(toppings.getFirst());
//        }

        /*
                      --- DElIcious ---
        sandwich:
                Bread Type:  %s %s %s %s
                -------------------------------
                Meats:  %s %s %s %s
                ------------------------------
                Cheese:  %s %s %s %s
                -----------------------------
                Regular Toppings:  %s %s %s %s
                        ---------------------
                        sides:  %s %s %s %s
                        ---------------------
                        sauce:  %s %s %s %s
                        ---------------------
                other products:  %s %s %s %s
                -----------------------------
                       soda: %s %s %s %s
                       ----------------------
                       ships:  %s %s %s %s
                       -------------------------
                Total: %s
                --------------------------------
         */
        System.out.println();



    }

    public static void makeSandwich(){
        System.out.println();
        List<RegularTopping> regularTopping = new ArrayList<>();
        regularTopping.add(new RegularTopping(RegularToppingName.MAYO));
        regularTopping.add(new RegularTopping(RegularToppingName.CUCUMBERS));
        regularTopping.add(new RegularTopping(RegularToppingName.MUSHROOMS));

        List<PremiumTopping> premiumTopping = new ArrayList<>();
        premiumTopping.add(new PremiumTopping(PremiumToppingName.HAM, BreadSize.FOUR_INCH));
        premiumTopping.add(new PremiumTopping(PremiumToppingName.AMERICAN, BreadSize.EIGHT_INCH));
        premiumTopping.add(new PremiumTopping(PremiumToppingName.BACON, BreadSize.TWELVE_INCH));


        Sandwhich sandwhich = new Sandwhich(BreadSize.EIGHT_INCH, BreadTypes.WHEAT, false, regularTopping, premiumTopping);
        System.out.println(sandwhich);

        for (PremiumTopping topping : premiumTopping){
            System.out.println(topping.getPremiumTopping() + ": " + topping.getToppingPrice());
        }

    }
}
