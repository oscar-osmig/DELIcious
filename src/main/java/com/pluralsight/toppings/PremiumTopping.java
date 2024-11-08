package com.pluralsight.toppings;

import com.pluralsight.enums.*;

public class PremiumTopping extends Topping{
    private PremiumToppings premiumTopping;
    private BreadSize breadSize;


    public PremiumTopping(PremiumToppings premiumTopping, BreadSize breadSize) {
        this.premiumTopping = premiumTopping;
        this.breadSize = breadSize;
    }

    public double getToppingPrice(){
        if (breadSize == BreadSize.FOUR_INCH ){
            return 5.50;
        } else if (breadSize == BreadSize.EIGHT_INCH) {
            return 7.00;
        }else {
            return 8.50;
        }
    }


    public PremiumToppings getPremiumTopping() {
        return premiumTopping;
    }

    public void setPremiumTopping(PremiumToppings premiumTopping) {
        this.premiumTopping = premiumTopping;
    }

    public BreadSize getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(BreadSize breadSize) {
        this.breadSize = breadSize;
    }

    @Override
    public String toString() {
        return "PremiumTopping{" +
                "premiumTopping=" + premiumTopping +
                ", breadSize=" + breadSize +
                '}';
    }
}
