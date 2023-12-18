
public class MethodOverloading {
	//Method overloading/ OOPS:compile time polymorphism( Many Forms)/static polymorphism//also called early binding
	//Duplicate methods are not allowed in java
	
	// Conditions for method overloading
	// When in the same class we have different methods
	//1. With same name
	//2. Different number of parameters
	//3. Different type of parameters
	//4. return type doesn't matters
	//5. Sequence /order of parameters
	

	public void test()
	{
		System.out.println("Default Test Method");
	}
	public void test(int a){
		System.out.println(a);
	}
	public void test(int a,int b){
		System.out.println(a+b);
	}
	public void test(int a, String b){
		System.out.println(a+b);
	}
	public void test(String a, int b)
	{
		System.out.println(a+b);
	}
	
	// Real time examples of static polymorphism
	//1. Login functionality
	/*public void login(String username, String passwd)
	{
		System.out.println("login");
	}
	public void login(String username, String passwd, int otp)
	{
		System.out.println("login");
	}
	public void login(String email)
	{
		System.out.println("login with email");
	}*/
	//2.  Search functionality in e commerce
	public void search(String productName)
	{
		System.out.println(productName);
	}
	public void search(String productName, String brand)
	{
		System.out.println(productName+ brand);
	}
	public void search(String productName, String brand, String maxPrice)
	{
		System.out.println(productName);
	}
	//3. Payment feature
	
	public void payment(String Upi)
	{
		
	}
	public void payment(int cc, int cvv, String date)
	{
		
	}
	public void payment(String paypalId, String passwd)
	{
		
	}
	// 4. Cab booking
	public void carBooking(String carType, String startingPt, String endPoint)
	{
		
	}
	public void carBooking(String carType, String startingPt, String endPoint, int passengerCount)
	{
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		// In compile time polymorphism, we decide which method to call at compile time 
		// i.e why it is called compile time/static polymorphism
		obj.test("Hello", 500);
		obj.test(102, "new");
	}

}
