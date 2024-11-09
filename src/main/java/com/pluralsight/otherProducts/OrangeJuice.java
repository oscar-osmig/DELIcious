package com.pluralsight.otherProducts;

public class OrangeJuice extends Drinks{
    private String size;

    public OrangeJuice(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "OrangeJuice{" +
                "size='" + size + '\'' +
                '}';
    }
}
