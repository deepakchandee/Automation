
package navigationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Navigationpage {


    public AndroidDriver<AndroidElement> driver;
public HomePage navigatetohomepage(AndroidDriver<AndroidElement> driver) {
	HomePage objhomepage = new HomePage();
PageFactory.initElements(new AppiumFieldDecorator(driver), objhomepage);
return objhomepage;
}


}