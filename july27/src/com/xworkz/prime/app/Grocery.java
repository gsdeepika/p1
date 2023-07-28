package com.xworkz.prime.app;

public class Grocery {
private String name;
private String type;

public Grocery(String name, String type) {
	super();
	this.name = name;
	this.type = type;
}

@Override
	public String toString() {
		return " name: " +this.name + " type: " +this.type;
	}


public String getName() {
	return name;
}

public String getType() {
	return type;
}


public boolean equals(Object obj) {
	if(obj!=null) {
		System.out.println("object is not null, can compare");
		if(obj instanceof Grocery) {
			Grocery casted = (Grocery)obj;
			if(this.name==casted.name && this.type==casted.type) {
				System.out.println("both are same");
				return true;
			}
			else
			{
				System.err.println("both are not same");
			}
		}
		else
		{
			System.err.println("object is null, cannot compare");
		}
	}
	return false;
}
}