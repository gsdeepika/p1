package com.Xworkz.july12;

public class MotherBoard {
	static String type;
	String name;
	void displayInstance()
	{
		System.out.println(this.name);
		displaystatic();
	}
	static String displaystatic() {
		System.out.println(type);
		return type;
	}
}
