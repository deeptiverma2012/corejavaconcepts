
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte age = 30;
		if(age==30)
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not a match");
		}
		
		
		// Below is an example of dead code because code inside the else will never be executed
		if(true)
		{
			System.out.println("This statement will always print");
		}
		else
		{
			System.out.println("It's a dead code");
		}

		//In below case code inside the if statement is dead code
		if(false)
		{
			System.out.println("This statement will always print");
		}
		else
		{
			System.out.println("It's a dead code");
		}
		
		// below is not a dead code becoz condition is dependent on the value of the variable flag
		boolean flag = true;
		if(flag)
		{
			System.out.println("This statement will always print");
		}
		else
		{
			System.out.println("It's a dead code");
		
	     }
		
		int x =100;
		int y =200;
		if(y>=x)
		{
		  System.out.println("Y is greater");
		 }
		else
		{
		  System.out.println("X is greater");
		}
		
		System.out.println("************************************");
		
		//&& --> also called short circuit operator. If first/any condition is not satisfied then it will not check any other condition/s 
		int a = 200;
		int b = 400;
		int c = 600;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
		
	}

}
