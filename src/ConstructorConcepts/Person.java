package ConstructorConcepts;

public class Person {
	
/*Assignment 1:
Create a Java class named "Person" with the following instance variables:
name (String)
age (int)
gender (char)
height (double)
Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.

Create a main method that creates two instances of the Person class using the constructor and prints out their information.
Questions:
What is the purpose of a constructor in Java?
1.Constructor name should be same as class name
2.Constructor has no return type/no void
3.Constructors can't return anything
4.Constructor is not made for business logic
5.Constructors help us to initialize the class variables
6.Constructor is restricting the unnecessary object creation
7.Constructor is called when we create an object of the class 

How does a constructor differ from a regular method in Java?
Constructor: 
name: Same as class name
call?: When you create the object of the class
return type: not applicable
overloading: Yes
business logic: avoid
purpose:
1. To initialize the class variables using this keyword
2. To restrict unnecessary object creation
store: auxiliary space
main()/caller method: should not be in the same class

Method/ Function: 

name: any name(but avoid class name)
call?: Create the object of the class & use object reference
return type: may or may not return
overloading: Yes
business logic: Yes
purpose:
1. to define the business logic
store: inside the object(one copy)
main()/caller method: use the main() method in a different class (caller class)


Can a Java class have multiple constructors? If so, how are they differentiated?
Ans: yes, we can create multiple constructors in a java class. We have to overload the constructor. 
They will be differentiated based on the
1. no. of parameter/s
2. the type of the parameter/s
3. sequence of the parameter/s

What happens if a constructor is not defined in a Java class?
Ans: If you don’t implement any constructor in your class, the Java compiler inserts default constructor into your code on your behalf.
 You will not see the default constructor in your source code (the .java file) as it is inserted during compilation and present in the bytecode (.class file).


Can a constructor call other methods or constructors within the same class?*/
	
	String name;
	int age;
	char gender;
	double height;
	String SSN;
	
	//Constructor
	public Person(String name,int age, char gender, double height)
	{
	    this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		
		
	}
	public Person(String SSN)
	{
	  this.SSN = SSN;	
	}
	// Whenever we create a template class, it is not a good approach to have main method in same class.
	// main() method should be in the other class & constructor/s should be used to initialize the class variables using this keyword
	
	
	
	
	
}
