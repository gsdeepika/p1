package com.xworkz.prime.app;

public class AnalogWatch extends DigitalWatch{
	private String digitalWatchName;
	private String digitalWatchcolor;
	

	public AnalogWatch(String watchName, String watchColor, String clockName, double price, String Name, double WatchPrice, String digitalWatchName, String digitalWatchcolor ) {
		super(watchName, watchColor, clockName, price, Name, WatchPrice);
		this.digitalWatchName = digitalWatchName;
		this.digitalWatchcolor=digitalWatchcolor;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Digital Watch Name :"+digitalWatchName);
		System.out.println("Digital Watch Color :"+digitalWatchcolor);

	}
}
