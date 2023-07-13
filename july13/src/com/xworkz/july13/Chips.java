package com.xworkz.july13;

public class Chips {
	String name;
	ChipsType type;
	String price;
	String flavour="onion";
	Chips(String name)
	{
		this.name=name;
	}
	void ChipsType(ChipsType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.flavour);
		
	}
}
