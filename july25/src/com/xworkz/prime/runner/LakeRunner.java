package com.xworkz.prime.runner;
import com.xworkz.prime.app.Lake;
public class LakeRunner {

	public static void main(String[] args) {
		System.out.println("Running in main");
		Lake lake=new Lake();
		System.out.println(lake);
		
		Object object=new Lake();
		System.out.println(object);

	}

}
