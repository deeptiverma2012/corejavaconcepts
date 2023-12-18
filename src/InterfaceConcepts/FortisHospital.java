package InterfaceConcepts;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical   {
	
	int min_fee = 50;

	// US Methods
	@Override
	public void rehumotologySercices() {
		System.out.println("FH --- rehumotologySercices");
	}
	
	@Override
	public void orhodonticsServices() {
	System.out.println("FH --- orhodonticsServices");
		
	}

	@Override
	public void gyneacServices() {
		System.out.println("FH --- gyneacServices");
		
	}

	//UK
	@Override
	public void pediatricServices() {
		System.out.println("FH --- pediatricServices");	
		
	}

	@Override
	public void psychitricServices() {
		System.out.println("FH --- psychitricServices");
		
	}
    // Indian
	@Override
	public void physicianServices() {
		System.out.println("FH --- physicianServices ");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH --- oncologyServices ");
		
	}

	// Common method
	@Override
	public void emergencyServices() {
		
		System.out.println("FH -- emergencyServices");
	}
	
	//individual methods
	
	public void medicalInsurance(){
		System.out.println("FH --- medicalInsurance");
	}
	
	public void medicalTraining(){
		System.out.println("FH --- medicalTraining");
	}

	@Override
	public void covidVaccination() {
		
	 System.out.println("USMedical -- Implementing GrandParent Interface ");
	}

	/*@Override
	public void covidVaccination() {
		System.out.println("WHO -- Implementing GrandParent Interface ");
		
	}*/
	


}
