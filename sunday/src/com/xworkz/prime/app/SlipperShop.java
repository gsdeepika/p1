package com.xworkz.prime.app;

public class SlipperShop extends Slipper {
	private String slipperShopName;
	private String slipperShopType;
	
	public SlipperShop(String name, int size, String slipperShopName, String slipperShopType) {
		super(name, size);
		this.slipperShopName = slipperShopName;
		this.slipperShopType = slipperShopType;
		
		
	}

	public String getStudentName() {
		return slipperShopName;
	}
	public String getGender() {
		return slipperShopType;
	}

	
	public void setStudentName(String studentName) {
		this.slipperShopName = slipperShopName;
	}
	public void setGender(String gender) {
		this.slipperShopType = slipperShopType;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("slipperShop Name :"+slipperShopName);
		System.out.println("slipperShop Type  :"+slipperShopType);
		
	}
	
	
}
