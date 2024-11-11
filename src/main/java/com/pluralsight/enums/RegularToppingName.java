package com.pluralsight.enums;

public enum RegularToppingName {
    LETTUCE("regular"),
    PEPPERS("regular"),
    ONIONS("regular"),
    TOMATOES("regular"),
    JALAPENOS("regular"),
    CUCUMBERS("regular"),
    PICKLES("regular"),
    GUACAMOLE("regular"),
    MUSHROOMS("regular"),
    AU_JUS("side"),
    SAUCE("side"),
    MAYO("sauce"),
    MUSTARD("sauce"),
    KETCHUP("sauce"),
    RANCH("sauce"),
    THOUSAND_ISLAND("sauce"),
    VINAIGRETTE("sauce"),
    NONE("null");

    private String type;

    public String getType() {
        return type;
    }
    RegularToppingName(String type) {
        this.type = type;
    }

}


