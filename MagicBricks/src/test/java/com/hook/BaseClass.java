package com.hook;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.utilPackage.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	WebDriver driver;

	@Before
	public void beforeScenario() throws Exception {
		DriverFactory.setUpBrowser();
		driver = DriverFactory.getDriver();
	}

	@After
	public void afterScenario() throws IOException {
		DriverFactory.quitBrowser();
	}
}