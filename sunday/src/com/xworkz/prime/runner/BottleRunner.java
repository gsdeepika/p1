package com.xworkz.prime.runner;
import com.xworkz.prime.app.Bottle;
public class BottleRunner {

	public static void main(String[] args) {
      System.out.println("Running main in bottle Runner");
		
      Bottle ref = new Bottle("tupperwear", 10, "blue");
		ref.bottle();

	}

}
