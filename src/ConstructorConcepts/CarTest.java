package ConstructorConcepts;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.getMake());
		System.out.println(c1.getModel());
		System.out.println(c1.getYear());
		
		Car c2 = new Car("USA","Nissan Rough",2023);
		System.out.println(c2.getMake());
		System.out.println(c2.getModel());
		System.out.println(c2.getYear());
		
		

	}

}
