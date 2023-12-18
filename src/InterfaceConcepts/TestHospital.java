package InterfaceConcepts;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		
		fs.rehumotologySercices();
		fs.orhodonticsServices();
		fs.gyneacServices();
		System.out.println(USMedical.min_fee);
		System.out.println(fs.min_fee);
		
		fs.pediatricServices();
		fs.psychitricServices();
		
		fs.physicianServices();
		fs.oncologyServices();
		
		fs.emergencyServices();
		
		fs.medicalInsurance();
		fs.medicalTraining();
		fs.MedicalNews();
		fs.covidVaccination();
		
		// Q is top casting allowed in case of interface
		// A: yes, see the below code
		// Top casting : Child class object can be reffered by parent class reference variable
		// i.e why WebDriver driver = new ChromeDriver()(Webdriver is an interface & chromedriver is a class)
		
		USMedical us = new FortisHospital();// Methods of only USMedical type  or common are allowed
		/* here, we can only access methods overriden from USMedical interface. 
		 * It can not access methods from UKMedical, IndianMedical interfaces & FortisHospital class methods
		 * because reference check will be failed for all of the three  */
		
		us.rehumotologySercices();
		us.orhodonticsServices();
		us.gyneacServices();
		us.emergencyServices();
		
		
	// only methods of type UKMedical & common methods are allowed
		UKMedical uk = new FortisHospital();
		uk.pediatricServices();
		uk.psychitricServices();
		uk.emergencyServices();
		
	//Q: Can we do downcasting in case of interface?
	//A: No, because we cannot create the object of an interface		
     //FortisHospital fth = new USMedical();// this is not allowed
		
		
	}

}
