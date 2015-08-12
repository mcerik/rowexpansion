package com.example.rowexpansion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class OrdersBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Order> orders;

    @PostConstruct
    public void createOrders() {
        orders = new ArrayList<Order>();

        for (int i = 0; i < 100; i++) {
            orders.add(new Order(String.valueOf(i + 1)));
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Item> getItemsInOrder(final String orderNumber) {
        System.out.println("getItemsInOrder called for order number " + orderNumber);

        List<Item> items = new ArrayList<Item>();

        for (int i = 0; i < 5; i++) {
            items.add(new Item("Item number " + (i + 1) + " for order " + orderNumber));
        }

        return items;
    }

}
