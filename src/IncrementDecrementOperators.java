
public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Post increment:++
		
		int a=1;
		int b =a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c =10;
		int d= c++;
		
		System.out.println(c);//11
		System.out.println(d);//10
		
		int d1 =-99;
		int d2= d1++;
		System.out.println(d1);//-98
		System.out.println(d2);//-99
		
		//Pre increment
		int h1 = 1;
		int h2 = ++h1;
		System.out.println(h1);
		System.out.println(h2);
		
		int j1 = -999;
		int j2 =++j1;
		System.out.println(j1);//-998
		System.out.println(j2);//-998
		
		
		//Post decrement
		
		int x = 2;
		int y =x--;
		System.out.println(x);//1
		System.out.println(y);//2
		
		//Pre decrement
		
		int x1= 2;
		int y1 = --x1;
		System.out.println(x1);//1
		System.out.println(y1);//1
		
		int pop =1;
		System.out.println(pop++);//1
		System.out.println(pop);//2
		
		int top =5;
		System.out.println(++top);//6
		System.out.println(top);//6
				
		

	}

}
