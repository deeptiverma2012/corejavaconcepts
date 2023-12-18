package ConstructorConcepts;
/*Assignment 3:
Create a Java class named "Employee" with the following instance variables:
id (int)
name (String)
salary (double)
Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.
Create getter methods for each of the instance variables.
Create a main method that creates an instance of the Employee class using the constructor, prints out the employee's information using the getter methods, and gives the employee a 10% raise using the setter method for the salary instance variable.
Questions:
Q1: What is the purpose of a getter method in Java?
A: Getter methods are used to get the values of the private variables.
We can achieve encapsulation with the help of getter & setter methods.
Q2: Can a getter method return void?
A: Getter methods are used to retrieve values of the private variables of a class. 
If we make a getter method void, it means it is not going to return/ retrieve any value.
so, there is no point of using the void getter method.

Q: What is the access level of a getter method in Java?


Q: What is the purpose of a setter method in Java?
A: The purpose of setter method is to set the value of a private variable.
In case, if we are setting the value of a private variable using a constructor in that case
if we want to update the value of the same variable, we can update it through the setter method.

Q:Can a setter method return a value other than void?
A: We use setter method to set the value of private variables. It is used to post the data,
that's why it should be void in nature. To retrieve/return or get the value we have getter method.
*/
public class Employee {
private int id;
private String name;
private double salary;

public Employee(int id,String name,double salary)
{
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public void setSalary(double salary)
{
   this.salary = salary+salary*0.1;
   
}
public int getId()
{
	return this.id;
		
}
public String getName()
{
	return this.name;
}
public double getSalary()
{
	return this.salary;
}




	
}
