package com.xworkz.prime.app;

public class Watch {
	private String watchName;
	private String watchColor;
	
	
	public Watch(String watchName, String watchColor) {
		super();
		this.watchName = watchName;
		this.watchColor = watchColor;
	}
	
	public void printInfo() {
		System.out.println("Watch Name :"+watchName);
		System.out.println("Watch Color :"+watchColor);
	}
}
