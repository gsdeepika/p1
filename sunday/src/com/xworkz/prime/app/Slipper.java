package com.xworkz.prime.app;

public class Slipper {
	private String name;
	private int size;
	
	public Slipper(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return size;
	}



	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.size = size;
	}



	public void printInfo() {
		System.out.println("Slipper Name :"+name);
		System.out.println("Slipper size :"+size);
	}
	
}
