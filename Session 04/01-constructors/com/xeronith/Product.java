package com.xeronith;

public class Product {

    private int code;
    private String name;
    private int price;
    private int count;

    public Product(int code) {
        this.code = code;
    }

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Product(int code, String name, int price, int count) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
