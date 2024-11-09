package com.pluralsight.order;

import com.pluralsight.otherProducts.Chips;
import com.pluralsight.otherProducts.Drinks;
import com.pluralsight.sandwhich.Sandwhich;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Sandwhich> sandwhiches = new ArrayList<>();
    List<Drinks> drinksList = new ArrayList<>();
    List<Chips> chipsList = new ArrayList<>();

    public Order(List<Sandwhich> sandwhiches, List<Drinks> drinks, List<Chips> chips) {
        this.sandwhiches = sandwhiches;
        this.drinksList = drinks;
        this.chipsList = chips;
    }

    public List<Sandwhich> getSandwhiches() {
        return sandwhiches;
    }

    public void setSandwhiches(List<Sandwhich> sandwhiches) {
        this.sandwhiches = sandwhiches;
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    public List<Chips> getChipsList() {
        return chipsList;
    }

    public void setChipsList(List<Chips> chipsList) {
        this.chipsList = chipsList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sandwhiches=" + sandwhiches +
                ", drinksList=" + drinksList +
                ", chipsList=" + chipsList +
                '}';
    }
}
