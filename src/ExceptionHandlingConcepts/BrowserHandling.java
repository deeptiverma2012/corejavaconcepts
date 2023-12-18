package ExceptionHandlingConcepts;

public class BrowserHandling {

	public static void main(String[] args) {
		String browserName = "opera";
			
			switch(browserName.trim().toLowerCase())
			{
			case "chrome":
			{
				System.out.println("Chrome is launched");
			   break;
			}
			case "firefox":
			{
				System.out.println("Firefox is launched");
				break;
			}
			case "safari":
			{
				System.out.println("Safari is launched");
				break;
			}
			case "edge":
			{
				System.out.println("Edge is launched");
				break;
			}
			default:
			{
				System.out.println("Please enter the correct browser"+" "+ browserName);
				throw new AppException("INCORRECT BROWSER");	
			}
				
			}	
				
		
			
			System.out.println("Please enter the url:");
			System.out.println("Url is launched");
			} 

	}


