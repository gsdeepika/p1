package com.xworkz.prime.runner;
import com.xworkz.prime.app.Grinder;
public class GrinderRunner {

	public static void main(String[] args) {
		Grinder grinder = new Grinder();
		System.out.println(grinder.toString());
		grinder.setName ("angle");
		grinder.setCapacity (1.25);
		grinder.setBrand ("prestige");
		grinder.setPrice (2000);
		grinder.setShape ("round");
		
		
		System.out.println(grinder.toString());

	}

}
