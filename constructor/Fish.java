class Fish{
	String name="goldenFish";
	String type="ranchu";
	double price;
	String location;
	Fish()
	{
		System.out.println("Running no-arg const of main");
	}
	Fish(String name,String type)
	{
		System.out.println("Running String,String const of main");
		System.out.println("name :"+ name);
		System.out.println("type :"+ type);
		this.name="goldenfish";
		this.type="ranchu";
	}
	Fish (double price)
	{
		System.out.println("Running double const of main");
		this.price=price;
	}
	Fish (String location)
	{
		System.out.println("Running String const of main");
		this.location=location;
	}
	Fish(String name,double price)
	{
		System.out.println("Running String, double const of main");
		System.out.println("name :"+name);
		this.name=name;
		this.price=price;
	}
}