package com.pluralsight.order;

import com.pluralsight.otherProducts.Drinks;

import java.util.ArrayList;
import java.util.List;

public class DrinksOrder extends Order{
    List<Drinks> drinks = new ArrayList<>();

    public DrinksOrder(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "DrinksOrder{" +
                "drinks=" + drinks +
                '}';
    }
}
