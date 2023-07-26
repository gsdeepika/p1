package com.xworkz.prime.runner;
import com.xworkz.prime.app.HeadSet;
public class HeadSetRunner {

	public static void main(String[] args) {
		HeadSet headSet = new HeadSet();
		System.out.println(headSet.toString());
		headSet.setName ("beast");
		headSet.setColor ("black");
		headSet.setBrand ("sony");
		headSet.setPrice (2000);
		headSet.setShape ("circular cups");
		
		System.out.println(headSet.toString());

	}

}
