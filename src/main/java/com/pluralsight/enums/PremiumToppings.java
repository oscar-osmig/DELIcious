package com.pluralsight.enums;

import com.pluralsight.toppings.PremiumTopping;

public enum PremiumToppings {
    STEAK("meat"),
    HAM("meat"),
    SALAMI("meat"),
    ROAST_BEEF("meat"),
    CHICKEN("meat"),
    BACON("meat"),
    AMERICAN("cheese"),
    PROVOLONE("cheese"),
    CHEDDAR("cheese"),
    SWISS("cheese");

    private String type;

    public String getType() {
        return type;
    }
    PremiumToppings(String type) {
        this.type = type;
    }

}
