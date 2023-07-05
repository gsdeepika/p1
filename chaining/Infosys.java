class Infosys{
	String founderName;
	String founderWifeName;
	int founded;
	int totalEmployees;
	
	Infosys(String founderName)
	{
		System.out.println("Running Infosys");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName)
	{
		System.out.println("Running String,String const of main");
		this.founderName=founderName;
		this.founderWifeName=founderWifeName;
	}
	Infosys (String founderName,String founderWifeName,int founded)
	{
		this(founderName,founderWifeName);
		System.out.println("Running int const of main");
		this.founded=founded;
	}
	Infosys (String founderName,String founderWifeName,int founded,int totalEmployees)
	{
		this(founderName,founderWifeName,founded);
		System.out.println("Running int const of main");
		this.totalEmployees=totalEmployees;
	}
}