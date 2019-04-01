package com.example.catalog;

import java.util.List;

public class Catalog {

    private int id;
    private List<Object> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }
}
