package utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

 

public class EmailConfig {

	private final static String FILE_NAME = "email.properties";

	private static Properties properties;
	private static InputStream inputStream;

	public static List<String> getAllEmails() {
		List<String> emails = new ArrayList<>();

		try {
			properties = new Properties();
			inputStream = new FileInputStream("./" + FILE_NAME);

			properties.load(inputStream);

			Set<Object> keys = properties.keySet();
			for (Object object : keys) {
				emails.add(String.valueOf(properties.getProperty((String) object)));

			}

			return emails;

		} catch (Exception e) {

			e.printStackTrace();

		}

		return null;
	}

	public static void main(String[] args) {

		EmailConfig.getAllEmails();
	}

}
