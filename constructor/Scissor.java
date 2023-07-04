class Scissor{
	String brand="gingher scissors";
	String color="black";
	String type;
	String usage;
	char size=5;
	String material;
	double price;
	
	Scissor()
	{
		System.out.println("Running no-arg const of main");
	}
	Scissor(String brand,String color)
	{
		System.out.println("Running String,String const of main");
		System.out.println("brand :"+ brand);
		System.out.println("color :"+ color);
		this.brand="gingher scissors";
		this.color="black";
	}
	Scissor (String type)
	{
		System.out.println("Running String const of main");
		this.type=type;
	}
	Scissor (String usage,char size)
	{
		System.out.println("Running String,char const of main");
		System.out.println("size :"+ size);
		this.usage=usage;
		this.size=5;
	}
	Scissor (double price,String type)
	{
		System.out.println("Running double,String const of main");
		this.price=price;
		this.type=type;
	}
	
	Scissor (String material,double price)
	{
		System.out.println("Running String,double const of main");
		this.material=material;
		this.price=price;
		
	}
	Scissor(String brand,String color,double price)
	{
		System.out.println("Running String,String,double const of main");
		System.out.println("brand :"+ brand);
		System.out.println("color :"+ color);
		System.out.println("price :"+ price);
		this.brand="gingher scissors";
		this.color="black";
		this.price=price;
	}
}