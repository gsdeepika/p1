package com.xworkz.prime.runner;
import com.xworkz.prime.app.Clock;
import com.xworkz.prime.app.AnalogWatch;
public class HybridRunner {

	public static void main(String[] args) {
			System.out.println("Running main in Hybrid Runner");
			
			AnalogWatch reg = new AnalogWatch("techlog", "black", "ajantha", 1000, "noise", 5000, "firebolt", "pink");
			reg.printInfo();
			System.out.println("");
			Clock reg1 = new Clock("titan", "blue", "cuckoo", 3000);
			reg1.printInfo();
	}

}
