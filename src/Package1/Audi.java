package Package1;

public class Audi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.carName = "BMWMini";// Public
		c.color = "Black";// Protected
		c.modelNo = 124;//default
		c.CarMethod();// public method
		//System.out.println();
		c.setPrice(135461);
		System.out.println(c.getPrice());
		

	}

}
