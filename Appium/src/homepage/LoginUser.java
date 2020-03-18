package homepage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.ObjLongConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import navigationpages.HomePage;
import navigationpages.Navigationpage;

public class LoginUser {

public static AppiumDriver<MobileElement> driver;

@Test
public static void loginbeeja() throws MalformedURLException, InterruptedException {

DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("deviceName", "AOSP on IA Emulator");
capabilities.setCapability("platformVersion", "9");
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("automationName", "uiautomator2");
capabilities.setCapability("appPackage", "com.flipkart.android");
capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
//capabilities.setCapability("appWaitPackage", "com.beejameditation.beeja.view.splashscreen.SplashActivity");
Thread.sleep(3000);
AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
Thread.sleep(12000);
HomePage objlogin = new HomePage(driver);
Thread.sleep(40000);
objlogin.allow();
Thread.sleep(40000);

		/*
		 * objlogin.login(); System.out.println("User is logged in succesfully");
		 * Thread.sleep(3000); driver.quit();
		 */
}
}


