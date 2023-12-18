package Package1;


public class BMW extends Car {

	int chasisNo =10;
	
	// public to protected not allowed
	@Override
	public void CarMethod()
	{
		System.out.println("Car class  --- public method");
	}
	
	// While overriding protected to public method conversion is allowed
	@Override 
	public void protectedMethod()
	{
		System.out.println("Car class --- Protected");
	}
	//Private to public not allowed
	public void CarMethod1()
	{
		System.out.println("Car class  --- private method");
	}
	// default to public is allowed
	@Override
	public void CarMethod2()
	{
		System.out.println("Car class  --- default method");
	}
	
	
	public static void main(String[] args) {
		BMW b = new BMW();
		b.carName = "BMW1";
		System.out.println(b.carName);
		b.color ="Blue";
		System.out.println(b.color);
		//b.price; The field Car.price is not visible because it is a private field
		b.modelNo = 123;// This is a superclass protected field & it is visible in a sub class in same pkg
		
		System.out.println(b.chasisNo);
	
	
	

	


		
	
		
		
		
	}
	
	

}
