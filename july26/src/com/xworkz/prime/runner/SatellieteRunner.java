package com.xworkz.prime.runner;
import com.xworkz.prime.app.Satelliete;
public class SatellieteRunner {

	public static void main(String[] args) {
		Satelliete satelliete = new Satelliete();
		System.out.println(satelliete.toString());
		satelliete.setType("navigation");
		satelliete.setName("chandrayana");
		satelliete.setColor("blue");
		satelliete.setUses("whether detection");
		satelliete.setOrbit_altitude(0);
		
		System.out.println(satelliete.toString());
	}

}
