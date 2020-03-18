package homepage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class Subscriptionsignup {

	
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
	public void Subscription_signup()
	{
		objhomepage.newsletter(Config.subscription_signup());
		objhomepage.subscriptionclick();
		System.out.println("Subscription is succesfully working");
		
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
