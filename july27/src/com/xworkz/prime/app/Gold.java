package com.xworkz.prime.app;

public class Gold {
private double price;
private double weight;
private String shopName;
private String brand;

public Gold(double price, double weight, String shopName, String brand) {
	super();
	this.price = price;
	this.weight = weight;
	this.shopName = shopName;
	this.brand = brand;
}

@Override
	public String toString() {
		return "price:" + this.price + "weight:"+this.weight + "shopName:"+this.shopName + "brand:"+ this.brand;
}

public double getPrice() {
	return price;
}

public double getWeight() {
	return weight;
}

public String getShopName() {
	return shopName;
}

public String getBrand() {
	return brand;
}

@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not null,can compare");
			if(obj instanceof Gold) {
				Gold casted = (Gold)obj;
				if(this.price==casted.price && this.weight==casted.weight && this.shopName==casted.shopName && this.brand==casted.brand){		
					
			System.out.println("both are same");
			return true;
		}
				else {
					System.err.println("both are not same");
				}
	}
			else {
				System.out.println("object is null,cannot compare");
			}
		}
		return false;
}
}
