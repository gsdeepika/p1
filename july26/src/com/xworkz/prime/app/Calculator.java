package com.xworkz.prime.app;

public class Calculator {
private String name;
private double price;
private int noOfButtons;
private int version; 
private String color;

@Override
public String toString() {
	return( " name: " + this.name + " price: " + this.price + " noOfButtons: " + this.noOfButtons + "version: " + this.version + " color: " + this.color );
}

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

public int getNoOfButtons() {
	return noOfButtons;
}

public void setNoOfButtons(int noOfButtons) {
	this.noOfButtons = noOfButtons;
}

public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
}
