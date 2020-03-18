package cart;

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

public class RemoveitemFromcart {

	
	
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
	public void RemoveitemFrmcart() throws InterruptedException {
		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		objpdp.addtocart();
		Thread.sleep(5000);
		objcartpage.cartclick();
		objcartpage.Removeitem();
		System.out.println("Item removed succesfully");
		
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
