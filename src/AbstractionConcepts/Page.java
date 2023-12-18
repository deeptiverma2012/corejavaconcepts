package AbstractionConcepts;

public abstract class Page {
	/*1. Abstract class object cannot be created/ cannot be instantiated/ cannot create object of an abstract class
	  2. An abstract class can have abstract & non abstract methods
	  3. We have to write abstract keyword to create abstract class & method
	  
	  4. Abstract class can have no abstract methods = 0% abstraction
	  5. Abstract class can have only abstract methods = 100% abstraction
	  6. Abstract+ non abstract methods in an abstract class = Partial abstraction
	  7. We can create constructor of an abstract class & it will be called when we create object of child class
	  8. IF we have constructors in both parent & child class, then super class constructor will be called first
	  	*/
	
	public Page()
	{
		System.out.println("Abstract(Parent) class constructor");
	}
	public Page(int a)
	{
		System.out.println("Abstract(Parent) class parameterized constructor");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadTime()
	{
		System.out.println("Page --- 10 sec");
	}
	public void pageLogo()
	{
		System.out.println("Page Logo");
	}
	
	

}
