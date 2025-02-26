package com.utilPackage;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilityClasses.FileUtility;

public class DriverFactory {
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();

	public static void setUpBrowser() throws Exception {
		FileUtility fileUtility=new FileUtility();
		String browserName=fileUtility.getDataFromPropertiesFiles("browser");
		String url=fileUtility.getDataFromPropertiesFiles("url");
		if (browserName.equals("chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.setBinary("C:\\Users\\Gowthami\\OneDrive\\Documents\\Selenium\\chrome-win64\\chrome-win64\\chrome.exe");	
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.popups", 1);      // Allow pop-ups
			prefs.put("profile.default_content_setting_values.notifications", 2); // Block notifications

			opt.setExperimentalOption("prefs", prefs);
			
			driver.set(new ChromeDriver(opt));
		} else if (browserName.equals("edge")) {
			driver.set(new EdgeDriver());
		} else if (browserName.equals("firefox")) {
			driver.set(new FirefoxDriver());
		} else {
			driver.set(new ChromeDriver());
		}
		driver.get().manage().window().maximize();
		driver.get().get(url);
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static WebDriver getDriver(){
		return driver.get();
	}
	
	public static void quitBrowser()
	{
		if(driver!=null)
		driver.get().quit();
	}
}
