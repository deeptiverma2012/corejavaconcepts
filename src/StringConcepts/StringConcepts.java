package StringConcepts;


public class StringConcepts {

	public static void main(String[] args) {
/* Using new Keyword[ 2 objects will get created in heap 1 object gets
   created due to new keyword & 1 object gets created due to the 1 entry in the SCP(String constant pool)
   but there is a condition to get an entry in SCP, if the value already exists, the object 
    we are creating start pointing to the same value instead of creating a duplicate entry
 * Duplicate values are not allowed in SCP
  */
		
		String s1 = new String("Hello");// See above comments
// Using literals
		String s2 = "Selenium"; // 1 object gets created in SCP
	
		String s3 = "Hello"; // 0 object will be created because "Hello" already exists in SCP
		
		System.out.println(s1==s3);// it will return false, because == compares memory reference not value
	
	    System.out.println(s1.equals(s3));//.equals compares values
	    
	    String s4 = new String("Hello");// 1 object will be created because "Hello" already exists in SCP
	    
// Q: Which one is better approach to create string? With new keyword or using literals?
// A: String creation through literals is better than new keyword because when we create a string
//using new keyword it creates 2 objects for a single string. Whish is not a good practice in terms of memory.
// Using new keyword will cause memory or performance issues
	
	    String s5 = "Hello";// 0 object
	    
	    String s6 = "hello";// 1 object 
	    
	System.out.println(s1==s3);// it will return false because s1 & s4 are two different objects in heap
	System.out.println(s1.equals(s3));// true , because it is comparing values
	System.out.println(s3 == s5);// it will return true, because in SCP both s3 & s5 are pointing to same value "Hello"
	

    String s7 ="Deepti";// 2 Objects, 1 in heap & 1 in SCP
    String s8 = s7.intern();// .interm method will return a reference of SCP which will point to the same value but in SCP.
	System.out.println(s7 ==s8);// it will return false because s7 is in heap & s8 in SCP
	
	}

}
