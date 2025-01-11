package com.elementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityClasses.WebDriverUtility;

public class BasePage {
	WebDriver driver;
	WebDriverUtility webDriverUtility = new WebDriverUtility();

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	@FindBy(xpath = "(//a[text()='Login'])[2]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "(//a[@class='mb-header__main__link js-menu-link'])[1]")
	private WebElement locationLink;

	public WebElement getLocationLink() {
		return locationLink;
	}

	@FindBy(xpath = "//ul[@class='city-drop-link-group']//a[text()='Bangalore']")
	private WebElement bangloreLink;

	public WebElement getBangloreLink() {
		return bangloreLink;
	}

	@FindBy(css = ".mb-header__main__logo")
	private WebElement magicBricksLogo;

	public WebElement getMagicBricksLogo() {
		return magicBricksLogo;
	}

	@FindBy(linkText = "Sign Up")
	private WebElement signUpLink;

	public WebElement getSignUpLink() {
		return signUpLink;
	}

	@FindBy(xpath = "//div[@class='onmodal__cross']")
	private WebElement popUpWrong;

	public WebElement getPopUpWrong() {
		return popUpWrong;
	}

	@FindBy(xpath = "//div[@class='mb-header__main__login js-menu-container loggedin']")
	private WebElement visibleProfile;

	public WebElement getVisibleProfile() {
		return visibleProfile;
	}

	// page chaning

	public LoginPage clickOnLoginButton(WebDriver driver) {
		javascriptClick(driver, getLoginButton());
		;
		return new LoginPage(driver);
	}

	public HomePage clickOnBangloreLink(WebDriver driver) {
		javascriptClick(driver, getBangloreLink());
		return new HomePage(driver);
	}

	// click operation
	public void clickElement(WebElement element) {
		element.click();
	}

	// sendKeys Operation
	public void sendKeysToElement(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public void javascriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", element);
	}

}