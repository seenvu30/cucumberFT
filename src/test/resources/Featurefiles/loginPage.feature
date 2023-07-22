@login
Feature: To verfy Login functionality


@sanity @smoke
  Scenario Outline: To validate login function valid and invalid datas
    Given To user launch chrome browser
    When To user enter "<username>" and "<password>"
    And To user Click loginbutton
    Then To user verify valid

    Examples: 
      | username | password |
      | java     |      111 |
    #  | python   |      222 |
     # | sql      |      333 |
