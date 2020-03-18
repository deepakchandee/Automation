package checkout;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.CheckoutPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class Checkout_Process {

	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;
	public PdpPage objpdp;
	public CheckoutPage objcheckoutpage;

	@BeforeClass
	public void Launchbrowser() {

		driver = Config.chromePath();
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);
		objpdp = objnav.navigatetopdp(driver);
		objcheckoutpage = objnav.navigatetocheckoutpage(driver);

	}

	@Test(priority = 1)
	public void proceedorder() throws InterruptedException {
		objhomepage.our_products();
		objplppage.plppageproduct();
		objplppage.ktperformance();
		objpdp.addtocart();
		WebDriverWait wait = new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='action primary checkout']")));
		objcheckoutpage.checkoutmethod();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        objcheckoutpage.checkoutform("Checkout Details");
		objcheckoutpage.checkoutradio(driver);
        objcheckoutpage.afterplaceorder();
		
	}
	

	

}
