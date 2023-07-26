package com.xworkz.prime.runner;
import com.xworkz.prime.app.Calculator;
public class CalculatorRunner {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.toString());
		calculator.setName ("casio");
		calculator.setPrice (900);
		calculator.setNoOfButtons (25);
		calculator.setVersion (3);
		calculator.setColor ("black");
		
		
		System.out.println(calculator.toString());
	}
}
