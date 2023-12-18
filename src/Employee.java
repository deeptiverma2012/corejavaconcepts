
// Class : is a blueprint/template/category of objects
//Object / instance of the class: Physical entity created from class template/category
public class Employee {
// Below are class variable/ global variable declared at class level
	String empName;
	int empId;
	String Dept;
	boolean isPerm;
	double salary;
	
	public static void main(String[] args) {
		
		int i =10; // It is a local variable because it is not defined at class level.
		Employee e1 = new Employee();
		// Employee = class
		// el= Object reference variable
		// new= keyword to create an object
		// new Employee() = Object
		
		// below print statements will provide the default value of the variable depending upon the datatype of the variable
		System.out.println(e1.empName);// default value : null
		System.out.println(e1.empId);// default value : 0
		System.out.println(e1.Dept);// default value : null
		System.out.println(e1.isPerm);// default value : false
		System.out.println(e1.salary);// default value : 0.0
		
		e1.empName = "Riya";
		e1.empId = 23;
		e1.Dept="IT";
		e1.isPerm=true;
		e1.salary=2500000;
		
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		System.out.println(e1.Dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);
		
		Employee e2 = new Employee();
		
		//below print statements will print default values becoz e1 is referring to a different memory location, where 
		//we have not yet declared the variable values
		System.out.println(e2.empName);
		System.out.println(e2.empId);
		System.out.println(e2.Dept);
		System.out.println(e2.isPerm);
		System.out.println(e2.salary);
		
		//There is no restriction, we can create n number of objects of a class.
		
		e2.empName="Diya";
		e2.empId=24;
		System.out.println(e2.empName);
		System.out.println(e2.empId);
	 
		//It is a no reference object(It is not a good practice)
		// It is like a new baby but without any reference name
		//Every time it will create a new object which will occupy memory without a reference variable
		// We'll not be able to access below becoz there is no reference variable
		// This way we'll create so many objects unnecessarily
		new Employee();
		new Employee().empName ="Jay";
		
		new Employee().empId = 25;
		 
		
		// Employee: Non primitive type/ datatype
		
		Employee e3 = new Employee();	
		// e3 will breake the connection from the memory location & point to null
		e3 = null;
		// e3 is pointing to null, it will throw null pointer exception(NPE)
		e3.empName="Aby";
		
		//There is no guarantee that gc will go to heap memory
		System.gc();
		//Q: Is null pointer a compile time or run time exception? Ans: Run time exception
		
		
      
	}

}
