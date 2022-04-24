package com.codingdojo.ffrago.fruityloops.models;

public class Item {
    
    // member variable
    private String name;
    private double price;
    
    // constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    
}