import java.util.Arrays;


public class ArrayConcepts {

	public static void main(String[] args) {
	
		int i[] = new int[4];
		//i[-1]=20;// AIOB - which is a run time exception
		i[0]=21;
		i[1]=22;
		i[2]=23;
		i[3]=24;
		//i[4]=25;//AIOB -- It is a run time exception
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//AIOB -- It is a run time exception
		
		System.out.println(i[0]+i[3]);// 21+24 =45, We can perform mathematical calculations on the values stored at an index of the array
		
		// Print all the value of an array separated by comma
		System.out.println(Arrays.toString(i));// If you want to print the values of an array without a loop
		
		
		for(int a =0; a<=i.length-1;a++)
		{
			System.out.println(i[a]);
		}
		
		System.out.println("-------------------------------");
		
		int pop[] = new int[5];
		
		pop[0]=1;
		pop[3]=5;
		
		System.out.println(Arrays.toString(pop));//[1, 0, 0, 5, 0]
		// If we are not passing any value to any index, it will be filled with the default value
		// Default value of int = 0
		
		float j[] = new float[5];
		j[0]= 1.2f;
		j[1]= 2.2f;
		j[4]= 3.2f;
		
		System.out.println(Arrays.toString(j));// Default value of float =0.0
		
		double d[] = new double[3];
		d[0]= 45.164564647964;
		d[1] = 66.547846817687;
		
		System.out.println(Arrays.toString(d));// Default value of double = 0.0
		
		System.out.println(d.length);// length of the array
		
		byte b[] = new byte[2];// Li=0, Hi=1, length=2
		b[0]= 12;
		
		System.out.println(Arrays.toString(b));// Default value of byte =0
		
		short s[] = new short[3];
		System.out.println(s.length);
		s[1]=2;
		s[2]= 15;
		System.out.println(Arrays.toString(s));// Default value of short = 0
		
		long l[] = new long[4];
		l[0]= 12345;
		l[2]= 12649;
		l[3]= 599879;
		System.out.println(Arrays.toString(l));// Default value of long = 0
		
		float f[] = new float[3];
		 f[0]=100.36f;
		 f[1]=23.15f;
		 f[2]=15;//Float array can hold integer value but if we print,it will add .0 at the end 
		 
		 System.out.println(Arrays.toString(f));
		 
		 String str[]= new String[5];
		 str[0]="Deepti";
		 str[1]="Sanya";
		 str[2]="Aarushi";
		 str[3]="Reyaansh";
		 // Default value of string is "null"
		 System.out.println(str.length);
		 System.out.println(Arrays.toString(str));
		 
		/* for(int i1=0; i1<=str.length-1;i1++)
		 {
			 System.out.println(str[i1]);
			 
			 if(str[i1].equals("Sanya"))
			 { System.out.println("Promote her");
				break;
			 }
		 }*/	
	System.out.println("*******************************");	 
	// For each loop
		 int count =0;
		 for(String e :str)
		 {
			 System.out.println(e);
			 if(e.equals("Deepti")){
				 System.out.println("Promote her");
				 break;
			 }			 
			 
		 }
		 System.out.println("This is for each loop");
		 
		 int x[] = new int[4];
		 
		 x[0]=1;
		 x[1]=2;
		 x[2]=3;
		 x[3]=6;
		 
		 for(int e: x)
		 {
			 System.out.println(e);
		 }
		 
		 char y[]= new char[3];
		// System.out.println(Arrays.toString(y));
		 y[0]='A';
		 y[1]='B';
		 y[2]='C';
		 
		 System.out.println(y);//ABC
		 for(char c: y)
		 {
			 System.out.println(c);
		 }
		 // If we pass a char array to an integer variable, it will print Ascii values of the characters
		 for(int x1 :y)
		 {
		   System.out.println(x1);
		 }
		 //empInfo : name(String),gender(char), dob(String), age(int), department(String), isActive(Boolean)
		 //Object Array
		 // Object is a parent class of all the classes that can hold any type of data
		 
		 Object obj[]= new Object[6];
		 System.out.println(Arrays.toString(obj));// Default value of object array index 0 to 5 is null
		 
		 obj[0]="Deepti";
		 obj[1]= 'F';
		 obj[2]= "01/02/1990";
		 obj[3]= 33;
		 obj[4]= "IT";
		 obj[5]= true;
		 
		 System.out.println(Arrays.toString(obj));
		 
		 for(int k=0; k<=obj.length-1; k++)
		 {
			 System.out.println(k+"="+obj[k]);
		 }
		 
		 int count1 = 0;
		 for(Object o: obj )
		 {
			 System.out.println(count1+ "="+ o);
			 count1++;
		 }
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
