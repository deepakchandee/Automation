package navigationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {

	public HomePage navigatetohomepage(WebDriver driver) {
		HomePage objhomepage = new HomePage();
		PageFactory.initElements(driver, objhomepage);
		return objhomepage;
	}

	public PlpPage navigatetoplppage(WebDriver driver) {
		PlpPage objplppage = new PlpPage();
		PageFactory.initElements(driver, objplppage);
		return objplppage;
	}

	public PdpPage navigatetopdp(WebDriver driver) {
		PdpPage objpdp = new PdpPage();
		PageFactory.initElements(driver, objpdp);
		return objpdp;
	}

	public CheckoutPage navigatetocheckoutpage(WebDriver driver) {
		CheckoutPage objcheckout = new CheckoutPage();
		PageFactory.initElements(driver, objcheckout);
		return objcheckout;
	}
	
	public CartPage navigatetocartpage(WebDriver driver) {
		CartPage objcartpage = new CartPage();
		PageFactory.initElements(driver, objcartpage);
		return objcartpage;
	}
	
	
	
}
