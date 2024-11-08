package com.pluralsight.enums;

public enum PremiumToppingName {
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
    PremiumToppingName(String type) {
        this.type = type;
    }

}
