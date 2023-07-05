class MoneyRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in MoneyRunner");
		
		Money ref=new Money("india");
		System.out.println("country"+ref.country);
		System.out.println("currency"+ref.currency);
		System.out.println("denomination"+ref.denomination);
		System.out.println("type"+ref.type);
		
		
		Money ref1=new Money("india","rupees");
		System.out.println("country"+ref1.country);
		System.out.println("currency"+ref1.currency);
		System.out.println("denomination"+ref1.denomination);
		System.out.println("type"+ref1.type);
		
		Money ref2=new Money("india","rupees",7);
		System.out.println("country"+ref2.country);
		System.out.println("currency"+ref2.currency);
		System.out.println("denomination"+ref2.denomination);
		System.out.println("type"+ref2.type);
		
		Money ref3=new Money("india","rupees",7,2);
		System.out.println("country"+ref3.country);
		System.out.println("currency"+ref3.currency);
		System.out.println("denomination"+ref3.denomination);
		System.out.println("type"+ref3.type);
		
	}
}
		
		