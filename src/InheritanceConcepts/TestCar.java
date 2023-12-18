package InheritanceConcepts;
// Method Overriding(Overriding method from the parent)
// Dynamic polymorphism/ Run time polymorphism//(JRE is deciding at the time of code execution)
// Late binding - Compiler is not deciding here which method to call that's why call run time or late binding


/*
 * 1. When we have parent & child classes
 * 2. With same method name
 * 3. With same no. of parameters
 * 4. With same return type
 * 5. With same sequence of parameters
 * */

public class TestCar {

	public static void main(String[] args) {
	BMW b = new BMW();
	
	// Child class method will be called becoz preference will be given to child class method
	//in case of method overriding
	b.start();// Overridden method
	
	b.stop();// inherited method 
	b.refule();// inherited method 
	b.autoParking();// individual method
	b.engine();//Overridden method
	b.moveAbles();//Overridden method
	b.runAble();
	BMW.lights();// Calling static method of BMW
	Car.lights();// Calling static method of Car
	b.getTyrePressure();
	System.out.println(b.maxSpeed);
	System.out.println("-------------------------------------");
	
	// Parent can not call anything from the child class 
	Car c = new Car();
	c.start();// individual
	c.stop();//individual
	c.refule();//individual
	c.engine(); //Overridden method
	c.moveAbles();// inherited
	c.runAble();// inherited from Motor
	System.out.println(c.maxSpeed);
	
	System.out.println("-------------------------------------");
	//
	Vehicle v = new Vehicle();
	v.engine();// individual
	v.moveAbles();// inherited
	v.runAble();// inherited from Motor
	System.out.println("-------------------------------------");
	
	Motor m = new Motor();
	m.runAble();// individual
	m.runAble();// Overridden
	System.out.println("-------------------------------------");
	
	RunEngine rn = new RunEngine();
	rn.runAble();// individual 
	
	
	// Up casting/ top casting :
	// Child class object can be referenced by parent/grand parent class object 

	    Car c1 = new BMW();
	    c1.start();
	    c1.refule();
	   // c1.autoParking();//We cannot call the individual methods of the child class by parent class reference variable
	    System.out.println("---------------------------------------");
	    Vehicle v1 = new BMW();
	    v1.engine();// BMW
	    v1.moveAbles();//BMW
	    v1.runAble();//inherited
	    //v1.autoParking();// We cannot call the individual methods of a grand child class by grand parent class reference variable
	    
	    
	    
	    //Down casting:
	    // Parent class object referenced by child class reference variable
	    
	    // BMW b1 = new Car();// It is not allowed in java
	    
	   // BMW b1 = (BMW) new Car();// Here, we are forcefully converting it to BMW type. 
	    // It will throw Class Cast Exception
	    
	    // Java always do reference type check
	    
	  
	}

}
