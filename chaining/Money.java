class Money{
	String country;
	String currency;
	int denomination;
	int type;
	
	Money(String country)
	{
		System.out.println("Running Infosys");
		this.country=country;
	}
	Money(String country,String currency)
	{
		System.out.println("Running String,String const of main");
		this.country=country;
		this.currency=currency;
	}
	Money (String country,String currency,int denomination)
	{
		this(country,currency);
		System.out.println("Running int const of main");
		this.denomination=denomination;
	}
	Money (String country,String currency,int denomination,int type)
	{
		this(country,currency,denomination);
		System.out.println("Running int const of main");
		this.type=type;
	}
}