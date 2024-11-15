package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HelpCenterPage extends FlatInBanglorePage {

	public HelpCenterPage(WebDriver driver) {
		super(driver);
	}
	
	public ManageCallsOrAlertsPage clickOnManageCallsOrAlertsLink(WebDriver driver)
	{
		javaScriptUtil.jsClick(getManageCallsAndAlertsLink());
		return new ManageCallsOrAlertsPage(driver);
	}


	@FindBy(id = "explore87")
	private WebElement exploreMoreLink;

	@FindBy(linkText = "Manage Calls/ Alerts")
	private WebElement manageCallsAndAlertsLink;

	public WebElement getExploreMoreLink() {
		return exploreMoreLink;
	}

	public WebElement getManageCallsAndAlertsLink() {
		return manageCallsAndAlertsLink;
	}

	@FindBy(xpath = "//a[@class='active']")
	private WebElement manageListLink;

	public WebElement getManageListLink() {
		return manageListLink;
	}

	@FindBy(id = "userPersonaPopupCloseAnchor")
	private WebElement helpCenterPopUp;

	public WebElement getHelpCenterPopUp() {
		return helpCenterPopUp;
	}

	// click operation
	public void clickElement(WebElement element) {
		element.click();
	}

	// sendKeys Operation
	public void sendKeysToElement(WebElement element, String keys) {
		element.sendKeys(keys);
	}

}