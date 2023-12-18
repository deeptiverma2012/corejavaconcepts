package StringConcepts;

import java.util.Arrays;

public class RevStringAssignment {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Selenium is good";	
		
		String words[] = st.split(" ");
		System.out.println(words.length);
		
		String revString = "";
		
		for(String w : words) {
		String revWord ="";
		for(int i= w.length()-1; i>=0;i--)
		{
			revWord = revWord + w.charAt(i); 
			
		}
		revString = revString+revWord+" ";
       		
		} System.out.println(revString);
		/* 2. Remove all  spaces in a String . 
  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.*/
		
		String S = "    Hello    Everyone   ";		
		System.out.println(S.replace(" ", ""));
		
		/*3. Write a program that will  print out the last character and first character of a word.*/
		String A = "Selenium Automation";
		System.out.println(A.charAt(0));
		System.out.println(A.charAt(A.length()-1));
		
		/*4. Write a program to verify a word or a character contained in the sentence.*/
		
		String B = "I am coding in java";
		System.out.println(B.contains("java"));// returns true
		System.out.println(B.contains("i"));//true
		System.out.println(B.contains("M"));//false
		
		/*5.Write a function/ method to reverse your own name.*/
		String name ="Deepti";
		
		int len = name.length();
		String rev ="";
		for(int i = len-1; i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);		
		
		
		/* 6. Write a program that gives you the last half of the string.*/
		
		String C ="Automation";
		int length = C.length();
		int x = (length/2);
		System.out.println(x);
		System.out.println(C.subSequence(x, length));
		
		/*7.Write a program to get the 3rd  “ e “ of the string. For example: “Welcome to Naveen Automation Labs ! “.*/
		
		String D = "Welcome to Naveen Automation Labs !" ;
		
		System.out.println(D.indexOf('e'));// First occurrence of e 
		System.out.println(D.indexOf('e', D.indexOf('e')+1));// Second occurrence of e
		int n =(D.indexOf('e', D.indexOf('e')+1));// for second occurrence
		System.out.println(D.indexOf('e', (n+1)));
		
		/*8. Write a method which gives an index of (-1) if string is not available. . 
		 * it should return integer. if String is present, then it should return the specific index.*/
		
		String sr = "Hello this is java";
		
		RevStringAssignment.IndexCounter(sr, "lo");
		
		
		/*9. Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop)*/
		 String st1 = "I am coding using java";
		 String[] arr = st1.split(" ");
		 
		 int l = arr.length;
		 
		 for(int i=0; i<= l-1; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 /*10. Assume that a string consists of 3 words, print out the middle one.*/
		 String text = "I love India";
		 
		String newtext[]= text.split(" ");
		
		int Le = newtext.length;
		for(int i=0; i<=Le-1; i++)
		{
			if(newtext[i].contains("love"))
			{
				System.out.println(newtext[i]);
			}
		}
		/*11. get only numeric part from this String:String s = "your transaction id is: 12345 and reference id is 34567";*/
		String str = "your transaction id is: 12345 and reference id is 34567";
	      System.out.println(str.indexOf(':'));
	      int z= str.indexOf(':');
	   String sub = str.substring(24, 28);// Printing first numeric part
	    System.out.println(sub);
	    
	    System.out.println(str.indexOf("is"));// first occurence of is
	    int v = str.indexOf("is");
	    System.out.println(str.indexOf("is",(v+1)));
	    System.out.println(str.substring(50, 55));// Printing second numeric part
	
	
	}
	
	
	
// Answer no.8
	public static int IndexCounter(String sr, String searchStr)
	{
		
		if(sr.contains(searchStr))
		{
			System.out.println("String found");
		System.out.println(sr.indexOf(searchStr));
		   
		}
		
		else {
			System.out.println("String not found");
		}
		return -1;
	
}
}

