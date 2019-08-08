Feature: Login Feature

	Scenario Outline: Test Login with valid credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And Clicks on login button
    Then User is navigated to Menu page

	Examples: 
	|username|password|
	|meri.hayrapetyan.dev|aeHFOx8jV/A=|

	