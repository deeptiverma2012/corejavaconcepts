
public class MrthodAssignments1 {
	
//6. A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to﻿ vote. - return true/false

	public boolean getAgeEligibility(int age)
	{
		boolean flag = true;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible");
			flag = false;
		}
		return flag;
	}
/*7. Write a program which will ask the user to enter his/her marks (out of 100).
 *  Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/

	public void getGrade(int marks)
	{
		if(marks >=91 && marks <=100 )
		{
			System.out.println("Grade: AA");
		}
		else if(marks>=81 && marks <=90)
		{
			System.out.println("Grade : AB");
		}
		else if(marks>=71 && marks <=80)
		{
			System.out.println("Grade : BB");
		}
		else if(marks>=61 && marks <=70)
		{
			System.out.println("Grade : BC");
		}
		else if(marks>=51 && marks <=60)
		{
			System.out.println("Grade : CD");
		}
		else if(marks>=41 && marks <=50)
		{
			System.out.println("Grade : DD");
		}
		else if(marks<=40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Please enter a valid number");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MrthodAssignments1 obj = new MrthodAssignments1();
		boolean b = obj.getAgeEligibility(15);
		System.out.println(b);
		System.out.println("----------------------------------------");
		
		obj.getGrade(60);
		

	}

}
