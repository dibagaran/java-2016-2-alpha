package com.xeronith;

public class Category {

    private int code;
    private String title;
    private Product[] products = new Product[100];
    private int productsCount = 0;

    public Category(int code) {
        this.code = code;
    }

    public Category(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getProductsCount() {
        return productsCount;
    }

    public void add(Product product) {
        if (productsCount < products.length) {
            products[productsCount++] = product;
            Console.writeLine("Product '" + product.getName() + "' added to category '" + this.getTitle() + "'.");
        } else {
            Console.writeLine("Category " + this.getTitle() + " is full!");
        }
    }
}
