package ConstructorConcepts;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee(123,"Deepti",45.50);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	    emp.setSalary(50.0);
	    System.out.println(emp.getSalary());
		
		

	}

}
