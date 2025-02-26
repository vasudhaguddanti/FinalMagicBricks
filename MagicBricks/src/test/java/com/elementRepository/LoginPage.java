package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "emailOrMobile")
	private WebElement emailOrPhoneTextFeild;

	public WebElement getEmailOrPhoneTextFeild() {
		return emailOrPhoneTextFeild;
	}

	@FindBy(id = "btnStep1")
	private WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}

	@FindBy(xpath = "(//button[contains(text(),'Continue')])[2]")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

	// page chaining
	public HomePage clickOnContinueLink(WebDriver driver) {
		clickElement(continueButton);
		return new HomePage(driver);
	}

	public HomePage clickOnContinueButton(WebDriver driver) {
		clickElement(getContinueButton());
		return new HomePage(driver);
	}

}
