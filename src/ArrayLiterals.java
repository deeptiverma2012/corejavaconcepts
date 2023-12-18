import java.util.Arrays;

// Arrays - Collection of similar type of data
/* Limitations:
 * 1. Size is fixed: Static Array, to overcome this we use dynamic array(ArrayList)
 * 2. Can store only similar type of data */


public class ArrayLiterals {

	public static void main(String[] args) {
		
	/*	There are two ways to create Array
	 * 1. Using new keyword
	 * 2. Using Array Literals
	 */
		// with new keyword
		// When you are not sure about the values, use new keyword
		int i[]= new int[3];
		
		//Array Literals: When you already have the values
		//Without using new keyword
		// we can use everything that we use in case of Array using new keyword
		// We can use Array literals with  data of the all datatypes
		
		int j[]= {1,2,3,4,5,6};
		
		System.out.println(j.length);
		System.out.println(Arrays.toString(j));
		
		for(int k=0; k<=j.length-1;k++)
		{
			System.out.println(j[k]);
		}
		
		String stuNames[] ={"Abha","Mick","Rohan","Arby","Micheal"};
		System.out.println(Arrays.toString(stuNames));
		
		for(String s : stuNames)
		{
			System.out.println(s);
		}
		
		System.out.println("*********************");
		
		Object ob[]={"Deepti",33,'F',"IT"};
		
		// Print 10 to 1 using reverse for loop
		for(int l = j.length-1;l>=0;l--)
		{
			System.out.println(j[l]);
		}
		
		

	}

}
