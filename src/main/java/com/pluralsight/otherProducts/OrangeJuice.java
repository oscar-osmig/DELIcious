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

    public double getPrice(){
        if (this.size.equalsIgnoreCase("S")){
            return 2.0;
        } else if (this.size.equalsIgnoreCase("M")) {
            return 2.50;
        } else if (this.size.equalsIgnoreCase("L")) {
            return 3.0;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "OrangeJuice{" +
                "size='" + size + '\'' +
                '}';
    }
}
