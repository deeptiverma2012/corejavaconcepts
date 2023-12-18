
public class LoopsAssignment1 {

	public static void main(String[] args) {
/*1. WAP to print following output:
I am Batman
I am Batman
I am Batman
I am Batman
I am Batman*/
		
		int a =5;
		
		for(int i=1; i<=5;i++)
		{
			System.out.println("I am Batman");		
		}
		System.out.println("*********************************");

/*2. WAP to print following output:
I am Batman 1
I am Batman 2
I am Batman 3
I am Batman 4
I am Batman 5
I am Batman 6
I am Batman 7
I am Batman 8
I am Batman 9*/
		
		int b=10;
		for(int i=1;i<10;i++)
		{
			System.out.println("I am Batman");		
		}
	
		System.out.println("*********************************");
	/* 3. WAP to print 10 to 1 using for, while and do-while loop*/
	

	
	for(int i=10; i>=1;i--)
	{
		System.out.println(i);
	}
	System.out.println("*********************************");
	
	int d =10;
	while(d >=1)
	{
		System.out.println(d);
		d--;
		
	}
System.out.println("*********************************");

int a1=10;
do {
	System.out.println(a1);
	a1--;
}
while (a1>=1);
System.out.println("*********************************");
System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");



/* 4. Write a program in Java to print "Hello World" ten times using while loop*/
	int e =1;
	while(e<=10)
	{
		System.out.println("Hello World");
		e++;
	}
	System.out.println("*********************************");
	/*5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop*/
	// using while loop
	int f =1;
	
	while(f<=100)
	{
		if(f%5==0)
		{
			System.out.println(f);
		}
		f++;
	}
	System.out.println("*********************************");
	// using for loop
	
	
	
	for(int i=1;i<=100;i++)
	{
		if(i%5==0)
		{
			System.out.println(i);
		}
		
	}
	System.out.println("-------------------------------------");
	
	int a2 =1;
	do{
	  if(a2%5==0)
	  {
		  System.out.println(a2);
	  }
		a2++;
	}
	while(a2<=100);
	
	
	
/*6. Print all odd and even numbers between 1 to 100*/
	for(int i=1;i<=100;i++)
	{
		if(i%2==0)
		{
			System.out.println("Even number"+" "+i);
		}
		else
		{
			System.out.println("Odd number"+" "+i);
		}
	}
/*7. What will be the output of this program:
int i = 1;
while(i<=1){
System.out.println("Hi Java");
}*/
// Answer: It will print "Hi Java" in an infinite loop because increment/decrement statement is missing
	System.out.println("*********************************");
//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.

	int ch ='A';// Ascii value of A =65
	while(ch<='Z')
	{
		System.out.println((char)ch);// We have to do casting in order to display it as a character
		ch++;
	}
	System.out.println("*********************************");
	for(int ch1 ='a';ch1<='z';ch1++)
	{
		System.out.println((char)ch1);
	}

	System.out.println("*********************************");
	
	for(int n='0';n<='9'; n++)
	{
	  System.out.println("Char"+" = "+n);
	
	}	
	System.out.println("*********************************");
/*9. Print the following series: 
1.0 2.0 3.0  ...... 10.0 
0 9 18 27 36 …99*/
	//using while
  float x = 1.0f;
  
  while(x <=10.0)
  {
	  System.out.println(x);
	  x++;
  }
  System.out.println("*********************************");
  //using for loop
  
  for(float y= 1.0f; y<=10.0 ;y++ )
  {
	  System.out.println(y);
  }
  System.out.println("*********************************");
  
	
	for(int i=0; i<100;i++)
	{
		if(i%9==0){
		System.out.println(i);
		}
	}
/*Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.*/
	
	//using while loop
System.out.println("*********************************");
	
    int r ='a';
	while(r<='z')
	{
		if(r=='a')
		{
		  System.out.println("vowel"+"="+ (char)r);
		}
		else if(r=='e')
		{
			System.out.println("vowel"+"="+ (char)r);
		}
		else if(r=='i')
		{
			System.out.println("vowel"+"="+ (char)r);
		}
		else if(r=='o')
		{
			System.out.println("vowel"+"="+ (char)r);
		}
		else if(r=='u')
		{
			System.out.println("vowel"+"="+ (char)r);
		}
		r++;
		
	}
	//using for loop
	
	for(int i='a';i<='z';i++)
	{
		if(i=='a' |i=='e'|i=='i'|i=='o'|i=='u')
		{
			System.out.println((char)i);
		}
		i++;
	}
	System.out.println("*********************************");
/*Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".*/
// using for loop
	for(int j=1; j<=10;j++)
	{
		System.out.println(j);
		if(j%7==0)
		{
			System.out.println("bye, see you tomorrow");
			break;
		}
	}	
	System.out.println("*********************************");
// using while loop
	int k = 1;
	while(k<=10)
	{
		System.out.println(k);
		if(k%7==0)
		{
			System.out.println("bye, see you tomorrow");
			break;
		}
		k++;
	}
	
	
	
}
}
