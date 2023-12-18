package EncapsulationConceps;
/*Assignment 1:
Objective: The objective of this assignment is to create a class that uses encapsulation to protect its data and provide getter and setter methods for accessing the data.
Instructions:
Create a class called "Person" with the following private attributes: name (String), age (int), and gender (String).
Create getter and setter methods for each attribute.
Write a method called "printInfo" that prints out the name, age, and gender of the person.
Create an instance of the "Person" class and set its attributes using the setter methods.
Call the "printInfo" method to verify that the data was set correctly.
Questions:

Q:What is encapsulation and how does it relate to object-oriented programming?
A: * Hiding data members of the class is known as Encapsulation.
* We have hidden the data members inside a class & specified access specifiers so that they are not accessible to any other class. Thus
  encapsulation is a kind of data hiding
* Data & methods are enclosed inside a single unit
* Encapsulation acts as a protection shield around the data. It
  protects data from the unauthorized access from the outside world.
* It protects the sensitive data of the application.
In Java, there are two steps to implement encapsulation. Following are the steps:
Use the access modifier ‘private’ to declare the class member variables.
To access these private member variables and change their values, we have to provide the public getter and setter methods respectively.
Now we can read the values of the private variables and set new values for these variables using getter and setter methods.

  
Q: Why is it important to use getter and setter methods instead of accessing attributes directly?
A: Setter & getter methods help us to create a public layer over the private layer of the class.
   Setter & getters protect data from unauthorized external access.Therefore, they help to protect the sensitive data

Q: How can encapsulation improve the security and reliability of a program?
A: To access these private member variables and change their values, we have to provide the public getter and setter methods respectively.
 Now we can read the values of the private variables and set new values for these variables using getter and setter methods.

Refer to Read/ Write access permissions table https://app.box.com/notes/1284204193629

Q: What is the difference between a private attribute and a public attribute?
A: The scope of private attributes are only inside the class in which they are declared.
We cannot directly call private data members of any class. If we want to use these attributes outside the class then we have to 
create public getter & setter methods to set & get the data.

The scope of Public attributes is public & they can be accessed anywhere. Inside the class, outside the class in a non-subclass, in a sub class,
inside the same pkg, in some other. We call call public non-static attributes by creating the object of the class.
We can access public static attributes directly inside the class & outside the class by using classname.methodName

Q: How does encapsulation help with code maintainability and scalability?
A: With Encapsulation data & methods can be created in a maintainable & protected way
Which enhance the security through data hiding, reusability & scalability of the code.
*/
public class Person {

	private String name;
	private int age;
	private String gender;
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
	    return this.gender;	
	}
	private void printInfo()
	{
		System.out.println(getName());
		System.out.println(getAge());	
		System.out.println(getGender());
	}
   public void printValues()
   {
	   printInfo();
   }
}
