package com.pluralsight.otherProducts;

import com.pluralsight.otherProducts.OtherProducts;

public class Chips extends OtherProducts {
    private String name;
    private String size;

    public Chips(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
