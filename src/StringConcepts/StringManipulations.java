package StringConcepts;

import java.util.Arrays;

public class StringManipulations {

	

	public static void main(String[] args) {
		String str ="Hi This is my java code and i am so happy";
		
		System.out.println(str.length());
		System.out.println("Li="+0);
		System.out.println("Hi="+ (str.length()-1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(40));
   // System.out.println(str.charAt(41));// SIOB - String index out of bound exception
	//	System.out.println(str.charAt(-1));SIOB - String index out of bound exception
		
		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('i'));// first occurance of i
		System.out.println(str.indexOf('i', 2));// This approach is not good because 2 is hardcoded
		
		// Occurence of 2nd 'i'
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		System.out.println("------------------------------------");
		// Occurence of 3rd 'i'
		int x = (str.indexOf('i', str.indexOf('i')+1));
		System.out.println(str.indexOf('i', x+1));
		System.out.println("------------------------------------");
		// Occurence of 4th 'i'
		int y =(str.indexOf('i', x+1));
		System.out.println(str.indexOf('i',y+1));
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Deepti"));// If nothing is available it will give -1
		
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin")>0)
		{
			System.out.println("Word found");
		}
		else
		{
			System.out.println("Not found");
		}
		
		if(msg.indexOf("Admin")!= -1)
		{
			System.out.println("Word found");
		}
		else
		{
			System.out.println("Not found");
		}
		
		//trim 
		String sr = "   Hello   World    ";
		// trim method will trim extra spaces from left & right of the string not the space b/w the words
		System.out.println(sr.trim());
		
		//replace
		
	   System.out.println(sr.replace('o', 'i'));
	    
		String date = "01-01-1990";
		System.out.println(date.replace("-", "/"));
		System.out.println(sr.replace(" ", ""));
		
		// toLowerCase() & toUpperCase()		
		System.out.println(sr.toLowerCase());
		System.out.println(sr.toUpperCase());
		
		// Comparision
		String L1 ="Hello Selenium";
		String L2 ="Hello selenium";
		System.out.println();
		System.out.println(L1.equalsIgnoreCase(L2));// true
		System.out.println(L1.equals(L2));//false
		
		//contains
		String m1 ="Hello This is java";
		System.out.println(m1.contains("java"));// true
		System.out.println(m1.contains("ss"));//false
		
		//sub-string
		
		String loop = "Your id is 1234";		
		System.out.println(loop.substring(4));
		System.out.println(loop.substring(8, loop.length()));
		// To get 1234
		
		System.out.println(loop.substring(loop.indexOf("is")+3, loop.length()));
		
		//split
		String lang ="Java_Python_JavaScript_Ruby";
		String lg[]=lang.split("_");
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));

		String pop = "xXHelloSeleniumxXXTestingXxXAutomationXXxXJava";
		String p[]= pop.split("xX");
		System.out.println(p[0]);//No value will be displayed because there is no value at the left side of 1st xX
		System.out.println(p[1]);// HelloSelenium
		System.out.println(p[2]);//XTestingX
		System.out.println(p[3]);//AutomationXX
		System.out.println(p[4]);//Java
		
		String empInfo = "Ravi;Sharma;IBM;QA;India";
		String emp[]= empInfo.split(";");
		
		String domain = "Java.Python.Ruby.JavaScript";
		String a1[]= domain.split("\\.");// If we ommit \\, it will throw AIOB exception
		System.out.println(a1[0]); 
		
		String A = "This|is|my|java|code";
		String arr[]=A.split("\\|");// If we ommit \\ then it will print the character demending on the index no. not the word
		System.out.println(arr[1]);
		
		// print like I love "Java" coding
		
		//String foo = "I love Java coding";
		System.out.println("I love \"Java\" coding");
		
		//Print like I love 'Java' coding
		
		System.out.println("I love 'Java' coding");
		StringManipulations.getXpath("Deepti");
		
		
	}

	// return xpath in 	String xPath = "//input[@name ='Deepti']"; format
	public static String getXpath(String empName)
	{
		String xPath = "//input[@name ='"+empName+"']";
		System.out.println(xPath);
		return xPath;
	}
}
