import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListAssignments {

	public static void main(String[] args) {
		/*1. Write a Java program to create a new array list, which contains all color names.
             --add some colors (string) 
             ---and print out the colorslist using loops.*/
		
		ArrayList<String> colorsList = new ArrayList<String>();
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Green");
		colorsList.add("White");
		colorsList.add("Purple");
		colorsList.add("Pink");
		colorsList.add("Beigh");
		colorsList.add("Rust");
		colorsList.add("Navy Blue");
		
		System.out.println(colorsList.size());
		for(int i=0; i<colorsList.size();i++)
		{
			System.out.println(colorsList.get(i));
		}
		
		for(String s : colorsList)
		{
			System.out.println(s);
		}
	System.out.println("--------------------------------------------");	
	
/*2. Write a Java program to retrieve an element at a specified index from a given array list.*/
     
	ArrayList<Integer> numList = new ArrayList<Integer>();
	numList.add(11);
	numList.add(12);
	numList.add(14);
	numList.add(15);
	
	System.out.println(numList.get(2));
	System.out.println(numList.get(0));
	System.out.println("--------------------------------------------");	
	
	/*3. Write a Java program to update specific array element by given element.*/
	
	ArrayList<String> daysList = new ArrayList<String>();
	daysList.add("Mon");
	daysList.add("Tue");
	daysList.add("Wed");
	daysList.add("Thu");
	daysList.add("Fri");
	daysList.add("Sat");
	daysList.add("Sun");
	
	daysList.set(0, "Monday");
	daysList.set(1, "Tuesday");
	System.out.println(daysList.get(0));
	System.out.println(daysList.get(1));	
	System.out.println("--------------------------------------------");	
	
	/*4. Write a Java program to remove the third element from an array list.*/
	ArrayList<Float> floatNums = new ArrayList<Float>();
	floatNums.add(11.50f);//0
	floatNums.add(15.62f);//1
	floatNums.add(17.80f);//2
	floatNums.add(14.12f);//3
	floatNums.add(15.00f);//4
	
	
	floatNums.remove(3);
	floatNums.get(3);
	
	for(Float f : floatNums)
	{
		System.out.println(f);
		floatNums.get(3);// Why it is not showing 15.0 at index no. 3
		
	}
	
	/*5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.*/
	
	ArrayList<Object> studNames = new ArrayList<Object>();
	
	studNames.add("Deepti");
	studNames.add(33);
	studNames.add("IT");
	studNames.add(true);
	studNames.add(7);
	
	int count =0;
	for(Object o: studNames)
	{
		System.out.println(o);
		if(o.equals( "IT"))
		{
			System.out.println("Value found");
			
			break;
		}
		count++;
	}	
	System.out.println("--------------------------------------------");	
	/*6. Reverse this array List:
        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Varun");
        studentNames.add("Reena");
        studentNames.add("Naveen");
        studentNames.add("Robin");
        studentNames.add("Peter");*/	
	
	 	ArrayList<String> studentNames = new ArrayList<String>();
	 	studentNames.add("Varun");
	 	studentNames.add("Reena");
	 	studentNames.add("Naveen");
	 	studentNames.add("Robin");
	 	studentNames.add("Peter");
	 	
	 	for(int i=studentNames.size()-1;i>=0;i--)
	 	{
	 		System.out.println(studentNames.get(i));
	 	}
	 	
	 	Collections.reverse(studentNames);
	 	System.out.println(studentNames);
	 	System.out.println("----------------------------------------------");
	
	 	ArrayList<String> colorsList1 = new ArrayList<String>();
		colorsList1.add("Red");
		colorsList1.add("Blue");
		colorsList1.add("Green");
		colorsList1.add("White");
		colorsList1.add("Purple");
		colorsList1.add("Pink");
		colorsList1.add("Beigh");
		colorsList1.add("Rust");
		colorsList1.add("Navy Blue");
	
	 	ArrayList<String> portion = new ArrayList<String>(colorsList1.subList(4, 7));
	 	
	 	for(String st1: portion)
	 	{
	 		System.out.println(st1);
	 	}
	 System.out.println("--------------------------------------------------------");
	 	/*8. Write a Java program to empty an array list.*/
	 
	
	   ArrayList<String> colorsList2 = new ArrayList<String>();
		colorsList2.add("Red");
		colorsList2.add("Blue");
		
		colorsList2.clear();
		System.out.println(colorsList2);// It will print empty list i.e []
	
		System.out.println("--------------------------------------------------------");	
		
	/*9. Write a Java program to trim the virtual capacity of an array list the current list size.*/	
	   
		ArrayList<Integer> numberList = new ArrayList<>(10); 
		 
		numberList.add(10);
		numberList.add(12);
		numberList.add(15);
		
		System.out.println(numberList.size());
		numberList.trimToSize();
		numberList.add(15);
		
		System.out.println(numberList.size());		
		
	/*10. Write a Java program to print all the elements of an ArrayList using the position of the elements.*/
	
		
		ArrayList<Double> marksList = new ArrayList<Double>(5);
		marksList.add(11.06);
		marksList.add(45.00);
		marksList.add(97.00);
		marksList.add(88.50);
		marksList.add(99.50);
		
		for(int i=0;i<marksList.size();i++)
		{
			System.out.println("TheIndex number of the value is"+" "+i+" = " +marksList.get(i));
		}
			
		
	
	}
	
	

}
