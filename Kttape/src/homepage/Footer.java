package homepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class Footer {

	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		
	/*	LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
		 java.util.logging.Logger.getLogger("org.apache.https").setLevel(java.util.logging.Level.OFF);
		HtmlUnitDriver driver = new HtmlUnitDriver();
		 driver.setJavascriptEnabled(true);*/
		
		driver.get("https://kttape.commercestaging.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
	}

	@Test()
	public void Footer_elements() {
		
		System.out.println("Footer Elements on Home page are:");
		
		/*
		WebDriverWait wait = new WebDriverWait(new WebDri, 10);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='top-link']")));
		*/
		
		objhomepage.footer_element();
		
	}

}
