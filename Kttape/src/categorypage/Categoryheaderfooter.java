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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
//import utility.Config;
import utility.Config;

public class Categoryheaderfooter {

	
	
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
	public void category_headerfooter()
	{
		System.out.println("Header elements are :");
		objhomepage.our_products();
		objhomepage.header_element();
		System.out.println("Footer elements are :");
		objhomepage.footer_element();
	}
	

	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
	
}
