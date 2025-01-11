package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnswerPage extends ManageCallsOrAlertsPage {

	public AnswerPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='active']")
	private WebElement manageListLink;

	public WebElement getManageListLink() {
		return manageListLink;
	}
}
