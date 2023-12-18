
public class IncrementDecrementProblems1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=2;
		int k=3;

		int m = i-- - j-- - k--;

		System.out.println("i="+i);//0
		System.out.println("j="+j);//1
		System.out.println("k="+k);//2
		System.out.println("m="+m);//-4
		
		System.out.println("************************************");
		int a=1;
		int b=2; 

		System.out.println(--b - ++a + ++b - --a);//0
		
		/* 8) What is wrong with the below program? Why it is showing compilation error?

public class IncrementDecrementQuiz

{    public static void main(String[] args)
    {
        int i = 11;
        int j = --(i++);
    }}*/
		
		// Ans: We cannot perform mathematical operations on ()(parenthesis). Mathematical operations can be performed on a variable not parenthesis.
		
		/* 9) Guess the value of p in the below program?

public class IncrementDecrementQuiz
{    public static void main(String[] args)
    {   int m = 0, n = 0;
        int p = --m * --n * n-- * m--;       

        System.out.println(p);

    }

}*/
		int ma = 0, na = 0;
		int p = --ma * --na * na-- * ma--;
		System.out.println(p);// p =-1*-1*-1*-1 = 1
		System.out.println(ma);//-2
		System.out.println(na);//-2
		
/* 10) What will be the output of the following program?
public class IncrementDecrementQuiz
{    public static void main(String[] args)
    {   int a=1; 
        a = a++ + ++a * --a - a--;   
        System.out.println(a);    }
}*/
		
		int a1=1; 
		a1 = a1++ + ++a1 * --a1 - a1--;
		System.out.println(a1);//1+3*2-2 =5
		
		/* 12) What will be the outcome of the below program?
public class JavaIncrementDecrementQuiz
{    public static void main(String[] args)
    {  int ch = 'A';
       System.out.println(ch++);
    }
}*/
		int ch = 'A';//65
		System.out.println(ch++);//	65 because it is post-increment
		
		// Original value will be displayed.We can store a character inside a numeric variable because 'Characters belongs to numeric family'.
		

/* 13) What will be the outcome of the below program?

public class JavaIncrementDecrementQuiz 
{    public static void main(String[] args) 
  {    char ch1 = 'A';
       System.out.println(++ch1);
    }
}*/
		char ch1 = 'A';
	    System.out.println(++ch1);//B -because it is pre-increment


		



		
		
		
		
		
		
		
		
		
		
	}
}
