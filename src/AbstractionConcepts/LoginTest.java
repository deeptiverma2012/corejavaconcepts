package AbstractionConcepts;

public class LoginTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(12);
		lp.title();//Overridden
		lp.url();//Overridden
		lp.pageLoadTime();//Overridden
		lp.pageLogo();//inherited
		lp.doLogin("abchvtf54", "gchd1354");//individual
		
		
		// Top casting: Child class object referred by parent abstract class
		
		Page p= new LoginPage();
		p.title();//Overridden
		p.url();//Overridden
		p.pageLoadTime();//Overridden method will be called by top casting
		p.pageLogo();//individual
		
		// Down casting is not possible in case of abstract class because we cannot create an object of abstract class
		
		
	

	}

}
