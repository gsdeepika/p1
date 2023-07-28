package com.xworkz.prime.runner;
import com.xworkz.prime.app.Vehicle;
public class VehicleRunner {

	public static void main(String[] args) {
System.out.println("running main in vehicle runner");

Vehicle vehicle = new Vehicle(50000,100,"car","toyota","toyota");
Vehicle vehicle2 = new Vehicle(50000,100,"car","toyota","toyota");

boolean result = vehicle.equals(vehicle2);
System.out.println("vehicle is same:" +result);
	}

}
