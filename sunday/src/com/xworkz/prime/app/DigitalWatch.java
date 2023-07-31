package com.xworkz.prime.app;

public class DigitalWatch extends Watch {
	private String Name;
	private double WatchPrice;
	
	
	
	public DigitalWatch(String watchName, String watchColor, String clockName, double price, String Name, double WatchPrice){
		super(watchName, watchColor);
		this.Name = Name;
		this.WatchPrice = WatchPrice;
		
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Name :"+Name);
		System.out.println("Watch Price :"+WatchPrice);
		
	}

}

