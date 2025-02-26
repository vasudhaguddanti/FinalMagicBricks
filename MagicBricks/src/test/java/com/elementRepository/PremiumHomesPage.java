package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremiumHomesPage extends HomePage {
	public PremiumHomesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//a[@class='mb-header__sub__tabs__link js-menu-link'])[7]")
	private WebElement helpLink;

	public WebElement getHelpLink() {
		return helpLink;
	}

	@FindBy(xpath = "(//a[text()='Help Center'])[1]")
	private WebElement helpCenterLink;

	public WebElement getHelpCenterLink() {
		return helpCenterLink;
	}

	@FindBy(linkText = "Terms & Conditions")
	private WebElement termsAndConditionsPage;

	public WebElement getTermsAndConditionsPage() {
		return termsAndConditionsPage;
	}

	@FindBy(xpath = "(//a[text()='Home Loans'])[1]")
	private WebElement homeLoanLink;

	public WebElement getHomeLoanLink() {
		return homeLoanLink;
	}

	@FindBy(linkText = "SBI Home Loan EMI Calculator")
	private WebElement SBIHomeLoanEmiCalculator;

	public WebElement getSBIHomeLoanEmiCalculator() {
		return SBIHomeLoanEmiCalculator;
	}

	// page chaining
	public SbiHomeLoanEmiCalculatorPage clickOnSBIHomeLoanEmiCalculatorLink(WebDriver driver) {
		javascriptClick(driver, getSBIHomeLoanEmiCalculator());
		return new SbiHomeLoanEmiCalculatorPage(driver);
	}

}
