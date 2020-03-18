package categorypage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PlpPage;
import utility.Config;

public class Categorysearchpage {
	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);

	}
	
	
	@Test
	public void Category_searchitem()
	{
		objhomepage.our_products();
		System.out.println("Search Item is : Kttape cotton ");
		objhomepage.searchmethod("Kttape cotton");
	}
	

	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
