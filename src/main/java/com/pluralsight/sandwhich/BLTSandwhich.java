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
    private static List<PremiumTopping> premiumToppings = new ArrayList<>(
            List.of(
                    new PremiumTopping(PremiumToppingName.BACON, BreadSize.EIGHT_INCH),
                    new PremiumTopping(PremiumToppingName.CHEDDAR, BreadSize.EIGHT_INCH)
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
        super(BreadSize.EIGHT_INCH, BreadTypes.WHITE, true, regularToppings, premiumToppings);

    }


}
