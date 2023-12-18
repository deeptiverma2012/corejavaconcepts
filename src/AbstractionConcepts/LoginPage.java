package AbstractionConcepts;

public class LoginPage extends Page {
	
	public LoginPage()
	{
		System.out.println("Login page(Sub class) constructor");
	}
	public LoginPage(int a)
	{
		super(15);
		System.out.println(a);
	}

	@Override
	public void title() {
	System.out.println("Login page title");	
		
	}
	
	@Override
	public void url() {
	  System.out.println("Login page url");
	}
	
	@Override
	public void pageLoadTime()
	{
		System.out.println("Page --- 2 sec");
	}
	
	//individual method 
	public void doLogin(String username, String password)
	{
		System.out.println("Username is:"+username+"Password is:"+password);
	}
	
	
	
	

}
