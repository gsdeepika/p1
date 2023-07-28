package com.xworkz.prime.app;

public class Slipper {
	private String brand;
	private String model;
	private double size;
	private double price;
	private String color;
	private String shopName;
	private boolean sale;
	
	public Slipper(String brand, String model, double size, double price, String color, String shopName, boolean sale) {
		super();
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.price = price;
		this.color = color;
		this.shopName = shopName;
		this.sale = sale;
	}
	
	@Override
	public String toString() {
		return "brand:"+this.brand + "model:"+this. model + "size:"+this.size+ "price:"+this.price+ "color:"+this.color+
				"shopName:"+this.shopName + "sale:"+this.sale;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getSize() {
		return size;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public boolean getsale() {
		return sale;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not null,can compare");
			if(obj instanceof Slipper) {
				Slipper casted = (Slipper)obj;
				if(this.brand == casted.brand && this.sale == casted.sale && this.color == casted.color &&
						this.model == casted.model && this.price == casted.price && this.shopName == casted.shopName
						&& this.size == casted.size) {
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
