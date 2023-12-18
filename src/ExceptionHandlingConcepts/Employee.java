package ExceptionHandlingConcepts;

public class Employee {
 String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");		
		try{
			//int x = 10/0;	
			System.out.println("Hello");
			Employee e = new Employee();
			e=null;
			e.name = "Tom";					
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is occurring");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception is occurring");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		
		
		
		

	}

}
