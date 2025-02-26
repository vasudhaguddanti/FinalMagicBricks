package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PropertyDetailsPage extends BudgetHomesPage {
	
	public PropertyDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "(//a[@class='mb-ldp__dtls__body__list--link'])[2]")
	private WebElement projectName;

	public WebElement getProjectName() {
		return projectName;
	}

	@FindBy(xpath = "//h2[@class='mb-srp__card--title']")
	private WebElement propertyNameLink;
	
	public WebElement getPropertyNameLink() {
		return propertyNameLink;
	}

}
