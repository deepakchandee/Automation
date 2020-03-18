package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class Searchkey {

	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);

	}

	@Test
	public void searchkeyenter() {
	
		objhomepage.searchmethod("cotton");
		System.out.println("Search Items is succesfully working");
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
