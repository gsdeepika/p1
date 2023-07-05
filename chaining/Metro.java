class Metro{
	String line;
	String start;
	int distance;
	String destination;
	int capacity;
	
	Metro(String line)
	{
		System.out.println("Running Metro");
		this.line="yellow";
	}
	Metro(String line,String start)
	{
		System.out.println("Running String,String const of main");
		//System.out.println("line :"+ line);
		//System.out.println("start :"+ start);
		this.line=line;
		this.start=start;
	}
	Metro (String line,String start,int distance)
	{
		this(line,start);
		System.out.println("Running int const of main");
		//System.out.println("distance :"+ distance);
		this.distance=distance;
	}
	Metro (String line,String start,int distance,String destination)
	{
		this(line,start,distance);
		System.out.println("Running String const of main");
		//System.out.println("destination :"+ destination);
		this.destination=destination;
	}
	Metro (String line,String start,int distance,String destination,int capacity)
	{
		this(line,start,distance,destination);
		System.out.println("Running int const of main");
		//System.out.println("capacity :"+ capacity);
		this.capacity=capacity;
	}
}