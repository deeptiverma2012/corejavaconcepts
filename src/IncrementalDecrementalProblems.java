
public class IncrementalDecrementalProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i =11;
		i=i++  + ++i;
		System.out.println(i);// i = 11 + 13 = 24
		
		System.out.println("************************************");
		int a = 11;
		int b = 22;
		int c;
		
		c = a+b+ a++ + b++ + ++a + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);// c = 11+22+11+22+13+24= 103
		System.out.println("************************************");
		
		
		
		int j =0;
		int k = j++ - --j + ++j - j--;
		System.out.println(k);//k = 0-0+1-1 = 0
		System.out.println("************************************");
		
		
		int i1 = 19; int j1 = 29; int k1 =0;
		
		int m = i1-- - j1-- - k1--;
		System.out.println("i1 ="+ i1);
		System.out.println("j1 ="+ j1);
		System.out.println("k1 ="+ k1);
		System.out.println("m ="+ m);
		System.out.println("************************************");
		
		
		int m1 =0; 
		int n1=0;
		int p= --m1*--n1*n1--*m1--;
		System.out.println(p);// p = -1*-*-1*-1 = 1		
		System.out.println(m1);
		System.out.println(n1);
		System.out.println("************************************");
		
		int q =1;
		int r = q++ + ++q * --q -q--;
		System.out.println(r);// r = 1+3*2-2 =5
		System.out.println(q);
		System.out.println("************************************");
		
		int c1 ='A';
		System.out.println(c1++);
		System.out.println((char)c1);
		System.out.println("************************************");
		
		int c2 ='A';
		System.out.println(++c2);//66
		System.out.println((char)c2);//66 =B
		System.out.println("************************************");
		
		double d = 1.5;
		double D = 2.5;
		double D1 = d++ + ++D;// 1.5+3.5 = 5.0
		System.out.println(D1);//5.0
		System.out.println(d);//2.5
		System.out.println(D);;//3.5
		
/*4) Is the below program written correctly?
public class IncrementDecrementQuiz
{ public static void main(String[] args)
   {
      boolean b = true;
      b++;
      System.out.println(b);    }
}*/
		
	
/*	  boolean b1 = true;
	  b1++;
	  System.out.println(b1);  
	  
	  }*/	
// We can not perform increment / decrement operations on a boolean value. It will show warning Type mismatch :cannot convert boolean to int 	
}
}


