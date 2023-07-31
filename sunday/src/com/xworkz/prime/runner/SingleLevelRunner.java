package com.xworkz.prime.runner;
import com.xworkz.prime.app.SlipperShop;
public class SingleLevelRunner {

	public static void main(String[] args) {
System.out.println("Running main in Single Level Runner");
		
SlipperShop ref = new SlipperShop("flipflop", 7, "shastas", "women");
		ref.printInfo();

	}

}
