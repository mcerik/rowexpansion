package com.example.rowexpansion;

public class Order {

    private final String number;

    Order(final String number) {
        super();
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getInfo() {
        System.out.println("getInfo() was called on order number " + number);
        return "This is order number " + number;
    }

}
