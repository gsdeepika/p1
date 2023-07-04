class KababRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in KababRunner");
		Kabab ref=new Kabab();
		System.out.println(ref.name);
		Kabab ref1=new Kabab("chickenkabab","baswangudi");
		System.out.println(ref1.name);
		System.out.println(ref1.hotelName);
		Kabab ref2=new Kabab();
		System.out.println(ref2.price);
		Kabab ref3=new Kabab();
		System.out.println(ref3.noOfPieces);
		Kabab ref4=new Kabab();
		System.out.println(ref4.takeAway);
		
	}
}
		
		