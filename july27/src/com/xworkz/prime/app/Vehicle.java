package com.xworkz.prime.app;

public class Vehicle {
	private double price;
	private double weight;
	private String name;
	private String companyName;
	private String brand;
	
	public Vehicle(double price, double weight, String name, String companyName, String brand) {
		super();
		this.price = price;
		this.weight = weight;
		this.name = name;
		this.companyName = companyName;
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "price:" + this.price + "weight:" + this.weight + "name:" + this.name + "companyName:" + this.companyName + "brand:" + this.brand ;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getBrand() {
		return brand;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not null,can compare");
			if(obj instanceof Vehicle) {
				Vehicle casted = (Vehicle)obj;
				if(this.price==casted.price && this.weight==casted.weight && this.name==casted.name && this.companyName==casted.companyName && this.brand==casted.brand){		
					
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
