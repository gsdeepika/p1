package com.xworkz.runner;

import com.xworkz.implementation.MobilePhone;
import com.xworkz.implementation.Tablet;

public class MobileRunner {
	public static void main(String[] args) {
		MobilePhone myPhone = new MobilePhone();
		myPhone.powerOn();
		myPhone.powerOff();
		myPhone.makeCall();

		Tablet myTablet = new Tablet();
		myTablet.powerOn();
		myTablet.powerOff();
	}

}