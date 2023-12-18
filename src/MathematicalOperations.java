
public class MathematicalOperations {

	public static void main(String[] args) {
	
		System.out.println(10/2);//5
		System.out.println(9/2);//4   It will show only 4 because both the values are int
		
		//If one of the value is a floating value then the resultant will always be floating

		System.out.println(9/2.0);// 4.5 because one of the value is float

		System.out.println(9.0/2);// 4.5 because one of the value is float
		System.out.println(9.0/2.0);// 4.5 because one of the value is float
		
		//System.out.println(9/0);// If we divide any no. by 0, it will throw arithmetic exception: / by zero
		//Above is a run time exception


		System.out.println(0/5);//If we divide any number by 0, it will give 0
		//System.out.println(0/0);// It will throw  arithmetic exception: / by zero
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		System.out.println(0.0/0);//NaN : Not a number
		System.out.println(0/0.0);//NaN : Not a number
		System.out.println(0.0/0.0);//NaN : Not a number
		System.out.println(10.3/0);//Infinity
		System.out.println('a'/2);//48
		//System.out.println('a'/0);//AE : Arithmetic Exception
		
		System.out.println('a'/2+100);//148
		System.out.println(10%2);// Remainder =0
		System.out.println(9%2);//Remainder = 1
		System.out.println(100%3);//Remainder =1
		System.out.println(10%3);//Remainder =1
		
	}

}
