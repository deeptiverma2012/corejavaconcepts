
public class StachOverflowConcept {
// WAP: m1(), m2(), m3(), static f1(), static f2()
// We can call static variables & methods directly or using class name(Like f1(); or classname.f1();)
//	A static method can call other static methods & variables directly throughout the class
/* Static method cannot call non- static methods directly. by creating the object of the class
	inside the static method to call the non static data members */
// Non -static members can access static members directly.
/*All the non static methods can interact with each other because they are inside the same object.
	Therefore non-static methods can call each other directly */
	
	public void m1()
	{
		System.out.println("m1 method");
		m2();
	}
	public void m2()
	{
		System.out.println("m2 method");
		m3();
	}
	public void m3()
	{
		System.out.println("m3 method");
		m1();
	}
	public static void  f1()
	{
		System.out.println("f1 method");
		//f2();
	}
	public static void  f2(StachOverflowConcept ob )
	{
		System.out.println("f2 method");
		//m1();// We cannot call non static method inside a static method, We have to create an object of the class
	    ob.m1();
	    f1();
	}
	
	public static void main(String[] args) {
		StachOverflowConcept obj = new StachOverflowConcept();
		obj.m1();
		f2(obj);
		
		
		

	}

}
