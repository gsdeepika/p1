package com.xworkz.july13;

public class ResortRunner {

	public static void main(String[] args) {
		Resort ref = new Resort("royal villa");
		ref.ResortType(ResortType.beach);
		ref.ownerName="anjali";
		ref.display();
		Resort ref1=new Resort("paradise");
		ref1.ResortType(ResortType.golf);
		ref1.ownerName="anuoop";
		ref1.display();
	}

}
