import java.util.ArrayList;
import java.util.Arrays;


public class MethodTypes {
	//Cannot create a method inside a method
			// Can call a method inside a method
			//Methods are always independent // Parallel to each other
			//Methods: Behavior of object/class
			//Methods & variables: Class data members
			//Duplicate methods are not allowed
			// Only non static methods will be given to object. Object will always hold non static methods
			// Variables: Also called Class attributes
	
			
			// Types of Methods: Type 1. (No input & no return methods)/void methods
		public void test()
		{
			System.out.println("This is test method");
		}

		// Type 2: (No input some output)
		public int sum()
		{
			int a =10;
			int b=20;
			int c=a+b;
			return c;
		}
		public String getNames()
		{
			System.out.println("This is get names method");
			String name ="Deepti";
			return name;
		}		
		//Q: Can we return 2 values in a method(like return a; return b;)?
		//Ans: No
		
		public ArrayList<String> names()
		{
			System.out.println("This is names method");
			String s1 = "Ravi";
			String s2 ="Sargun";
			
			ArrayList<String> arr = new ArrayList<String>();
			arr.add(s1);
			arr.add(s2);
			return arr;			
		}
		public String[] getEmployee()
		{
			System.out.println("This is get employee method");
			String emp[]= {"Ravi", "Sargun","Siya"};
			return emp;
		}
		//Type 3: Some input & some return
		public int getAddition(int a, int b)
		{
			int c = a+b;
			return c;
		}
		
		public float getBillAmount(int foodBill, int drinksBill, float tax)
		{
			float finalBill = foodBill+drinksBill+tax;
			return finalBill;
		}
	
		public static void main(String[] args) {
		//Call the method: create the object of the class
		MethodTypes obj = new MethodTypes();
		obj.test();
		
		int s = obj.sum();
		System.out.println(s);
		
		String name = obj.getNames();
		System.out.println(name);
		
		ArrayList<String> list= obj.names();
		System.out.println(list);
		
		String s1[]= obj.getEmployee();
		System.out.println(Arrays.toString(s1));
		
		// Call by value/ Call a method/function by passing value/argument
		int addition = obj.getAddition(10, 30);
		System.out.println(addition);
		float TotalBill = obj.getBillAmount(200, 120, 7.5f);
		System.out.println("Total Bill is :"+TotalBill);
		
		
		
	
		
		

	}

}
