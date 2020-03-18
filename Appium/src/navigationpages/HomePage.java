package navigationpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

private AndroidDriver driver;

public HomePage() {
}

public HomePage(AndroidDriver driver) {
this.driver = driver;
PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button' and @index='1' and @text='ALLOW']")
private AndroidElement allow1click;
@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button' and @index='1' and @text='ALLOW']")
private AndroidElement allowclick2;
@AndroidFindBy(id = "com.beejameditation.beeja:id/emailLoginTv")
private MobileElement login;
@AndroidFindBy(id = "com.beejameditation.beeja:id/emailEt")
private AndroidElement emailid;
@AndroidFindBy(id = "com.beejameditation.beeja:id/passwordEt")
private AndroidElement password;
@AndroidFindBy(id = "com.beejameditation.beeja:id/loginTv")
private AndroidElement loginintobeeja;
@AndroidFindBy(id = "com.flipkart.android:id/tv_right_cta")
private AndroidElement email;
@AndroidFindBy(id = "com.flipkart.android:id/phone_input")
private AndroidElement emailtext;
@AndroidFindBy(id = "com.flipkart.android:id/button")
private AndroidElement con;
@AndroidFindBy(xpath ="//android.widget.EditText[@resource-id='com.flipkart.android:id/phone_input' and @index='0']" )
private AndroidElement phone;
@AndroidFindBy(id = "com.flipkart.android:id/button")
private AndroidElement otp;

public void allow() {
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
email.click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
emailtext.sendKeys("deepak@mindrops.com");
con.click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	 
Actions phone=new Actions(driver);
phone.sendKeys("9205435391").sendKeys(Keys.ENTER).build().perform();
         //phone.sendKeys("8130360169");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

otp.click();


}




public void login()

{
login.click();
emailid.sendKeys("lakshayahuja35@gmail.com");
password.sendKeys("123456");
loginintobeeja.click();

}
}