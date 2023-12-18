package InheritanceConcepts;


public class Car extends Vehicle{
	
	int maxSpeed = 100;
	final String shade ="Black";
	public void start()
	{
		System.out.println("Car --- Start");
	}
	public void stop()
	{
		System.out.println("Car --- Stop");
	}
	public void refule()
	{
		System.out.println("Car --- Car Refule");
	}
	public void engine()
	{
		System.out.println("Car -- Engine");
	}
	public final void color()
	{
		System.out.println("Black");
	}
	
	//Static methods cannot be overriden
	public static void lights()
	{
		System.out.println("HD");
	}
	
	// Private method/s cannot be overriden
	private void tyrePressure()
	{
		System.out.println(" Car--34");
	}
	
	public void getTyrePressure()
	{
		tyrePressure();
		// shade="blue";// We cannot change the value of a final variable in the same class
	}
	

}
