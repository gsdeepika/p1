package com.xworkz.runner;

import com.xworkz.implementation.Backpack;
import com.xworkz.implementation.Handbag;

public class BagRunner {
	public static void main(String[] args) {
		Handbag purse = new Handbag();
		purse.display();
		purse.open();
		purse.carry();

		Backpack schoolBag = new Backpack();
		schoolBag.display();
		schoolBag.open();
	}

}