package com.hook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.utilPackage.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseClass {

	WebDriver driver;

	@Before
	public void beforeScenario() throws Exception {
		DriverFactory.setUpBrowser();
		driver = DriverFactory.getDriver();
	}

	@After
	public void afterScenario(Scenario scenario) throws IOException {
			TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
			File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
			File newFile=new File("./Screenshot/screenshot.png");
			FileHandler.copy(file, newFile);
			
		DriverFactory.quitBrowser();
	}
}
