
public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is a non-primitive because String is available in the form of Class & objects. It is a predefined class in java
		
		String a ="Hello";
		String b ="Selenium";
		int c = 100;
		int d = 200;
		
		double d1 = 25.42;
		double d2 =12.85;
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(a+c);
		System.out.println(a+c+b);
		System.out.println(a+b+c+d);//HelloSelenium100200
		System.out.println(a+b+(c+d));//HelloSelenium300
		
		System.out.println(a+b+c+d+a+b);// HelloSelenium100200HelloSelenium
		System.out.println(c+d+a+b+c+d);//300HelloSelenium100200
		System.out.println(d1+d2+a+b);//38.27HelloSelenium
		System.out.println(d1+d2+a+b+d1+d2);//38.27HelloSelenium25.4212.85
		System.out.println(c+d+d1+d2+a+b);// 338.27HelloSelenium
		
		System.out.println("The sum of a & b:"+(c+d));
		
		char x ='a';
		char y = 'b';
		System.out.println(x+y);// 97+98=195
		System.out.println((int)x);
		System.out.println(x+1);// 97+1 =98
		System.out.println(x+"1");//a1
		System.out.println(x+y+a+b);//195HelloSelenium
		
		System.out.println(x+" "+y);// a b
	}

}
