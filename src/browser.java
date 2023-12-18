
public class browser {

	//WAF: to launch the browser
	//name: launchBrowser: chrome/ff/safari/edge
	//param: browserName(String)
	//return: boolean
	
	public boolean launchBrowser(String browserName)
	{
		boolean flag =true;
		System.out.println("browser is:"+ browserName);
		
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
			flag = false;
		}
		} 
		return flag;
	}
	
	
	public static void main(String[] args) {
		browser obj = new browser();
		boolean flag  = obj.launchBrowser("Shahrukh");
		if (flag)
			{
			   System.out.println("Enter the url");
			}
		else
		{
			System.out.println("error -- No browser is there");
		}

	}

}
