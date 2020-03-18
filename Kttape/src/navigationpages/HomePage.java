package navigationpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@class='block block-title']")
	WebElement searchclick;

	@FindBy(xpath = "//*[@id=\"search\"]")
	WebElement searchenter;

	@FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
	WebElement searchbutton;

	@FindBy(xpath = "//*[@class='ui-menu ui-widget ui-widget-content ui-corner-all']")
	WebElement topmenu;

	@FindBy(xpath = "//*[@class='header content']")
	WebElement header;

	@FindBy(xpath = "//*[@class='top-link']")
	WebElement footer;

	@FindBy(xpath = "//*[@id=\"store.menu\"]/nav/ul/li[2]")
	WebElement ourproducts;

	@FindBy(xpath = "//*[@id=\"ui-id-2\"]/li[4]/ul")
	WebElement submenu;

	@FindBy(xpath = "//*[@id=\"ui-id-2\"]/li[4]")
	WebElement ourathletes;

	@FindBy(xpath = "//*[@class='top-banner-container']")
	WebElement section2banner;

	@FindBy(xpath = "//*[@id=\"player_uid_568995078_1\"]/div[3]/div[1]/div[2]")
	WebElement titlevideo;

	@FindBy(xpath = "//*[@id=\"espot-grid-one\"]/div[1]/a[1]/div/p")
	WebElement section5text;

	@FindBy(xpath = "//*[@id=\"espot-grid-one\"]/div[1]/a[1]/img")
	WebElement section5firstimgclick;

	@FindBy(xpath = "//*[@id=\"espot-grid-one\"]/div[1]/a[2]/img")
	WebElement section5secondimageclick;

	@FindBy(xpath = "//*[@id=\"espot-grid-one\"]/div[1]/a[2]/div/p")
	WebElement section52ndimage;

	@FindBy(xpath = "//*[@class='bx-viewport']")
	WebElement section8text;

	@FindBy(xpath = "//*[@id=\"stretch-image-two\"]/div[1]")
	WebElement section9text;

	@FindBy(xpath = "//*[@id='stretch-image-two']/a")
	WebElement section9image;

	@FindBy(xpath = "//*[@id=\"tape-man-block\"]/div[2]/div[1]")
	WebElement section10text;

	@FindBy(xpath = "//*[@id=\"espot-grid-two\"]")
	WebElement section11text;

	@FindBy(xpath = "//*[@id=\"espot-grid-two\"]/div[3]")
	WebElement section11row3text;

	@FindBy(xpath = "//*[@class='footer content']")
	WebElement section12text;

	@FindBy(xpath = "//*[@class='link-wrap']")
	WebElement section13text;

	@FindBy(xpath = "//*[@id=\"tape-man-block\"]/div[1]/a/img")
	WebElement section10image;
	
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement subscription;

	
	@FindBy(xpath="//*[@id=\"newsletter-validate-detail\"]/div[2]/button")
	WebElement subscribebtn;
	
	@FindBy(xpath="//*[@class='header content']/div[4]/ul/li[2]/a")
	WebElement loginlink;
	
	@FindBy(xpath="//*[@class='action showcart']")
	WebElement cartlink;
	
	public void searchmethod(String searchitem) {
		searchclick.click();
		searchenter.sendKeys(searchitem);
		searchbutton.click();
	}

	public void header_element() {
		List<WebElement> all = header.findElements(By.tagName("li"));
		System.out.println(all.size());
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).isDisplayed())
				System.out.println(all.get(i).getText());

		}
	}

	public void footer_element() {
		List<WebElement> all = footer.findElements(By.tagName("li"));
		System.out.println(all.size());
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).isDisplayed())
				System.out.println(all.get(i).getText());
		}

	}

	public void our_products() {
		ourproducts.click();
	}

	public void sunbmenucategory(WebDriver driver) {

		Actions objaction = new Actions(driver);
		objaction.moveToElement(ourathletes).build().perform();

	}

	public void loopsubmenu() {
		List<WebElement> all = submenu.findElements(By.tagName("li"));
		System.out.println(all.size());
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).isEnabled())
				System.out.println(all.get(i).getText());
		}

	}

	public void topmenuitem() {
		List<WebElement> all = topmenu.findElements(By.tagName("li"));
		System.out.println(all.size());
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).isDisplayed())
				System.out.println(all.get(i).getText());

		}
	}

	public void s2banner() {
		System.out.println(section2banner.getText());
	}


	public void s5image() {
		System.err.println("Section 5  First Image text is :");
		System.out.println(section5text.getText());
	
	}

	public void s5imageclick() {

		if (section5firstimgclick.isDisplayed()) {
			 System.err.println("First Image is present on section5");
			section5firstimgclick.click();

		}
	}

	public void s5secondimageclick() {
		System.err.println("Section 5  Second Image text is :");
		System.out.println(section52ndimage.getText());
		if (section52ndimage.isDisplayed()) {
			System.err.println("Second Image is present on section5");
			section5secondimageclick.click();
		}
	}

	public void s8image() {
		System.out.println(section8text.getText());

	}

	public void s9image() throws InterruptedException {
		System.out.println(section9text.getText());
		if (section9image.isDisplayed()) {
			System.err.println("Image is present on Section 9");
			section9image.click();
		}
	}

	public void s10image() {
		System.out.println(section10text.getText());
		if (section10image.isDisplayed()) {
			System.err.println("Image is present on Section 10");
			section10image.click();
		}
		
	}

	public void s11image() {
		System.out.println(section11text.getText() + section11row3text.getText());
	}

	public void s12text() {
		System.out.println(section12text.getText());
	}

	public void s13text() {
		System.out.println(section13text.getText());
	}
	
	
	public void newsletter(String email)
	{
		subscription.sendKeys(email);
		
	}
	
	public void subscriptionclick() {
		subscribebtn.click();
	}
	
	public void login_link()
	{
		if(loginlink.isDisplayed())
		{
			System.out.println("Login Link is present");
		}
		
		else
		{
			System.out.println("Login link is not present");
		}
	}
	
	public void cart_link()
	{
		if(cartlink.isDisplayed())
		{
			System.out.println("Cart Link is present");
		}
		else
		{
			System.out.println("Cart link is not present");
		}
	}
	

}
