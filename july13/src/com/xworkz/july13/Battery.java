package com.xworkz.july13;

public class Battery {
	String name;
	BatteryType type;
	String price;
	String color ;
	Battery(String name)
	{
		this.name=name;
	}
	void BatteryType(BatteryType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.color);
		
	}
}
