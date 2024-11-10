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

    public double getPrice() {
        return switch (size.toUpperCase()) {
            case "S" -> 2.0;
            case "M" -> 2.5;
            case "L" -> 3.0;
            default -> 0.0;
        };

    }

    @Override
    public String toString() {
        return "OrangeJuice{" +
                "size='" + size + '\'' +
                '}';
    }
}
