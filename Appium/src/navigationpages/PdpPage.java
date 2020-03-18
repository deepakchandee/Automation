package navigationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PdpPage {

	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
	WebElement Addtocart;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/img")
	WebElement Pdpimagetest;
	
	@FindBy(xpath="//*[@class='page-title']")
	WebElement pdpitemtitle;
	
	@FindBy(xpath="//*[@id=\"description\"]/div/div")
	WebElement pdpitemdescription;
	
	@FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div/div/div[1]/div[1]/input")
	WebElement pdpitemquantity;
	
	@FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div/div/div[1]/div[2]/a[1]")
	WebElement quantityspinnerplus;
	
	@FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div/div/div[1]/div[2]/a[2]")
	WebElement quantityspinnerminus;
	
	public void addtocart() {
		System.out.println(Addtocart.getText());
		Addtocart.click();
	}

	public void imagetest() {
		if (Pdpimagetest.isDisplayed()) {
			System.out.println("Image is present on PDP page");
		}

		else {
			System.out.println("Image is not present on PDP page");
		}
	}
	
	public void PDPdata() {
		System.out.println("Product Title is :");
		System.out.println(pdpitemtitle.getText());
		System.out.println("Product description is :");
		System.out.println(pdpitemdescription.getText());
		System.out.println("Product Quantity is :");
		System.out.println(pdpitemquantity.getAttribute("value"));
		
		
		
	}
	
	public void quantityspinner() throws InterruptedException
	{
		quantityspinnerplus.click();
		Thread.sleep(3000);
		quantityspinnerminus.click();
	}
	

}
