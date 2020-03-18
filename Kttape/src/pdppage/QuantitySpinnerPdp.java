package pdppage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class QuantitySpinnerPdp {

	
	

	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;
	public PdpPage objpdp;

	@BeforeClass
	public void Launchbrowser() {
		driver = Config.chromePath();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);
		objpdp = objnav.navigatetopdp(driver);

	}
	
	@Test
	public void Quantity_spinner() throws InterruptedException {
		
		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		
		objpdp.quantityspinner();
		System.out.println("Quantity spinner is working Fine");
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
}
