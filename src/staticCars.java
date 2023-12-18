
public class staticCars {

	String name;
	int price;
	String chasisNo;
	static int wheels =4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticCars c1= new staticCars();
		staticCars c2= new staticCars();
		staticCars c3= new staticCars();
		
		c1.name = "Nissan";
		c1.price= 4500000;
		c1.chasisNo ="cghvcd879070";
		// How to call the static variables?
		//1. directly within the same class
		System.out.println(wheels);
		System.out.println(c1.name+" "+c1.price+" "+c1.chasisNo+" "+wheels);
		
		//2. use it with class name from anywhere
		System.out.println(staticCars.wheels);
		
		// 3. Can I call static with object ref name?
		//Ans Yes but it is not recommended. We'll get 
		//a warning "Static field should be accessed in a static way"
		
		
		//4. We cannot create static variables inside a method. No local variables can be static
		//5. static is only allowed at class level
		
		
		
		
	}

}
