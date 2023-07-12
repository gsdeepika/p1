package com.Xworkz.july12;

public class NumberPlate {
	static String type;
	double price;
	void displayInstance()
	{
		System.out.println(this.price);
		displaystatic();
	}
	static String displaystatic() {
		System.out.println(type);
		return type;
	}
}
