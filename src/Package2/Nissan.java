package Package2;

import Package1.Car;

public class Nissan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c = new Car();
        c.carName = "BMWXA1";// public 
        c.CarMethod();// public
       c.setPrice(13516546);
       System.out.println(c.getPrice());
       
	}

}
