package com.xworkz.prime.runner;
import com.xworkz.prime.app.Tap;
public class TapRunner {

	public static void main(String[] args) {
		Tap tap = new Tap();
		System.out.println(tap.toString());
		tap.setName ("bib cock");
		tap.setColor ("silver");
		tap.setBrand ("hindware");
		tap.setPrice (30);
		tap.setShape ("oval");
		
		System.out.println(tap.toString());
	}

}
