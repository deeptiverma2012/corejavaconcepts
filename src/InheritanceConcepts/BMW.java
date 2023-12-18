package InheritanceConcepts;

public class BMW extends Car{
	
	
	int maxSpeed = 200;	
	final String shade ="Red";// It is just a variabler of BMW class , there is no concept known as variable overriding
@Override	
public void start()// Overriden method 
{
	System.out.println("BMW --- Start");
}
public void autoParking()// Individual method
{
	System.out.println("BMW --- Auto Parking");
}
@Override
public void engine()
{
	System.out.println("BMW -- Engine");
}
@Override
public void moveAbles()
{
	System.out.println("BMW --- Movables");
}
// We cannot override final methods in java
/*public final void color()
{
	System.out.println("Black");
}*/

// We cannot override the static methods but parent & child both can have static method with same name
// Method will behave as an individual method of the class
// This is called as method hiding not overriding

//Data hiding: When Parent class & child class both have same static method it is called data hiding not overriding

// In java we can override methods available inside the objects because we have multiple copies 
//of the non-static methods but static methods gets stored inside CMA & only 1 copy of the static members 
//is available in a class
public static void lights()
{
	System.out.println("HD");
}

    
}
