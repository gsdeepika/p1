class Kabab{
	String name="chickenkabab";
	String hotelName="baswangudi";
	double price;
	int noOfPieces;
	boolean takeAway;
	Kabab()
	{
		System.out.println("Running no-arg const of main");
	}
	Kabab(String name,String hotleName)
	{
		System.out.println("Running String,String const of main");
		System.out.println("name :"+ name);
		System.out.println("hotelName :"+ hotelName);
		this.name="chickenkabab";
		this.hotelName="baswangudi";
	}
	Kabab (double price)
	{
		System.out.println("Running double const of main");
		this.price=price;
	}
	Kabab (int noOfPieces)
	{
		System.out.println("Running int const of main");
		this.noOfPieces=noOfPieces;
	}
	Kabab(boolean takeAway)
	{
		System.out.println("Running boolean const of main");
		this.takeAway=takeAway;
	}
}