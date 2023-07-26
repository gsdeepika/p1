package com.xworkz.prime.runner;
import com.xworkz.prime.app.Dosa;
public class DosaRunner {

	public static void main(String[] args) {
		Dosa dosa = new Dosa();
		System.out.println(dosa.toString());
		dosa.setName ("masala dosa");
		dosa.setColor ("white");
		dosa.setTaste ("spicy");
		dosa.setPrice (30);
		dosa.setShape ("round");
		
		
		System.out.println(dosa.toString());
        
	}

}