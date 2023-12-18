package WebDriverArchitecture;

public interface WebDriver {
	
	public void findElements(String locator);
	public void click(String locator);
	public void sendKeys(String locator, String text);
	public String getTitle();
	public String getUrl(String url);
	public void close();
	

}
