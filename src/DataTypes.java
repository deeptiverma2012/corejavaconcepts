
public class DataTypes {

	public static void main(String[] args) {
		//Java is strict type along with compile time & run time
		//There are two types of datatypes in Java
		//Primitive datatype : We don't need any object/reference to use them
		// Non-primitive datatype : We need to use object/reference
		//e.g: Array, Class, Object, interface
		
		//Primitive type 
        //1. Boolean Type : true/false
		//2. Numeric Type:
		//2(a) Character :Char: a-z, A-z, 0-9
		//2(b)Integral Value
		      //1. Integer : byte, short, int, long
		      //2.Floating point : float, double
		
		//1. byte
		// Size byte = 8 bits
		// -128 to 127 = -2^7 to 2^7-1
		
		byte a =10;
		byte b = 20;
		//byte c= a+b; this will not accept it because after adding two bytes the resultant 
		//can be something that doesn't belong to the range of the byte i.e why it ask to convert it in a bigger datatype "int"
		
		int c = a+b; // we have to store the result of arithmetic operation on two byte in a int
		
		byte d =10;
		/*byte d =15; This is not allowed because we already have a variable d which is 
		 occuping space in memory & we cannot create variable with same name.*/
		
		d=20;// it is allowed because it will update the value of d in the space occupied by the memory
		
		System.out.println(d);
		
		
		//2. short
		// size: double of byte i.e 2 bytes = 16 bits
		// range : -32768 to 32767
		
		short s = -1536;
		short s1 = 14652;
		/* short s2 = s+s1; Java will not allow this, the reason is same as we have in case of byte */

		// 3. integer
		// size : double of short i.e 4 bytes = 32 bits
		//range : 2147483648 to 2147483647 = 2^31 to 2^31-1
		
		int i=10; // it is consuming 32 bits just to store 10. We should rather use byte/short if the value is not higher to save the memory
		
		
		// 4. long 
		// size double of integer : 8 bytes = 8*8 bits = 64 bits
		// range: -9223372036854776000 to 9223372036854776000-1 = -2^63 to 2^63-1
		// long can be used to store very high values like platelet count in blood, hairs in head, distance b/w different planets, etc.
		
		long l = 12355486484674L;// Java asked, why you need such a large no.Then explicitly we are telling Java that we need that huge no. by applying L/l at the end
		
		System.out.println(l);
		
		//5. float
		// size : same a int i.e 4 bytes = 32 bits
		//range: after . can take up to 7 digits
		
		
		float f1= 12.35f;
		float f2 = (float)1655.58;
		
		//6. Double
				// size : double of float i.e 8 bytes = 64 bits
				//range: after . can take up to 15 digits
		
		double a1 = 456.534;
		double a2 =3656.5644;
		// In case of there is no need to explicitly define the value with d/D.
		
		//Char
		// Size: 2 bytes =16 bits
		char c1='a';
		System.out.println((int)c1);
		char c21='b';
		char c2='5';// characters can accept digits from 0-9
		
		
		char c3 ='S';
		char c4 ='$';
		char c5 ='#';
		
		System.out.println(c1+c21);//97+98=195
		
		// Whenever we perform any mathematical calculation on char, it will consider the ASCII value of the character.
		
		// ASCII Values
		// a = 97, z= 122
		//A =65, Z= 90
		//0 to 9 = 48 to 57
		
		System.out.println('0'+'3');//48+51=99
		
		//boolean
		// size:~1 bit
		//range: true/false
		
		boolean flag = true;
		
	}

}
