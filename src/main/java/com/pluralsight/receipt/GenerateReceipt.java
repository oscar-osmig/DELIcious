package com.pluralsight.receipt;

import java.util.List;

public abstract class GenerateReceipt {
    List<Object> orderItems;

    public GenerateReceipt(List<Object> orderItems) {
        this.orderItems = orderItems;
    }

    abstract void makeReceipt();


    public List<Object> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Object> orderItems) {
        this.orderItems = orderItems;
    }
}
