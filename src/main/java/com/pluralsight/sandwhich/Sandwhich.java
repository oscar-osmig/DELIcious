package com.pluralsight.sandwhich;
import com.pluralsight.enums.*;
import com.pluralsight.toppings.PremiumTopping;
import com.pluralsight.toppings.RegularTopping;

import java.util.List;

public class Sandwhich {
    private BreadSize size;
    private BreadTypes breadType;
    private boolean isToasted;
    private List<RegularTopping> regularToppings;
    private List<PremiumTopping> premiumToppings;


    public Sandwhich(BreadSize size, BreadTypes breadType,
                     boolean isToasted, List<RegularTopping> regularTopping,
                     List<PremiumTopping> premiumToppings) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.regularToppings = regularTopping;
        this.premiumToppings = premiumToppings;
    }

    public void addRegularTopping(RegularTopping topping){
        regularToppings.add(topping);
    }

    public double calculateSandwichCost(){
        double toppingCost = 0;

        double breadCost = size == BreadSize.FOUR_INCH ? 5.5 : (size == BreadSize.EIGHT_INCH ? 7.0 : 8.5);
        for (PremiumTopping topping : premiumToppings){
           toppingCost += topping.getToppingPrice();
        }
       return breadCost + toppingCost;
    }


    public BreadSize getSize() {
        return size;
    }

    public void setSize(BreadSize size) {
        this.size = size;
    }

    public BreadTypes getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadTypes breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public List<RegularTopping> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<RegularTopping> regularToppings) {
        this.regularToppings = regularToppings;
    }

    @Override
    public String toString() {
        return "Sandwhich{" +
                "size=" + size +
                ", breadType=" + breadType +
                ", isToasted=" + isToasted +
                ", regularToppings=" + regularToppings +
                ", premiumToppings=" + premiumToppings +
                '}';
    }
}
