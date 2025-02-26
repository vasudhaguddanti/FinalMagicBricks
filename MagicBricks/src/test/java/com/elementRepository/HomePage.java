package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "buyheading")
	private WebElement buyLink;

	public WebElement getBuyLink() {
		return buyLink;
	}

	@FindBy(partialLinkText = "Ready to Move")
	private WebElement readyToMoveLink;

	public WebElement getReadyToMoveLink() {
		return readyToMoveLink;
	}

	@FindBy(linkText = "Flats in Bangalore")
	private WebElement flatInBanglore;

	public WebElement getFlatInBanglore() {
		return flatInBanglore;
	}

	@FindBy(partialLinkText = "Budget Homes")
	private WebElement budgetHomesLink;

	public WebElement getBudgetHomesLink() {
		return budgetHomesLink;
	}

	@FindBy(linkText = "Premium Homes")
	private WebElement premiumHomesLink;

	public WebElement getPremiumHomesLink() {
		return premiumHomesLink;
	}

	// page chaining
	public BudgetHomesPage clickOnBudgetHomes(WebDriver driver) {
		javascriptClick(driver, getBudgetHomesLink());
		return new BudgetHomesPage(driver);
	}

	public PremiumHomesPage clickOnPremiumHomesLink(WebDriver driver) {
		clickElement(getPremiumHomesLink());
		return new PremiumHomesPage(driver);
	}

	public FlatInBanglorePage clickOnFlatInBangloreLink(WebDriver driver) {
		javascriptClick(driver, getFlatInBanglore());
		return new FlatInBanglorePage(driver);
	}

}
