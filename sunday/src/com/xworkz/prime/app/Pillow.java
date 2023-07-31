package com.xworkz.prime.app;

public class Pillow extends Bed{
	private String pillowcolor;
	private double pillowPrice;
	
	public Pillow(String name, String color, String pillowcolor, double pillowPrice) {
		super(name, color);
		this.pillowcolor = pillowcolor;
		this.pillowPrice = pillowPrice;
	}

	@Override
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Pillow color :"+pillowcolor);
		System.out.println("Pillow Price :"+pillowPrice);
		
	}
}
