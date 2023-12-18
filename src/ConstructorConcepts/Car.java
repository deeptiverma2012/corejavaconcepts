package ConstructorConcepts;
/*Assignment 4:
Create a Java class named "Car" with the following instance variables:
make (String)
model (String)
year (int)
Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
Create a main method that creates three instances of the Car class using both constructors and prints out their information.
Questions:

What is the purpose of a default constructor in Java?

Can a default constructor take in parameters?

Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?

Can you create an object of a Java class without calling a constructor?

How are instance variables accessed and modified outside of the class they are defined in?

*/
public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public Car()
	{
		this("Unknown","Unknown",0 );
		
	}
	
	public Car(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake()
	{
		return this.make;
	}

	public String getModel()
	{
		return this.model;
	}
	public int getYear()
	{
		return this.year;
	}
}
