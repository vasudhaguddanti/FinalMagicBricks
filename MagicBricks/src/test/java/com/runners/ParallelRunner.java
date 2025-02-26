package com.runners;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"com.stepDefinitions","com.hook"},
features= {"./src/test/resources/featureData"},
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:Reports/Cucumber.xml"})
public class ParallelRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount", "6");
		return super.scenarios();
	}

}
