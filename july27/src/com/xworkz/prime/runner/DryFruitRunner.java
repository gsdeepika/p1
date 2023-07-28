package com.xworkz.prime.runner;
import com.xworkz.prime.app.DryFruit;
public class DryFruitRunner {

	public static void main(String[] args) {
		System.out.println("running main in DryFruit runner");

		DryFruit dryFruit = new DryFruit("almond", "dry fruits store", "happilo dry fruit", 900, 1, 15);
		DryFruit dryFruit2 = new DryFruit("cashew", "dry fruits store", "happilo dry fruit", 900, 1, 15);

		boolean result = dryFruit.equals(dryFruit2);
		System.out.println("DryFruit is same:" +result);
	}

}
