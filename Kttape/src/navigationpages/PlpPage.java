package navigationpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PlpPage {

	@FindBy(xpath = "//img[contains(@title,'New Products')]")
	WebElement newproductplppage;

	@FindBy(xpath = "//a[@href='https://kttape.commercestaging.com/kt-performance-blister-treatment-patch']")
	WebElement ktperformanceblister;

	@FindBy(xpath = "//*[@class='products list items product-items']")
	WebElement Plplist;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]")
	WebElement categorylist;

	@FindBy(xpath = "//*[@id=\"limiter\"]/option[2]")
	WebElement pagertest;

	@FindBy(xpath = "//*[contains(@title,'Add to Cart')]")
	WebElement addtocarthover;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/ol/li[4]/div/div/div[3]/div/div[2]/a")
	WebElement addtowishlist;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailwishlist;

	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[3]/div/input")
	WebElement passwishlistl;

	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[4]/div[1]/button")
	WebElement signwishlist;
	

	public void plppageproduct() {
		newproductplppage.click();

	}

	public void ktperformance() {
		ktperformanceblister.click();
	}

	public void Plpproduct() {
		List<WebElement> all = Plplist.findElements(By.tagName("li"));
		System.out.println(all.size());
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).isDisplayed())
				System.out.println(all.get(i).getText());

		}
	}

	public void categoryproductlist() {

		List<WebElement> all = categorylist.findElements(By.tagName("li"));
		System.out.println(all.size());
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).isDisplayed())
				System.out.println(all.get(i).getText());
		}
	}

	public void plppaging() {
		System.out.println("No of items in pagination=" + pagertest.getText());

	}

	public void Addtowishlist(WebDriver driver) {
		
		  Actions objaddtocart = new Actions(driver);
		 objaddtocart.moveToElement(addtocarthover).build().perform();
		 

	}

	public void wishlist() {
		try {
			addtowishlist.click();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void wishlistemail(String email) {
		emailwishlist.sendKeys(email);
	}

	public void wishlistpass(String pass) {
		passwishlistl.sendKeys(pass);
	}

	public void signup() {
		signwishlist.click();
	}
	
		
	
	
	
	
}
