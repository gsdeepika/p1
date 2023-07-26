package com.xworkz.prime.runner;
import com.xworkz.prime.app.President;
public class PresidentRunner {

	public static void main(String[] args) {
		President president=new President();
		System.out.println(president.toString());
		
		Object object=new President();
		System.out.println(object);

	}

}
