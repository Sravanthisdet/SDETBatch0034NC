Feature: Login_NC
	
	@Regression
  Scenario: Validate the NC Login functionality
    Given launch chrome browser
    When open nc login page
    When enter valid email id
    When enter valid password
    When click on the login button
  	Then verify login success
