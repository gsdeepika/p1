class MetroRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in MetroRunner");
		
		Metro ref=new Metro("yellow");
		System.out.println("line"+ref.line);
		System.out.println("start"+ref.start);
		System.out.println("distance"+ref.distance);
		System.out.println("destination"+ref.destination);
		System.out.println("capacity"+ref.capacity);
		
		Metro ref1=new Metro("yellow","banasankari");
		System.out.println("line"+ref1.line);
		System.out.println("start"+ref1.start);
		System.out.println("distance"+ref1.distance);
		System.out.println("destination"+ref1.destination);
		System.out.println("capacity"+ref1.capacity);
		
		Metro ref2=new Metro("yellow","banasankari",20);
		System.out.println("line"+ref2.line);
		System.out.println("start"+ref2.start);
		System.out.println("distance"+ref2.distance);
		System.out.println("destination"+ref2.destination);
		System.out.println("capacity"+ref2.capacity);
		
		Metro ref3=new Metro("yellow","banasankari",20,"majestic");
		System.out.println("line"+ref3.line);
		System.out.println("start"+ref3.start);
		System.out.println("distance"+ref3.distance);
		System.out.println("destination"+ref3.destination);
		System.out.println("capacity"+ref3.capacity);
		
		Metro ref4=new Metro("yellow","banasankari",20,"majestic",300);
		System.out.println("line"+ref4.line);
		System.out.println("start"+ref4.start);
		System.out.println("distance"+ref4.distance);
		System.out.println("destination"+ref4.destination);
		System.out.println("capacity"+ref4.capacity);
		
	}
}
		
		