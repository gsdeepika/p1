package com.xworkz.july17;

public class Home extends Building{
	Home()
	{
		super();
		System.out.println("Invoking no-args const in Home");
	}
	Home(String type,int floors,String color)
	{
		super(type,floors,color);
		this.type=type;
		this.floors=floors;
		this.color=color;
	}
	
}
