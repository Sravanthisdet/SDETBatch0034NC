Feature: LoginWithData_NC

  Background: 
    Given launch the chrome browser
	
	@Smoke
  Scenario: Validate logn functionality with given data1
    When open nc login page in opened browser
    When enter valid "admin@yourstore.com" id in email field
    When enter valid "admin" in password field
    When click on login button of the login page
    Then verify login success

	@Regression
  Scenario Outline: Validate logn functionality with given data1
    When open nc login page in opened browser
    When enter valid "<Email>" id in email field
    When enter valid "<Password>" in password field
    When click on login button of the login page
    Then verify login success

    Examples: 
      | Email               | Password |
      | admin@yourstore.com | admin    |
      | test@yourstore.com  | admin    |
      | admin@yourstore.com | test     |

	@Smoke
  Scenario: Validate Login with datatable data
    When user should open the nc login page
    When user enter email and pws data as credentials
      | admin@yourstore.com | admin |
      | test@yourstore.com  | admin |
    When user click on login button
    Then user should verify login success
