package EncapsulationConceps;

public class BrowserLaunch {
	
	public void launchBrowser()
	{
		checkRAM();
		checkBrowserVersion();
		checkBrowserUpdates();
		
		System.out.println("Browser lanched");
	}
	
	private void checkRAM()
	{
		System.out.println("Check RAM");
	}
	private void checkBrowserVersion()
	{
		System.out.println("Check browser version");
	}
	private void checkBrowserUpdates()
	{
		System.out.println("Check browser updates");
	}

}
