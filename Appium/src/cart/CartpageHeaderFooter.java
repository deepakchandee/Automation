package cart;

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

public class CartpageHeaderFooter {

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
	public void Cartheaderfooter() throws InterruptedException {
		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		objpdp.addtocart();
		Thread.sleep(5000);
		objcartpage.cartclick();
		System.out.println("Header Elements on Cart Page are :");
		objhomepage.header_element();
		System.out.println("Footer elements on cart page are :");
		objhomepage.footer_element();

	}

	
}
