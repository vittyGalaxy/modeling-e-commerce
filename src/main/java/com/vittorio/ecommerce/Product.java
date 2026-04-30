package com.vittorio.ecommerce;

public class Product {
    private String name;
    private double price;
    private User user;

    public Product(String name, double price, User user) {
        setName(name);
        setPrice(price);
        setUser(user);
    }

    // getter
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
    
    public User getUser() {
        return this.user;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
}
