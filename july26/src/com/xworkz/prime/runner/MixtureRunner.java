package com.xworkz.prime.runner;
import com.xworkz.prime.app.Mixture;
public class MixtureRunner {

	public static void main(String[] args) {
		Mixture mixture = new Mixture();
		System.out.println(mixture.toString());
		mixture.setName ("chow chow");
		mixture.setColor ("orange");
		mixture.setTaste ("spicy");
		mixture.setPrice (30);
		mixture.setQuantity (250);
		
		System.out.println(mixture.toString());

	}
}
