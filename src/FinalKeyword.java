
public class FinalKeyword {

	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String args)
	{
		System.out.println(args);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x=10;
		FinalKeyword obj = new FinalKeyword();
		System.out.println(x);
		//System.out.println(obj.x);
		//static y =5; static is not allowed inside method
		
		//Q: Why main method is static 
		//Ans:So that JVM can access main method(From CMA : Common memory allocation) directly without
		//creating an object of the class
		
		//Q: Why main method is void in nature?
		// Ans. We are not returning anything from main method. We are not writing any bussiness logic inside the main method
		// main method is called as caller method
		
		// Q: Why main method is public?
		// Ans. So that JVM can access the main method from CMA(Common Memory Allocation) directly.
		
		// Can we overload main method?
		//Ans. Yes. examples are given above
		FinalKeyword.main(3);
		FinalKeyword.main(1,2);
		FinalKeyword.main("Hello");
	}

}
