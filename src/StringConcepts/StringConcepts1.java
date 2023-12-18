package StringConcepts;

public class StringConcepts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		System.out.println(str+"Selenium");// HelloSelenium will be printed
		System.out.println(str);// String manipulations will not change the actual string value
		//Because String class is immutable 

		
		String str1 = "Hello";
		str1 = str1+"Selenium";
		System.out.println(str1);
/* It will return HelloSelenium but the original value "Hello"
will always remain in memory. That's is why it is not a good practice to manipulate strings directly  */
		String str2 = "Hello";
	System.out.println(str2+100);
	System.out.println(str2+200);
	System.out.println(str2);// str2 is pointing to the original value because string is immutable
	
	StringBuilder sb = new StringBuilder("Tesing");
	sb.append("Automation");// String builder will not create a new entry, 
	//it will append at the end of the same String. String builder is mutable
	System.out.println(sb);
			
	
	
	
	
	
	}

}
