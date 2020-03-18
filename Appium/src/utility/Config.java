package utility;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Config {

	private static final String FILENAME = "config.properties";
	static Properties properties = new Properties();
	static InputStream io;

	public static WebDriver chromePath() {
		try {
			// io = new FileInputStream(FILENAME);

			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				System.setProperty("webdriver.chrome.driver", properties.getProperty("chromepath"));

				System.out.println(properties.getProperty("chromepath"));
				ChromeOptions options=new ChromeOptions();
				/*
				 * options.addArguments("window-size=1400,600");
				 * options.addArguments("headless");
				 */
				return new ChromeDriver(options);

			}

			else {
				System.out.println("Not found");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;

	}

	public static WebDriver Firefoxpath() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				System.setProperty("webdriver.gecko.driver", properties.getProperty("Firefox_path"));

				System.out.println(properties.getProperty("Firefox_path"));
				return new FirefoxDriver();
			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}

	public static final String getCardNumber() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("cardnumber");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	
	public static final String getemail() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("email");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	
	public static final String Firstname() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("firstname");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	public static final String Lastname() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("lastname");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	public static final String Address() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("address");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	public static final String City() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("city");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	public static final String Zipcode() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("zipcode");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	public static final String Cvnumber() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("cvnumber");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	
	public static final String Phoneno() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("phoneno");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}
	public static final String subscription_signup() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("subscriptionsignup");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}
	
	public static final String sendemail() {
		try {
			io = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILENAME);

			if (io != null) {
				properties.load(io);

				return properties.getProperty("emailpath");

			} else {
				System.out.println("Not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}
	
	
	
	
}
