package com.xworkz.july18;

public class ShoeRunner {

	public static void main(String[] args) {
		System.out.println("Running main in ShoeRunner");

		Shoe shoe1 = new Shoe(1500, ShoeColor.BLACK, ShoeSize.SIX);
		ShoeUtil.check(shoe1);
		
		Shoe shoe2 = new Puma("Casuals", "India", 3500, ShoeColor.GRAY, ShoeSize.EIGHT);
		ShoeUtil.check(shoe2);
		
		Shoe shoe3 = new Nike("John Donahoe", "Rory Mcllory", 4000, ShoeColor.RED, ShoeSize.NINE);
		ShoeUtil.check(shoe3);

	}

}
