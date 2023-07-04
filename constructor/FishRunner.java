class FishRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in FishRunner");
		Fish ref=new Fish();
		System.out.println(ref.name);
		Fish ref1=new Fish("goldenFish","ranchu");
		System.out.println(ref1.name);
		System.out.println(ref1.type);
		Fish ref2=new Fish();
		System.out.println(ref2.price);
		Fish ref3=new Fish();
		System.out.println(ref3.location);
		Fish ref4=new Fish("goldenFish");
		System.out.println(ref4.name);
		System.out.println(ref4.price);
	}
}
		
		