package com.Xworkz.july12;

public class Vaccum {
	static String name;
	String type;
	void displayInstance()
	{
		System.out.println(this.type);
		displaystatic();
	}
	static String displaystatic() {
		System.out.println(name);
		return name;
	}


}
