package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class HomepageSections {

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
	public void section2_banner() throws InterruptedException {
		System.err.println("Section 2 Banner text is :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s2banner();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s5image();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s5imageclick();
		driver.navigate().back();
		objhomepage.s5secondimageclick();
		driver.navigate().back();
		System.err.println("Section 8 Image text is :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s8image();
		System.err.println("Section 9 Image text is :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s9image();
		driver.navigate().back();
		System.err.println("Section 10 Image text is :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s10image();
		driver.navigate().back();
		System.err.println("Section 11 Image text is :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s11image();
		System.err.println("Section 12 Image text is :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s12text();
		System.err.println("Section 13 text are :");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		objhomepage.s13text();
	}
	

	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
