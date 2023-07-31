package com.xworkz.prime.app;

public class Bed {
	private String name;
	private String color;
	
	
	public Bed(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println("Bed Name :"+name);
		System.out.println("Bed Color :"+color);
	}
	

}
