Feature: BuyLink

Background: 
When Browser should be open and url should be navigated
And user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And The Ready to Move link should be displayed

#
@Smoke
Scenario: Validate that the user should be able to see the Manage Calls/Alerts answers


And user should be click on Flat in Banglore and navigated to the FlatInBanglorePage
And user should be click on MenuBarIcon 
And user should be able to click on help link
And user should be clicks on the Help Center link and navigates to the Help Center page
And user should be clicks on the Explore More link
And user should be clicks on the Manage CallsandAlerts link
Then user should be able to click on the first question

@Smoke                                                                                                   
Scenario: Validate that the user able to Calculate the Emi

And user should be able to click on Premium Homes Link and navigate to the premium homes Page
And user should be able to mouse hover on HomeLoans Link
And user should be able to click on the SBIHomeLoanEMICalculator Link and navigate to the SBIHomeLoanEMICalculator Page
And user should be able to change the LoanTenure Years
Then user should be click on RecalculateYourEMI button and calculate EMI amount


@Smoke
Scenario: Validate that user is able to click on flatName and navigate to the details of the flat page

And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be click on the BHK link
And user should be click on the 1BHK link
And user should be able to remove the HouseOrVilla type in PropertyType
Then user should be able to click on  property Name link and navigate to the property details page


@Smoke
Scenario Outline: Validate that the user is able to change the maxOption in Budget and navigate to that relavent Page

And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be able to click on BudgetLink
And user should be able to select on the <Max value> in MaxOptions Dropdown
Then user should be navigate to that relavent Page

Examples:
    | Max value |
    | 1 |
    | 2 |
    | 3 |



