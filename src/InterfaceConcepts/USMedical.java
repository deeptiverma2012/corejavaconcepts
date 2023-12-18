package InterfaceConcepts;

//We cannot create the object of an interface
// We cannot create constructor of an interface

public interface USMedical extends WHO {
	//Q: Can we create variables in interface
	//Yes, we can create variables in interface. All the variables are static and final by default.
    // All abstract methods are non static
    int min_fee =10;//static & final in nature  
    
    // 100% abstraction(OOPS)
    // Abstraction means hiding the business logic by creating abstract methods. i.e methods without any body.
	public void rehumotologySercices();
	public void orhodonticsServices();
	public void gyneacServices();
	public void emergencyServices();
	
	@Override
	public void covidVaccination();// Method overriden from parent interface WHO 
	
	
	
	// After jdk 1.8: two major changes:
	/* No# 1: Interface can have static methods but with method body */
	
	/*public static void billing()
	{
		System.out.println("Billing Method");
	}
	 // No# 2 : Interface can have default methods with method body : non-static
	  
	*/
	
	/*default void finalBill()
	{
		System.out.println("Final bill Method");
	}*/
	
	  
	
	
	
	
	
	
	
	
	
	

	
		
}
	

