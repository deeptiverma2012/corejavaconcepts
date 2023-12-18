package EncapsulationConceps;
/*Assignment 2:
Objective: The objective of this assignment is to create a class that uses encapsulation to hide its implementation details and provide a simple interface for clients.
Instructions:
Create a class called "BankAccount" with the following private attributes: accountNumber (String), balance (double), and owner (String).
Create getter and setter methods for each attribute.
Write a method called "deposit" that takes a double parameter and adds it to the balance.
Write a method called "withdraw" that takes a double parameter and subtracts it from the balance.
Write a method called "printStatement" that prints out the account number, owner name, and balance.
Create an instance of the "BankAccount" class and set its attributes using the setter methods.
Call the "deposit" and "withdraw" methods to modify the balance of the account.
Call the "printStatement" method to verify that the data was set correctly.


Questions:
How can encapsulation be used to hide implementation details from user of a class?

What are the benefits of using private attributes in a class?

What is the difference between a getter method and a setter method?

How can encapsulation improve the readability of code?*/

public class BankAccount {

	private String accountNumber; 
	private double balance;
	private String owner;
	
	public void setAccountNumber(String accountNumber )
	{
		this.accountNumber = accountNumber;
	}
	public String getaccountNumber()
	{
		return this.accountNumber;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public String getOwner()
	{
		return this.owner;
	}
	public double deposite(double depositeAmount)
	{
		balance= balance+depositeAmount;
		return balance;
	}
	public double withdrawl(double withdrawlAmount)
	{
		balance = balance - withdrawlAmount;
		return balance;
	}
	public void printStatement()
	{
		System.out.println(getaccountNumber());
		System.out.println(getOwner());
		System.out.println(getBalance());
	}
	
}
