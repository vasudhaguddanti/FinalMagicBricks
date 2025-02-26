package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpCenterPage extends FlatInBanglorePage {

	public HelpCenterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "explore87")
	private WebElement exploreMoreLink;

	public WebElement getExploreMoreLink() {
		return exploreMoreLink;
	}

	@FindBy(linkText = "Manage Calls/ Alerts")
	private WebElement manageCallsAndAlertsLink;

	public WebElement getManageCallsAndAlertsLink() {
		return manageCallsAndAlertsLink;
	}

	@FindBy(id = "userPersonaPopupCloseAnchor")
	private WebElement helpCenterPopUp;

	public WebElement getHelpCenterPopUp() {
		return helpCenterPopUp;
	}

	// page chaining

	public ManageCallsOrAlertsPage clickOnManageCallsOrAlertsLink(WebDriver driver) {
		javascriptClick(driver, getManageCallsAndAlertsLink());
		return new ManageCallsOrAlertsPage(driver);
	}

}
