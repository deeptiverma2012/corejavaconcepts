package EncapsulationConceps;
// POJO class - Plain old Java Object
public class Employee {
	private String name;
	private int id;
	private String city;
	private boolean isActive;
	
	
	// Creating a constructor
	public  Employee(String name, int id, String city, boolean isActive)
	{
		this.name =name;
		this.id = id;
		this.city= city;
		this.isActive = isActive;
	}
	
	// public getter & setter methods
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setid(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isActive() {
		return isActive;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
