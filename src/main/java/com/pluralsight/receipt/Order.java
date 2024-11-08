package com.pluralsight.receipt;

import com.pluralsight.otherProducts.OtherProducts;
import com.pluralsight.sandwhich.Sandwhich;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Sandwhich> sandwhiches = new ArrayList<>();
    List<OtherProducts> otherProducts = new ArrayList<>();

    public Order(List<Sandwhich> sandwhiches, List<OtherProducts> otherProducts) {
        this.sandwhiches = sandwhiches;
        this.otherProducts = otherProducts;
    }

    public List<Sandwhich> getSandwhiches() {
        return sandwhiches;
    }

    public void setSandwhiches(List<Sandwhich> sandwhiches) {
        this.sandwhiches = sandwhiches;
    }

    public List<OtherProducts> getOtherProducts() {
        return otherProducts;
    }

    public void setOtherProducts(List<OtherProducts> otherProducts) {
        this.otherProducts = otherProducts;
    }
}
