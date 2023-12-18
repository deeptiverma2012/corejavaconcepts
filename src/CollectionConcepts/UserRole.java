package CollectionConcepts;

import java.util.HashMap;

public class UserRole {
	
	public static String getUserCredentials(String role)
	{
		HashMap<String, String> userMap = new HashMap<String, String>();
		 userMap.put("admin", "admin;admin@123");
		 userMap.put("seller", "seller;seller@123");
		 userMap.put("vendor", "vendor;vendor@123");
		 userMap.put("manager", "manager;manager@123");
		 
		 return userMap.get(role);
		
	}
	
	public static void doLogin(String username, String password)
	{
		System.out.println("Logging in with username & password:"+ username +" "+password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String credentialsData = getUserCredentials("manager");

		System.out.println(credentialsData);
		String username = credentialsData.split(";")[0];
		String passwd = credentialsData.split(";")[1];
		
		doLogin(username, passwd);
	}

}
