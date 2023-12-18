package StringConcepts;

public class DataConversion {

	public static void main(String[] args) {
	String x = "100";
	System.out.println(x+20);// 10020
	
	// Wrapper: Wrap on primitive classes
	// String to integer :Integer
	
	int y = Integer.parseInt(x);
	System.out.println(y+20);//120
	
	//String to double:Double
	
	String a = "100.20";
	System.out.println(a+20);//100.2020
	
	double d=  Double.parseDouble(a);
	System.out.println(d+20);//120.20
	
	//String to boolean : Boolean
	String c = "true";
	boolean b = Boolean.parseBoolean(c); 
	System.out.println(b);
	
	String RemoteExecution = "true";
	boolean flag = Boolean.parseBoolean(RemoteExecution);
	
	if(flag)// 
	{
		System.out.println("Execute on AWS");
	}
	else
	{
		System.out.println("Execute on Local");
	}
	// Boolean, Double & Integer are wrapper class	
	// int to String: String is a class but not a wrapper clasas	
 
	int value = 40;
	String s = String.valueOf(value);
	System.out.println(s.length());
	
	// double to string
	
	double sal = 55.84;
	String salValue = String.valueOf(sal);
	System.out.println(salValue.length());
	
	//Interview Question: Convert String to int
	//A: We cannot directly convert alphanumeric sting to int, we have to first separate no & string part 
	
	String A ="100A";
	//int B = Integer.parseInt(A);
	//System.out.println(B);//  java.lang.NumberFormatException: For input string: "100A"
	
	String B = (String) A.subSequence(0, 3);
	int C =Integer.parseInt(B);
	System.out.println(C+15);//115
	
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	
	
	
	
	

	}

}
