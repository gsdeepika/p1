package com.xworkz.prime.runner;
import com.xworkz.prime.app.Gold;
public class GoldRunner {

	public static void main(String[] args) {
System.out.println("running main in GoldRunner");

Gold gold = new Gold(200000,15.2,"bhima Jewellers","bhima");
Gold gold2 = new Gold(100000,15.2,"bhima Jewellers","bhima");

boolean result =gold.equals(gold2);
System.out.println("Gold is same:" +result);
	}

}
