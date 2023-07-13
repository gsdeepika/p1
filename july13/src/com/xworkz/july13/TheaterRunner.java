package com.xworkz.july13;

public class TheaterRunner {

	public static void main(String[] args) {
		Theater ref = new Theater("SLN");
		ref.theaterType(TheaterType.thrust);
		ref.openTime="10";
		ref.display();
		Theater ref1=new Theater("SBG");
		ref1.theaterType(TheaterType.arena);
		ref1.openTime="11";
		ref1.display();
 
	}

}
