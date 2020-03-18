package pdppage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.CartPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class MessageAfterAddingProduct {

	
	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;
	public PdpPage objpdp;
	public CartPage objcartpage;

	@BeforeClass
	public void Launchbrowser() {
		driver = Config.chromePath();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);
		objpdp = objnav.navigatetopdp(driver);
		objcartpage = objnav.navigatetocartpage(driver);

	}
	
	@Test
	public void Message_Addingproduct() throws InterruptedException
	{
		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		objpdp.addtocart();
		Thread.sleep(5000);
		objcartpage.Messageshown();
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
