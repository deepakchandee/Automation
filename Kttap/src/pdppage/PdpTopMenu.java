package pdppage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class PdpTopMenu {

	
	
	
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
	public void PDP_Topmenu() {
		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		System.out.println("Top Menus on PdpPage page :");
		objhomepage.topmenuitem();
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	
	
}
