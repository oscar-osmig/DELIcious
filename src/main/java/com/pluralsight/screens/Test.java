package com.pluralsight.screens;



import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.BreadTypes;
import com.pluralsight.enums.PremiumToppings;
import com.pluralsight.enums.RegularToppings;
import com.pluralsight.sandwhich.Sandwhich;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args) {

        List<RegularTopping> regularTopping = new ArrayList<>();
        regularTopping.add(new RegularTopping(RegularToppings.MAYO));
        regularTopping.add(new RegularTopping(RegularToppings.CUCUMBERS));
        regularTopping.add(new RegularTopping(RegularToppings.MUSHROOMS));

        List<PremiumTopping> premiumTopping = new ArrayList<>();
        premiumTopping.add(new PremiumTopping(PremiumToppings.HAM, BreadSize.FOUR_INCH));
        premiumTopping.add(new PremiumTopping(PremiumToppings.AMERICAN, BreadSize.EIGHT_INCH));
        premiumTopping.add(new PremiumTopping(PremiumToppings.BACON, BreadSize.TWELVE_INCH));


        Sandwhich sandwhich = new Sandwhich(BreadSize.EIGHT_INCH, BreadTypes.WHEAT, false, regularTopping, premiumTopping);
        System.out.println(sandwhich);

        for (PremiumTopping topping : premiumTopping){
            System.out.println(topping.getPremiumTopping() + ": " + topping.getToppingPrice());
        }

    }
}