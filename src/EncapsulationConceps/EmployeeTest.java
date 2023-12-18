package EncapsulationConceps;

public class EmployeeTest {

	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.setName("Deepti");
//		e.setid(143);
//		e.setActive(true);
//	
		
// We can also achieve encapsulation with public Constructor & set the value. 
// We are actually accessing the private layer through the public constructor
//Here constructor is behaving like setter method that is setting value of all the   
// It is not mandatory to write the setters because we can achieve it through the constructors
// but it is mandatory to write get method. If we don't write get method then how we are going to get the values		
		
		//CRUD ---> Create, Retrieve, Update & Delete
		
		// User registration using Setter & Constructors - POST API/ Create
		Employee e = new Employee("Divya", 123, "Delhi", false);
		
		// display user info on user profile - GET API
		System.out.println(e.getName()+" "+e.getId()+" "+e.isActive());
		
		// Q Why are we creating the setters?
		//A: So that we can update the value 
		
	// Update the values using Setters method - PUT/ PATCH API
		e.setName("Alka");
		// display user info on user profile - GET API
		System.out.println(e.getName()+" "+e.getId()+" "+e.isActive());
		
		
		
	
	}

}
