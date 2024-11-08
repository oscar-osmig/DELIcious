package com.pluralsight.toppings;
import com.pluralsight.enums.*;

public class RegularTopping extends Topping{
    private RegularToppingName regularTopping;

    public RegularTopping(RegularToppingName regularTopping) {
        this.regularTopping = regularTopping;
    }

    public RegularToppingName getRegularTopping() {
        return regularTopping;
    }

    public void setRegularTopping(RegularToppingName regularTopping) {
        this.regularTopping = regularTopping;
    }

    @Override
    public String toString() {
        return "RegularTopping{" +
                "regularTopping=" + regularTopping +
                '}';
    }
}
