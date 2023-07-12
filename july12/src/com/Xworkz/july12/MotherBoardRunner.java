package com.Xworkz.july12;

public class MotherBoardRunner {

	public static void main(String[] args) {
		System.out.println("Running main in MotherBoardRunner");
		MotherBoard ref = new MotherBoard();
		ref.type = "ATX";
		ref.name = "ASUS";
		ref.displayInstance();
	}

}
