package com.xworkz.prime.app;

public class Clock extends Watch{
	private String clockName;
	private double price;
	
	public Clock(String watchName, String watchColor, String clockName, double price) {
		super(watchName, watchColor);
		this.clockName = clockName;
		this.price = price;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Clock Name :"+clockName);
		System.out.println("Clock price :"+price);
	}	
}
