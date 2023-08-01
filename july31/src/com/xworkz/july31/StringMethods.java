package com.xworkz.july31;

public class StringMethods {
	public static void main(String[] args) {

		String Fan = "Fan is their in xworkz";

		System.out.println(Fan.charAt(2)); 

		System.out.println(Fan.concat(" air conditioner")); 

		System.out.println(Fan.substring(5));

		System.out.println(Fan.substring(16, 20)); 

		System.out.println(Fan.indexOf("fan")); 
		System.out.println(Fan.indexOf("fan", 25)); 

		String Fan2 = "fan@xworkz";
		String parts[] = Fan.split("xworkz");
		for (String part : parts) {
			System.out.print(part); 
		}
		System.out.println();

		System.out.println(Fan.equalsIgnoreCase(Fan2)); 

		System.out.println(Fan.equals(Fan2)); 

		String Fan3 = "fan.@xworkz-java";

		System.out.println(Fan.compareTo(Fan2)); 

		System.out.println(Fan.compareToIgnoreCase(Fan3)); 

		String name = "Fan";
		char n[] = name.toCharArray();
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		System.out.println(name.toUpperCase()); 

		System.out.println(name.isEmpty()); 

		System.out.println(name.length()); 

		System.out.println(name.startsWith("f"));

		System.out.println(name.replace('a', 'n'));

		System.out.println(Fan2.replaceAll("air", "conditioner")); 

	}
}
