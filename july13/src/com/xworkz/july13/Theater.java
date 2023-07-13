package com.xworkz.july13;

public class Theater {
	String name;
	TheaterType type;
	String openTime;
	String closeTime="11";
	Theater(String name)
	{
		this.name=name;
	}
	void theaterType(TheaterType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
		
	}

}
