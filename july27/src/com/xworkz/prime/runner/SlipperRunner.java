package com.xworkz.prime.runner;

import com.xworkz.prime.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("running main in Slipper runner");

		Slipper Slipper = new Slipper("nike", "nike boston ", 8, 1200, "white", "slipper shop", true);
		Slipper Slipper2 = new Slipper("ADIDAS", "adidas boston ", 6, 1200, "black", "slipper shop", false);

		boolean result = Slipper.equals(Slipper2);
		System.out.println("Slipper is same:" +result);

	}

}
