package cart;

import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
//import utility.Config;
import utility.Config;

public class Addtocart {

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
	public void Addto_cart() {
		objhomepage.our_products();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@title,'New Products')]")));
		objplppage.plppageproduct();
		objplppage.ktperformance();
		objpdp.addtocart();
		System.out.println("Product Added succesfully in cart");
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
