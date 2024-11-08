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
        if (breadSize == BreadSize.FOUR_INCH && premiumTopping.getType().equals("meat")){
            return 1.0;
        } else if (breadSize == BreadSize.EIGHT_INCH && premiumTopping.getType().equals("meat")) {
            return 2.0;
        }else {
            return 3.0;
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
