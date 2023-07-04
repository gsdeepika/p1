class PowerBank{
	String brand="intex";
	double battery=5000;
	double price;
	
	PowerBank()
	{
		System.out.println("Running no-arg const of main");
	}
	PowerBank(String brand,double battery)
	{
		System.out.println("Running String,String,double const of main");
		System.out.println("brand :"+ brand);
		System.out.println("battery :"+ battery);
		this.brand="intex";
		this.battery=5000;

	}
	PowerBank (double price)
	{
		System.out.println("Running double const of main");
		this.price=price;
	}
	PowerBank (double battery,double price)
	{
		System.out.println("Running double,double const of main");
		System.out.println("battery :"+ battery);
		this.battery=5000;
		this.price=price;
	}
}