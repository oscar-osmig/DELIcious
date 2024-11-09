package com.pluralsight.otherProducts;

public class Soda extends Drinks{
    private String name;
    private int calories;
    private String flavor;
    private String size;

    public Soda(String name, String flavor,int calories, String size) {
        this.name = name;
        this.calories = calories;
        this.flavor = flavor;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", flavor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
