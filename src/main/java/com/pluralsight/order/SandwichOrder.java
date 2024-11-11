package com.pluralsight.order;

import com.pluralsight.sandwhich.Sandwhich;
import java.util.ArrayList;
import java.util.List;

public class SandwichOrder extends Order{
    public static List<Sandwhich> sandwiches = new ArrayList<>();

    public SandwichOrder(List<Sandwhich> sandwiches) {
        SandwichOrder.sandwiches = sandwiches;
    }

    public List<Sandwhich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwhich> sandwiches) {
        SandwichOrder.sandwiches = sandwiches;
    }

    @Override
    public String toString() {
        return "SandwichOrder{" +
                "sandwiches=" + sandwiches +
                '}';
    }
}
