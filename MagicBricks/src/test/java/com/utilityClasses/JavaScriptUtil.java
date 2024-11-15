package com.utilityClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
private JavascriptExecutor javaScript;
	
	public JavaScriptUtil(WebDriver driver) {
		javaScript = (JavascriptExecutor) driver;
	}
	
	/**
	 * This method is used to perform Click operation using JavascriptExecutor
	 * @param element pass the web element on which click action has to be performed
	 */
	public void jsClick(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}
}
