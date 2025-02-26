package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"com.stepDefinitions","com.hook"},
features= {"./src/test/resources/featureData"},
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:Reports/CucumberJunit.xml",
		"html:Reports/CucumberReport.html",
		"json:Reports/CucumberJson.json"},
tags = "@Smoke or @Regression" )
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
