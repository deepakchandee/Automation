package navigationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage {

	
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a")
	WebElement viewandeditcart;
	
	@FindBy(xpath="//*[@class='counter qty']/span")
	WebElement cartquantityupdating;
	
	@FindBy(xpath="//*[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front mage-dropdown-dialog']/div")
	WebElement cartpopup;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div")
	WebElement Messageaddproduct;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[3]/div/div[2]/a[1]")
	WebElement updationplus;
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/button[2]/span")
	WebElement updatecart;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")
	WebElement removeitem;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div/div[2]/div[1]/ul/li[1]/button/span")
	WebElement proceedbtnexistance;
	
	
	public void cartclick()
	{
		viewandeditcart.click();
	}
	
	public void cartquanupdate()
	{
		System.out.println("Mini cart quantity after adding product is ="+cartquantityupdating.getText());
	}
	
	public void cartdisplay()
	{
		if(cartpopup.isDisplayed())
		{
			System.out.println("Mini cart popup is present");
			
		}
		
		else
		{
			System.out.println("Mini cart is not present");
		}
	}
	
	public void Messageshown()
	{
		System.out.println("Message after Adding Product is :- "+Messageaddproduct.getText());
	}
	
	public void Minicartupdation()
	{
		updationplus.click();
		updatecart.click();
		System.out.println("Cart Updated Succesfully");
		
	}
	
	public void Removeitem()
	{
		removeitem.click();
	}
	
	public void proceedbtn_existance()
	{
		System.out.println("Proceed Button Existance : "+proceedbtnexistance.getText());
	}
	
	public void proceed_click()
	{
		proceedbtnexistance.click();
	}
}
