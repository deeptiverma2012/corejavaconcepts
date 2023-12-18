package ExceptionHandlingConcepts;

public class ThrowsKeyword1 {
	public void m1() 
	{
		System.out.println("m1");
		m2();
	}
	public void m2() 
	{
		System.out.println("m2");
		try {
		m3();}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	public void m3() throws ArithmeticException {
		System.out.println("m3");
		int x = 6/0;
		}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ThrowsKeyword1 obj = new ThrowsKeyword1();
		obj.m1();
		System.out.println("END");
	}

}


