package com.xworkz.prime.runner;
import com.xworkz.prime.app.Fan;
public class ConstructorOverloadingRunner {

	public static void main(String[] args) {
    System.out.println("Running main in Constructor Overloading Runner");
		
		Fan reg = new Fan();
		System.out.println(reg);
		System.out.println("");
		
		Fan reg2 = new Fan("LG", "white", "table fan");
		System.out.println(reg2);
		System.out.println("");
		
		Fan reg3 = new Fan("sony", "black", "table fan", 2000);
		System.out.println(reg3);
	}

}
