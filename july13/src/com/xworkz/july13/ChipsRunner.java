package com.xworkz.july13;

public class ChipsRunner {

	public static void main(String[] args) {
		Chips ref = new Chips("lays");
		ref.ChipsType(ChipsType.salty);
		ref.price="10";
		ref.display();
		Chips ref1=new Chips("bingo");
		ref1.ChipsType(ChipsType.spicy);
		ref1.price="20";
		ref1.display();
	}

}
