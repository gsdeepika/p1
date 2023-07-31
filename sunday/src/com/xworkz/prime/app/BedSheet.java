package com.xworkz.prime.app;

public class BedSheet extends Bed{
	private String bedSheetColor;
	private double bedSheetprice;
	
	public BedSheet(String name, String color, String bedSheetColor, double price) {
		super(name, color);
		this.bedSheetColor = bedSheetColor;
		this.bedSheetprice = bedSheetprice;
	}

	@Override
	
	public void printInfo() {
		super.printInfo();
		System.out.println("BedSheet Color :"+bedSheetColor);
		System.out.println("BedSheet Price :"+bedSheetprice);
		
	}
	
	
	
}
