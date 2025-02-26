package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SbiHomeLoanEmiCalculatorPage extends PremiumHomesPage {

	public SbiHomeLoanEmiCalculatorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='hl__calc__form__input-row select']")
	private WebElement loanTenureLink;

	public WebElement getLoanTenureLink() {
		return loanTenureLink;
	}

	@FindBy(xpath = "(//li[@class='select__list--option'])[2]")
	private WebElement tenYears;

	public WebElement getTenYears() {
		return tenYears;
	}

	@FindBy(id = "submitbuttonEmiCalid")
	private WebElement RecalculatorYourEmiButton;

	public WebElement getRecalculatorYourEmiButton() {
		return RecalculatorYourEmiButton;
	}

	@FindBy(id = "perMonthEmi")
	private WebElement emiAmount;

	public WebElement getEmiAmount() {
		return emiAmount;
	}

}
