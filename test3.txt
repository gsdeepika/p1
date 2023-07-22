1. Syntax Error
2. Error
3. Error
4. length is: 4
   sum of values is: 200
   
6. method parameter is a variable that is used to pass data to a method when it is called. 
   While  defining a method we can specify one or more parameters in its parameter list. 
   
7. Compile-time polymorphism in Java is achieved through method overloading. 
   Method overloading means define multiple methods with in the same class but with different parameter lists. 
   The Java compiler determines which method to invoke and  types of arguments passed during the method call. 
   This decision is made at compile time, so it is called as compile-time polymorphism.

8. The var-args allows the method to accept zero or muliple arguments. 
   If we don't know how many argument we will have to pass in the method, varargs is the better approach.
   
9. package is a group of similar types of classes, interfaces and sub-packages.
   * implict
   * explict

10. Constructor chaining is a process of calling one constructor from another constructor within the same class. 
    constructor can call another constructor using  this() keyword or the super() keyword.
	class Infosys{
	String founderName;
	String founderWifeName;
	int founded;
	
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
}
	
11. public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 0) 
		{
            return 0;
        } 
		else if (n == 1) 
		{
            return 1;
        } 
		else
		{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args)
	{
        int n = 10; 

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(fibonacci(i) + " ");
        }
    }
}

13. class Main
{
    public static void main(String[] args) 
   {
    Object[] a = new Object[] {1, 5, 7, 9};
    Object[] b = new Object[] {9, 5, 1, 7};
    Object[] c = new Object[] {1, 6, 7, 5};
      
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);

    boolean return1 = Arrays.equals(a,b);
    System.out.println("Array a and b equal?: " + return1);

    boolean return2 = Arrays.equals(b,c);
    System.out.println("Array b and c equal?: " + return2);
  }
}

14. Enum is a special datatype which is used to group number of constants.

15. First it will allocate the memory for variables in intance memory,
    it will copy the variables in instance memory,
    initialize the variables in constant pool,
    after invoking it by reference the variables will get the values which are pointed from constant pool.
	
16.  1.Instance variables.
     2.Methods.
     3.Static and non static methods.
     4.Constructors.





                                                   






	
   