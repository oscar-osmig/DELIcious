package com.pluralsight.toppings;
import com.pluralsight.enums.*;

public class RegularTopping {
    private RegularToppings regularTopping;

    public RegularTopping(RegularToppings regularTopping) {
        this.regularTopping = regularTopping;
    }

    public RegularToppings getRegularTopping() {
        return regularTopping;
    }

    public void setRegularTopping(RegularToppings regularTopping) {
        this.regularTopping = regularTopping;
    }

    @Override
    public String toString() {
        return "RegularTopping{" +
                "regularTopping=" + regularTopping +
                '}';
    }
}
