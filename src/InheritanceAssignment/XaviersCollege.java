package InheritanceAssignment;

public class XaviersCollege extends University implements USAffiliation, UKAffiliation, IndianAffiliation {

	int  prospectus_fee = 1200;// All the variables in interface are static & final by default
	//US
	@Override
	public void bachlors() {
		System.out.println("US bachelor's method");
	}
	@Override
	public void masters() {	
		System.out.println("US master's method");
	}
	@Override
	public void diploma() {
		System.out.println("US diploma");
	}

	//UK
	@Override
	public void compulsoryStudies() {
		System.out.println("UK complulsory studies");		
	}
	@Override
	public void graduation() {
		System.out.println("UK Graduation");		
	}
	@Override
	public void postGraduation() {
		System.out.println("UK Post Graduation");		
	}
// Indian
	@Override
	public void scienceGraduation() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void artsGraduation() {
		System.out.println("Indian arts Graduation");
	}
	@Override
	public void commerceGraduation() {
		System.out.println("Indian commerce");
	}
	@Override
	public void computerSciGraduation() {
		System.out.println("Indian computer sci Graduation");
	}
	//Individual Methods
	public void feeStructure()
	{
		System.out.println("Xavier's college fee structure");
	}
	public void annualCharges()
	{
		System.out.println("Xavier's college anual fee");
	}
	public void paidSeatFee()
	{
		System.out.println("Xavier's paid seat fee");
	}
	// from University class
	@Override
	public  void universityRegistration()
	{
		System.out.println("University registration through Xavier's college");
	}
	// From Grand parent interface WorldEducationCentre
	@Override 
	public void worldEducationAwarenessProgram() {
		System.out.println("WorldEducationAwarenessProgram is mandatory for every college");
	}
	@Override
	public void pandemicManagementAwarenessProgram() {
		System.out.println("pandemicManagementAwarenessProgram is mandatory for every college");
	}
	
	

}
