
public class MethodsAssignments {
	/*1.Write a program to print the addition/subtraction/division/multiplication 
	 *  of two numbers entered by user by defining your own method*/
	public int getAddition(int a, int b)
	{
		System.out.println("get addition method");
		int c = a+b;
		return c;		
	}
	public int getSubtraction(int a, int b)
	{
		System.out.println("get subtraction method");
		int c = a-b;
		return c;		
	}
	public int getDivision(int a, int b)
	{
		System.out.println("get subtraction method");
		int c = a/b;
		return c;		
	}
	public int getMultiplication(int a, int b)
	{
		System.out.println("get subtraction method");
		int c = a*b;
		return c;		
	}
	
	/*2. Define a method that returns the product of two double numbers entered by user.*/
	
	public double prodCal(double d1, double d2)
	{
		double d3 = d1*d2;
		return d3;
	}
	/*3.Write a program to print the circumference and area of a circle of radius entered 
	 *   by user by defining your own method. */
	public float getCircumferenceOfCircle(float radius)
	{
		float r = radius;
		float pi = 3.14f;
		float d = 2*pi*r;
		return d;
	}
	
	public float getAreaOfCircle(float radius)
	{
		float pi = 3.14f;
		float r = radius;
		float area = pi*r*r;
		return area;
		
	}
	/*4. Define two methods to print the maximum and the minimum number 
	 *   respectively among three numbers entered by user.*/
	
	public int maxCalculator(int a, int b, int c)
	{
		int x =0;
		if(a>b && a>c)
		{
			System.out.println("The maximum no. is:"+ a);
		      x =a;
			
		}
		else if(b>c)
		{
			System.out.println("The maximum no. is:"+b);
			 x =b;
		}
		else
		{
			System.out.println("The maximum no. is:"+c);
			 x =c;
		}
		return x;
	}
	
	public int minCalculator(int a, int b, int c)
	{
		int x=0;
		if(a<b && a<c)
		{
			System.out.println("The minimum no is:"+ a);
			x=a;
		}
		else if(b<c)
		{
			System.out.println("The minimum no is:"+ b);
			x=b;
		}
		else
		{
			System.out.println("The minimum no is:"+ c);
			x=c;
		}
		return x;
	}
	/*5. Def﻿ine a program to find out whether a given
	 *  number is even or odd - return true/false.*/
	
	public boolean getEvenOdd(int a)
	{
		boolean flag = true;
		if(a%2==0)
		{
			System.out.println("It's an even number");
			
		}
		else
		{
			System.out.println("It's an odd number");
			flag = false;
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
      
		MethodsAssignments obj = new MethodsAssignments();
		int sum = obj.getAddition(10, 20);
		System.out.println(sum);
		int sub = obj.getSubtraction(20,40);
		System.out.println(sub);
		int div = obj.getDivision(60, 20);
		System.out.println(div);
		int mul = obj.getMultiplication(100, 5);
		System.out.println(mul);
		System.out.println("-----------------------------------------------");
		
		double d4 = obj.prodCal(35.2, 54.05);
		System.out.println(d4);
		
		System.out.println("-----------------------------------------------");
		
		float f = obj.getCircumferenceOfCircle(2.4f);
		System.out.println(f);
		
		float f1 = obj.getAreaOfCircle(5.0f);
		System.out.println(f1);
		System.out.println("-----------------------------------------------");
		
		int max  = obj.maxCalculator(50, 20, 30);
		System.out.println(max);
		
		int min = obj.minCalculator(60, 10, 20);
		System.out.println(min);
		System.out.println("-----------------------------------------------");
		
		boolean b = obj.getEvenOdd(20);
		System.out.println(b);
		
		
		

	}

}
