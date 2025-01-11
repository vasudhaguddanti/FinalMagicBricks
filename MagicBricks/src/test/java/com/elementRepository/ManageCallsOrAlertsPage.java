package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageCallsOrAlertsPage extends HelpCenterPage {

	public ManageCallsOrAlertsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='list-item__list']//li)[1]")
	private WebElement question1Link;

	public WebElement getQuestion1Link() {
		return question1Link;
	}

	// page chaining
	public AnswerPage clickOnQuestionLink(WebDriver driver) {
		javascriptClick(driver, getQuestion1Link());
		return new AnswerPage(driver);
	}

}
