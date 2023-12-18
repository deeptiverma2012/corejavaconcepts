package WebDriverArchitecture;

public class Test {
	/* Q: If I have a class & I don't want to anyone to create it's object. What should I do?
	   A: Make it's constructor private
	   
	   Q: In Java which class is having a private constructor?
	   A: System class. We cannot create an object of a system class
	   
	   Q: When a class is having private constructor then what kind of methods 
	   you'll create in that class?
	   A: Static methods so that we can call them directly with class name.
	   
	   Q: Explain System.out.println
	   A: 	System is a class 
	    	out is a static variable
	    	the type of out is print stream 
	    	Inside print stream println is a method	   
	    	
	   Q: What is the purpose of making constructor private & static methods?
	   A: So that nobody will create the object of the class & methods can be called directly.
	   With a private constructor we are restricting the object creation. If anyone cannot 
	   create the object then with class name they can access the methods directly. 	
	*/
	
	private Test()
	{
		System.out.println("Private constructor");
	}
	
	public static void getTest()
	{
		System.out.println("This is get test method");
	}
	public static void testing()
	{
		System.out.println("Testing method");
	}

}
