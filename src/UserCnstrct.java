
public class UserCnstrct {
String name;
String email;
int userId;
String dob;
String city;
/*Create user on the basis of following
 * 1. name
 * 2. name, email --> Constructor with 2 string
 * 3. name, userId
 * 4. name, email, dob
 * 5. name, email,userId,dob,city
 * 6. name, city ---> Duplicate of constructor #2. Duplicate constructors not allowed
 *  */
// Whenever we are creating any template class, it is not a good approach to create the main method inside
// Main method should be in some other class that will use these constructors should call the constructors & other data members of the class

public UserCnstrct(String name) {
	
	this.name = name;
}
public UserCnstrct(String name, String email) {
	
	this.name = name;
	this.email = email;
}

public UserCnstrct(String name, int userId) {
	
		this.name = name;
		this.userId = userId;
	}
public UserCnstrct(String name, String email, String dob) {
	
	this.name = name;
	this.email = email;
	this.dob = dob;
}
public UserCnstrct(String name, String email, int userId, String dob,
		String city) {
	
	this.name = name;
	this.email = email;
	this.userId = userId;
	this.dob = dob;
	this.city = city;
}



	

}
