package com.xworkz.july13;

public class TempleRunner {

	public static void main(String[] args) {
		Temple ref = new Temple("anjaneya");
		ref.TempleType(TempleType.nagara);
		ref.openTime="10";
		ref.display();
		Temple ref1=new Temple("ganesha");
		ref1.TempleType(TempleType.aravinda);
		ref1.openTime="9";
		ref1.display();
	}

}
