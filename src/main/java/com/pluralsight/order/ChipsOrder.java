package com.pluralsight.order;

import com.pluralsight.otherProducts.Chips;

import java.util.ArrayList;
import java.util.List;

public class ChipsOrder extends Order{
    List<Chips> chips = new ArrayList<>();

    public ChipsOrder(List<Chips> chips) {
        this.chips = chips;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    @Override
    public String toString() {
        return "ChipsOrder{" +
                "chips=" + chips +
                '}';
    }
}
