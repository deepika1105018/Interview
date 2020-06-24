package com.flip.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.flip.utility.TimeUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionLibrary {
	public static Properties prop;

	public static WebDriver driver;


	public static String readPropertyFile(String key) {
		
	prop = new Properties();

		try {
			prop.load(new FileInputStream("./src/main/java/com/flip/config/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
   return prop.getProperty(key);
	}
		
	public static  void browserFactory() {

		
		String browser = prop.getProperty("browser");
		if (browser.toUpperCase().equals("CHROME")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	
			else if (browser.toUpperCase().equals("IE")) {

				WebDriverManager.iedriver().setup();

				driver = new InternetExplorerDriver();
			}

			else {

				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();
			}


		driver.get(prop.getProperty("url"));	
		
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(TimeUtils.TIME_IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TimeUtils.TIME_PAGE_WAIT, TimeUnit.SECONDS);
			}

}

