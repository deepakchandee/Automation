package categorypage;

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
import utility.Config;

public class Categorytopmenu {

	
	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		//WebDriver driver = new HtmlUnitDriver();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);

	}
	
	
	@Test
	public void categorytop_menu()
	{
	System.out.println("Top Menu on Category Page are");
	   objhomepage.our_products();
		objhomepage.topmenuitem();
		
	}
	
	

	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
