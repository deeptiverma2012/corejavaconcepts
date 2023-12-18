package StringConcepts;

public class StringReverse {

	public static String reverseString(String str)
	{ 
	  // null check
	  // Case 1: In case str = null
	  if(str == null)
	  {
		  System.out.println(" Value entered is null");
		  //return null;
		  return "String is null";		  
		 
	  }
	  // Case 2: If the string is space
	  
	  if(str.isBlank())
	  {
		  System.out.println("hiiiiiiiiiiiii");
		  return "hi";
	  }
	  
	  int len = str.length();
	  String rev ="";
	 
	  //length check
	  // Case 3: In case passing single character or length =1
	  if(len == 1 || len == 0)
		{
			System.out.println("Code inside if block");
			return str;
		}
		
		
		
		for(int i= len-1; i>=0; i--)
		{
			rev = rev+ str.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
	
	public static void revMethod(String str)
	{
		String arr[] = str.split(" ");
		int len = arr.length;
		for(int i=len-1; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
			
	}
	public static void main(String[] args) {
		//WAF : name :reverseString
		//Param String: str
		// return String:reversedString 
		
//		StringReverse.reverseString("Selenium");
//		StringReverse.reverseString("Alphabetics");
    	//StringReverse.reverseString("Selenium Automation");
		//StringReverse.reverseString("T");
		//StringReverse.reverseString(null);// NPE if we do not handle case 1
		StringReverse.reverseString("");
		StringReverse.reverseString(" ");
		StringReverse.reverseString("     ");
		StringReverse.reverseString("Selenium is good");
		String str = "Selenium";
		
		StringBuilder sb = new StringBuilder(str);
		//System.out.println(sb.reverse());
		StringReverse.revMethod("I am the best");
		

	}

}
