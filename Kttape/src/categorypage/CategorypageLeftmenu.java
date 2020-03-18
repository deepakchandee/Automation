package categorypage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PlpPage;
//import utility.Config;
import utility.Config;

public class CategorypageLeftmenu {
	
	
	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		//WebDriver driver = new HtmlUnitDriver();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);

	}
	
	@Test
	public void categoryleftmenu()
	{
		objhomepage.our_products();
		objplppage.plppageproduct();
		System.out.println("No left Menu present");
	}

	

	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
