
public class DataTypeAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Write a Java program to add two strings:
		String a = "Hello";
		String b = "Naveen K";
		System.out.println(a+" "+b);
		
		//Write a Java program to print the sum of two numbers.
         
		byte x = 74;
		byte y = 36;
		int z = x+y;
		System.out.println(z);
		
		short x1 = 74;
		short y1 = 36;
		int z1 = x1+y1;
		System.out.println(z1);
		
		//Write a Java program to print the division of two numbers.
		
		byte c = 50;
		byte d = 3;
		byte e = (byte)(c/d);
		System.out.println("The sum of two numbers is:" +e);
		
		
/*4. Write a Java program to compute the specified expressions and print the output. Go to the editor.
Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output :2.138888888888889*/
		
		double p = 25.5f;
		double q = 3.5f;
		double r = 40.5f;
		double s = 4.5f;
		double t = ((p*q - q*q) /(r-s));
		System.out.println("The value of t is:"+" "+ t);
		
		//5. Try to concat "Hello Selenium" with a character 't'.
		
		String s1 = "Hello Selenium";
		char ch ='t';
		
		System.out.println(s1+ch);
		System.out.println(ch+s1);
		System.out.println(s1+" "+ch);
		
	/*6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
	"Your Total  amount is. 3700".*/
		
		int u = 100;
		int v = 200;
		int w = 3400;
		System.out.println("Your Total amount is."+(u+v+w));
		
	//7.Print the ASCII value of the character 'h'.
		
		char ch1 = 'h';
		System.out.println((int)ch1);
		
	//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		char ch2 = 'd';
		byte n = 3;
		//System.out.println((int)ch2);
		System.out.println(ch2+n);
		
	//9. Write a program to find the square of the number 3.9.	
		float num = 3.9f;
		float square = num*num;
		System.out.println(square);
		
		
		
		
		



	}

}
