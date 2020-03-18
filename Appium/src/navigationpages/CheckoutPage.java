package navigationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utility.Config;

public class CheckoutPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@class='action primary checkout']")
	WebElement proceedtocheckout;

	@FindBy(xpath = "//*[@id=\"customer-email-fieldset\"]/div/div/input")
	WebElement emailid;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[1]/div/input")
	WebElement firstname;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[2]/div/input")
	WebElement lastname;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/fieldset/div/div[1]/div/input")
	WebElement streetaddress;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[4]/div/input")
	WebElement city;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[5]/div/input")
	WebElement pincode;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[7]/div/select")
	WebElement state;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[8]/div/input")
	WebElement company;

	@FindBy(xpath = "//*[@id=\"shipping-new-address-form\"]/div[9]/div/input")

	WebElement phoneno;

	@FindBy(xpath = "//*[@id=\"create-account-checkbox\"]")
	WebElement createaccount;

	@FindBy(xpath = "//*[@id=\"osc-password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"osc-password-confirmation\"]")
	WebElement confirmpass;

	@FindBy(xpath = "//*[@id=\"authorizenet_directpost\"]")
	WebElement ccradiobutton;

	@FindBy(xpath = "//*[@id=\"payment_form_authorizenet_directpost\"]/div[2]/div/input")
	WebElement ccnumber;

	@FindBy(xpath = "//*[@id=\"authorizenet_directpost_cc_type_exp_div\"]/div/div/div[1]/div/select")

	WebElement ccmonth;

	@FindBy(xpath = "//*[@id=\"authorizenet_directpost_cc_type_exp_div\"]/div/div/div[2]/div/select")

	WebElement ccyear;

	@FindBy(xpath = "//*[@id=\"authorizenet_directpost_cc_type_cvv_div\"]/div/input")
	WebElement cvvnumber;

	@FindBy(xpath = "//*[@class='place-order-primary']/button")
	WebElement placeorder;

	@FindBy(xpath = "//*[@id=\"btn-minicart-close\"]")
	WebElement cancelcheckout;

	@FindBy(xpath = "//*[@class='base']")
	WebElement thankyoumsg;

	@FindBy(xpath = "//*[@class='checkout-success']")
	WebElement orderid;

	public void checkoutmethod() {

		proceedtocheckout.click();

	}

	public void checkoutform(String emailenter) throws InterruptedException {

		emailid.sendKeys(Config.getemail());
		firstname.sendKeys(Config.Firstname());
		lastname.sendKeys(Config.Lastname());
		streetaddress.sendKeys(Config.Address());
		city.sendKeys(Config.City());
		pincode.sendKeys(Config.Zipcode());
		Select objstate = new Select(state);
		objstate.selectByVisibleText("New Jersey");
		company.sendKeys("yspl");
		phoneno.sendKeys(Config.Phoneno());
		/*
		 * WebElement obj = driver.findElement(By.xpath(
		 * "//*[@id=\"checkout-step-shipping\"]/div[1]/div/label/span"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();",obj);
		 * password.sendKeys("lakshay@123"); confirmpass.sendKeys("lakshay@123");
		 */
	}

	public void checkoutradio(WebDriver driver) throws InterruptedException {
		WebElement st_1 = driver.findElement(By.xpath("//*[@id=\"cashondelivery\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", st_1);
		/*
		 * ccnumber.sendKeys(Config.getCardNumber()); Select objmonth= new
		 * Select(ccmonth); objmonth.selectByVisibleText("03 - March"); Select objyear =
		 * new Select(ccyear); objyear.selectByVisibleText("2021");
		 * cvvnumber.sendKeys(Config.Cvnumber());
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 15);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//*[@class='place-order-primary']/button")));
		 */
		Thread.sleep(25000);
		placeorder.click();

	}

	public void Cancel_checkout() {
		cancelcheckout.click();
	}

	public void afterplaceorder() {
		System.out.println(thankyoumsg.getText());
		System.out.println(orderid.getText());
	}
}
