Feature: MagicBrickBuyModule


Background:
Given Browser should be open and url should be navigated
When user should be able to hover on login link

@Regression
Scenario: Validate that the user is able to add flat to the shortList

And user should be able to click on login button and navigate to the login page
And user should be able to enter valid credentails and click on next button
And user should be able to click on continue
Then user should be logged in
When Browser should be open and url should be navigated
And user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be able to click on the like button
And user should be able to mouse hover on Shortlist button and click on View your Shortlisted Properties link
Then user should be able see the property in Shortlist page






