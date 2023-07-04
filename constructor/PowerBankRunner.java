class PowerBankRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in PowerBankRunner");
		PowerBank ref=new PowerBank();
		System.out.println(ref.brand);
		PowerBank ref1=new PowerBank("intex",5000);
		System.out.println(ref1.brand);
		System.out.println(ref1.battery);
		PowerBank ref2=new PowerBank();
		System.out.println(ref2.price);
		PowerBank ref3=new PowerBank(5000);
		System.out.println(ref3.battery);
		System.out.println(ref3.price);
	}
}
		