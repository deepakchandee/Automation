package checkout;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import navigationpages.CheckoutPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class Cancel_Checkout {

	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;
	public PdpPage objpdp;
	public CheckoutPage objcheckoutpage;

	@BeforeClass
	public void Launchbrowser() {

		driver = Config.chromePath();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);
		objpdp = objnav.navigatetopdp(driver);
		objcheckoutpage = objnav.navigatetocheckoutpage(driver);

	}

	@Test(priority = 1)
	public void cancel_checkout() throws InterruptedException {

		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		objpdp.addtocart();
		Thread.sleep(5000);
		objcheckoutpage.Cancel_checkout();
		System.out.println("Checkout is cancelled");
	}
	

	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
