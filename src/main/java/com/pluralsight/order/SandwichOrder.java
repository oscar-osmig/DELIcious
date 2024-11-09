package com.pluralsight.order;

import com.pluralsight.sandwhich.Sandwhich;
import java.util.ArrayList;
import java.util.List;

public class SandwichOrder extends Order{
    List<Sandwhich> sandwiches = new ArrayList<>();

    public SandwichOrder(List<Sandwhich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Sandwhich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwhich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    @Override
    public String toString() {
        return "SandwichOrder{" +
                "sandwiches=" + sandwiches +
                '}';
    }
}
