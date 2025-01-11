package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PremiumHomesPage extends HomePage {
	public PremiumHomesPage(WebDriver driver){
		super(driver);
	}
	
	public SbiHomeLoanEmiCalculatorPage clickOnSBIHomeLoanEmiCalculatorLink(WebDriver driver)
	{
		javaScriptUtil.jsClick(getSBIHomeLoanEmiCalculator());
		return new SbiHomeLoanEmiCalculatorPage(driver);	
	}

	@FindBy(xpath = "(//a[@class='mb-header__sub__tabs__link js-menu-link'])[7]")
	private WebElement helpLink;

	@FindBy(xpath = "(//a[text()='Help Center'])[1]")
	private WebElement helpCenterLink;

	public WebElement getHelpLink() {
		return helpLink;
	}

	public WebElement getHelpCenterLink() {
		return helpCenterLink;
	}

	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termsAndConditionsPage;

	public WebElement getTermsAndConditionsPage() {
		return termsAndConditionsPage;
	}

	@FindBy(xpath = "(//a[text()='Home Loans'])[1]")
	private WebElement homeLoanLink;

	@FindBy(xpath = "//a[text()='SBI Home Loan EMI Calculator']")
	private WebElement SBIHomeLoanEmiCalculator;

	public WebElement getHomeLoanLink() {
		return homeLoanLink;
	}

	public WebElement getSBIHomeLoanEmiCalculator() {
		return SBIHomeLoanEmiCalculator;
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
