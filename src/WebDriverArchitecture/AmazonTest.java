package WebDriverArchitecture;

public class AmazonTest {
   static WebDriver driver;
	
   public static void main(String[] args) {
		
		// Chrome
		
		//ChromeDriver driver = new ChromeDriver();
	   
	   String browser = "firefox";
	   
	  switch(browser.toLowerCase().trim()) {
	  
	  case "chrome":
		  driver = new ChromeDriver();
	  break;
	  
	  case "edge":
	  driver = new EdgeDriver();
	  break;
	  
	  case "firefox":
	  driver = new FirefoxDriver();
	  break;
	  default:
	  {
		  System.out.println("please enter the correct browser"+ " : "+browser);
		  break;
	  }
	  }
	  		
	 
	  
		driver.getUrl("https://www.amazone.com");// NPE in case of default browser
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElements("email");
		driver.findElements("passwd");
		driver.sendKeys("email", "abc@123.com");
		driver.click("LoginButton");
		
		driver.close();
		
		// Test t = new Test(); We cannot create object of a class which has private constructor
		Test.getTest();
		Test.testing();

	}

}
