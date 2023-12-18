package InheritanceAssignment;

public class CollegeTest {

	public static void main(String[] args) {
		XaviersCollege xc = new XaviersCollege();
		// US
		xc.bachlors();
		xc.masters();
		xc.diploma();	
		
		//Indian
		xc.artsGraduation();
		xc.commerceGraduation();
		xc.computerSciGraduation();
		xc.computerSciGraduation();

		//UK
		xc.compulsoryStudies();
		xc.graduation();
		xc.postGraduation();
		//Grand Parent Interface WorldEducationCentre
		xc.worldEducationAwarenessProgram();
		xc.pandemicManagementAwarenessProgram();
		
		//University
		xc.universityRegistration();
		
		// individual Methods
		xc.annualCharges();
		xc.feeStructure();
		xc.paidSeatFee();
		
		// Up casting with US Affiliation
		// We cannot call methods of other interfaces or classes because reference check will be failed
		USAffiliation usa = new XaviersCollege();
		usa.bachlors();
		usa.masters();
		usa.diploma();
		usa.worldEducationAwarenessProgram();
		usa.worldEducationAwarenessProgram();
		// usa.annual();This is not allowed because a parent class cannot access child class individual methods
		
		// Down casting: We cannot create an object of an interface that's why down casting is not allowed with interface 
		//USAffiliation usa = new USAffiliation();
		
		
		

	}

}
