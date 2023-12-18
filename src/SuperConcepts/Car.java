package SuperConcepts;

/* Super keyword : Pointing to parent Object
 * 1. Can be used in child class constructor to call parent class constructor 
 * 2. Super will always be the first statement 
 * 3. We cannot have more than 1 super keyword in a constructor
 * 4. When you have same properties (same variables & overridden methods) in parent class & 
      child class but you want to access parent class properties use
      super.VariableName;
      super.MethodName(); 
 *  */

/* This Keyword: Pointing to child object
 * can call other constructors of the same class
 * either this() or super()
 * this() should be the first statement in constructor
 * This is used to initialize the instance variables with local variables in constructor
 * We can return this also from a method(Builder Pattern)
 * */

public class Car {
	
	int speedLimit =100;
	
	public Car()
	{
		System.out.println("Car class default constructor");
	}
	public Car(int a)
	{
		System.out.println("Car class 1 parameterized constructor");
	}
	public Car(int a, int b)
	{
		this(a);
		System.out.println("Car class 2 parameterized constructor");
	}
	public void logo()
	{
		System.out.println("Car logo");
	}
	public void chasisNo(int x)
	{
		System.out.println(" Car chasis no."+ x);
	}

}
