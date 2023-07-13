package com.xworkz.july13;

public class BatteryRunner {

	public static void main(String[] args) {
		Battery ref = new Battery("exide");
		ref.BatteryType(BatteryType.lead);
		ref.price="500";
		ref.color="black";
		ref.display();
		Battery ref1=new Battery("luminous");
		ref1.BatteryType(BatteryType.lithim);
		ref1.price="1000";
		ref.color="blue";
		ref1.display();

	}

}
