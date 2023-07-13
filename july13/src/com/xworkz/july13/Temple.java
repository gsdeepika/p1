package com.xworkz.july13;

public class Temple {
	String name;
	TempleType type;
	String openTime;
	String closeTime="11";
	Temple(String name)
	{
		this.name=name;
	}
	void TempleType(TempleType type)
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
