package ExceptionHandlingConcepts;

// throws ArithmeticException meaning all the methods are passing handling exception to the caller method
// Flow of throws
//m3() --> throws to m2() --> throws to m1() --> throws to main() --> throws to JVM 
// but JVM is not going to handle the exception
// Exception should be handled in the method(business method) where it is occurred. OR If yoy are working in 
// integrated project/modules written by some other person then handle the exception in the caller method
// See next prog ThrowsKeyword1 for how to handle it

public class ThrowsKeyword {

	public void m1() throws ArithmeticException
	{
		System.out.println("m1");
		m2();
	}
	public void m2() throws ArithmeticException
	{
		System.out.println("m2");
		m3();
	}
	public void m3() throws ArithmeticException {
		System.out.println("m3");
		int x = 6/0;
		}
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("END");
	}

}
