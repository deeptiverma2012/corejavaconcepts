import ConstructorConcepts.CustCnstrct;


public class UserTest {
// This class behaves as a caller class for the template class UserCnstrct

	public static void main(String[] args) {
		
		UserCnstrct obj = new UserCnstrct("Deepti");
		//System.out.println(obj.name);
		UserCnstrct obj1 = new UserCnstrct("Deep",127 );
		obj1.city = "Delhi";
		obj1.dob = "25-4-1990";
		System.out.println(obj1.name+" "+obj1.userId+" "+obj1.city+" "+obj1.dob);
	
		CustCnstrct cust = new CustCnstrct("Akshat", 123, " Apt#127");
		System.out.println(cust.custName);
		System.out.println(cust.custId);
		System.out.println(cust.custAddress);
	}

}
