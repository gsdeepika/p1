package com.xworkz.july13;

public class Resort {
	String name;
	ResortType type;
	String ownerName;
	String breakfast="puliogre";
	Resort(String name)
	{
		this.name=name;
	}
	void ResortType(ResortType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.ownerName);
		System.out.println(this.breakfast);
		
	}
}
