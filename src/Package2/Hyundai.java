package Package2;

import Package1.Car;

public class Hyundai extends Car {
	// Different method sub class - Only public & protected can be accessible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hyundai h  = new Hyundai();
		h.carName = "H123";// public
		h.modelNo = 4654; // Protected
		h.CarMethod();//public method
		h.setPrice(46915496);
		System.out.println(h.getPrice());
	
		

	}

}
