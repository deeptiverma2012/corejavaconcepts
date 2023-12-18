package WebDriverArchitecture;

public class FirefoxDriver  implements WebDriver {

	public FirefoxDriver()
	{
		System.out.println("Launching Firefox browser");
	}
	@Override
	public void findElements(String locator) {
		System.out.println("Finding element"+ locator);
		
	}

	@Override
	public void click(String locator) {
	System.out.println("Clicking on:"+locator);
		
	}

	@Override
	public void sendKeys(String locator, String text) {
	System.out.println("Locator is:"+locator+ "value is:"+ text);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Title is ----");
		return "Amazone";
	}

	@Override
	public String getUrl(String url) {
		System.out.println("Url is ----");
		return "https://www.amazone.com";
	}

	@Override
	public void close() {
		System.out.println("Closing the window");
		
	}

}



