package ConstructorConcepts;
/*Assignment 5:
Create a Java class named "BankAccount" with the following instance variables:
accountNumber (String)
balance (double)
Create a constructor for the BankAccount class that takes in the accountNumber and balance as parameters and initializes the instance variables.
Create a method in the BankAccount class named "deposit" that takes in a double value as a parameter and adds it to the balance instance variable.
Create a method in the BankAccount class named "withdraw" that takes in a double value as a parameter and subtracts it from the balance instance variable.
Create a main method that creates an instance of the BankAccount class using the constructor and performs multiple deposits and withdrawals using the deposit and withdraw methods. Print out the updated balance after each transaction.

Questions:

What is the purpose of an instance variable in Java?
Instance variables are declared inside the class but outside the method.One copy per object. 
Every object has its own instance

How are instance variables different from local variables in Java?
Instance variable:
* Instance variables are declared in the class but outside the method/constructor/block. 
* Scope of the instance variable is inside all methods/block/constructors within a class but 
  not inside static method directly, we have to create the object to access a static member from a non-static method
* Instance variables are created when we create an object/instance of a class is created
* Instance variables gets destroyed when we the instance/object of the class is destroyed
* Gets stored in heap memory
* Instance variables holds default values like for String -null, int 0, float 0.0 etc
* We can use access specifiers with Instance variables
 
 Local variable:
* Local variables are declared inside block/method/constructor
* The scope of local variables is only inside block/method/constructor
* Local variables gets executed when block/method/constructor gets executed & destroyed after exiting the block/method
* Local variables gets stored in stack
* Local variables don't have a default value, it is mandatory to initialize the variables 
* We can not use access specifiers with local variables


What is the access level of an instance variable in Java?
Ans:Instance variables can be public, private, protected & default if no access specifier is declared

What is the purpose of a method in Java?
Ans:The purpose of method is to define the business logic.

Can a method call other methods within the same class?
Ans: Yes, method can call other methods with in the same class.
Non-static methods can call each other directly because all the non-static
methods are available inside each object. These methods can communicate with each other directly.

We can call static methods directly or by using class name

*/
public class BankAccount {

	private String accountNumber ;
	private double balance;
	
	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	public double deposite( double depositeAmount)
	{
		balance= depositeAmount+this.balance;
		return depositeAmount;
	}
	public double withdrawl(double withdrawlAmount)
	{
		this.balance = this.balance - withdrawlAmount;
		return balance;
		
	}
}
