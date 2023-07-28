package com.xworkz.prime.runner;
import com.xworkz.prime.app.Grocery;
public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("running main in GroceryRunner");
		
		Grocery grocery = new Grocery("city super market","Vegitables");
		Grocery grocery2 = new Grocery("Megamart", "Fruits");
		
		boolean result = grocery.equals(grocery2);
		System.out.println("Grocery is good:"+ result);

	}

}
