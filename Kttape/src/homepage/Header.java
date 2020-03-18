package homepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class Header {

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
	public void Headerelements() {
		System.err.println("Header Elements on Home page are :");
		objhomepage.header_element();
	}
	
	

}