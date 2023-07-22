
@loginPage
Feature: To validate Login functionality
	@sanity
  Scenario: To validate valid username and invalid password
    Given To user launch chrome browser
    Given To user pass valid url
    When To user pass valid username and invalid password
      #1D Map
      | username | sql@123  |
      | password |     1111 |
      | email    | java@123 |
      | phno     |    12344 |
    And To user click login button
    Then To user verify valid
	@smoke
  Scenario: To validate invalid username and invalid password
    Given To user launch chrome browser
    Given To user enter valid url
    When To user pass invalid username and invalid password
      #2D Map
      | email        | phno | password |
      | java@123     | 1111 | java     |
      | sql@111      | 2222 | sql      |
      | selenium@123 | 3333 | selenium |
    And To user click login button
    Then To user Close chrome browser
