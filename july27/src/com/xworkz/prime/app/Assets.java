package com.xworkz.prime.app;

public class Assets {
	private String name;
	private String type;
	private String location;
	
	public Assets(String name, String type, String location) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
	}

	@Override
	public String toString() {
		return "name:"+ this.name + "type:"+ this.type + "location:"+ this.location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getLocation() {
		return location;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not null , can compare");
			if(obj instanceof Assets) {
				Assets casted = (Assets)obj;
				if(this.name==casted.name && this.type==casted.type && this.location==casted.location)	{		
					
			System.out.println("both are same");
			return true;
		}
		else {
			System.err.println("both are not same");
		}
	}
	else {
		System.err.println("object is null,cannot compare");
	}
}
return false;
}
}
