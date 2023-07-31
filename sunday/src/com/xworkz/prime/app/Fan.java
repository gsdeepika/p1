package com.xworkz.prime.app;

public class Fan {
	private String Name;
	private String color;       
	private String Type;
	private double price;

	
	public Fan() {
		System.out.println("Running no argument constructor of Fan");
	}
	
	public Fan(String Name, String color, String Type) {
		System.out.println("Running string, string, string constructor of Fan");
		this.Name = Name;
		this.color = color;
		this.Type = Type;
	}

	public Fan(String Name, String color, String Type, double price) {
		this(Name, color, Type);
		System.out.println("Running string, string, string, double constructor of Fan");
		this.price = price;
	}


	@Override
	public String toString() {
		return " Name:" + this.Name + " color: " + this.color  + " Type: " + this.Type +
				"price:" +this.price;
	}

}
