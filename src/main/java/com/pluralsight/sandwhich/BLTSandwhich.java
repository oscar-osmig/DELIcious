package com.pluralsight.sandwhich;

import com.pluralsight.enums.BreadSize;
import com.pluralsight.enums.BreadTypes;
import com.pluralsight.enums.PremiumToppingName;
import com.pluralsight.enums.RegularToppingName;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;

import java.util.ArrayList;
import java.util.List;

public class BLTSandwhich extends Sandwhich{
    public static BreadSize defaultSize = BreadSize.EIGHT_INCH;
    private static List<PremiumTopping> premiumToppings = new ArrayList<>(
            List.of(
                    new PremiumTopping(PremiumToppingName.BACON, defaultSize),
                    new PremiumTopping(PremiumToppingName.CHEDDAR, defaultSize)
            )
    );

    private static List<RegularTopping> regularToppings = new ArrayList<>(
            List.of(
                    new RegularTopping(RegularToppingName.LETTUCE),
                    new RegularTopping(RegularToppingName.TOMATOES),
                    new RegularTopping(RegularToppingName.RANCH)
                    )
    );


    public BLTSandwhich() {
        super(defaultSize, BreadTypes.WHITE, true, regularToppings, premiumToppings);

    }

}
