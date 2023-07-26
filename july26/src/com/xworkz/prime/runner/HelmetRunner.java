package com.xworkz.prime.runner;
import com.xworkz.prime.app.Helmet;
public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet = new Helmet();
		System.out.println(helmet.toString());
		helmet.setName ("studds");
		helmet.setColor ("black");
		helmet.setBrand ("bell helmet");
		helmet.setPrice (500);
		helmet.setShape ("round oval");
		
		
		System.out.println(helmet.toString());

	}

}
