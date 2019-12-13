Feature: CucumberLoginOnWeb

  Scenario Outline: user can login on the website
    Given an open browser with https://tester.codersguru.pl/
    When enter email address <emailAddress>
    And press the button Prywatnie
#    And check email<emailAddress>
    And enter first name <firstName>
    And enter last name <lastName>
    And enter password <password>
    And enter again password <password>
    And enter City <city>
    And enter street <street>
    And enter Zip <zipCod>
    And enter number of home <numberHome>
    And check the button Regulamin
    Then click button registration
    And check if an account has been created <firstName>



    Examples:
      | emailAddress | firstName | lastName | password | city     | street | zipCod | numberHome |
      | jan3@vp.pl   | Jan       | Kowlaski | Ala123   | Katowice | Polna  | 43-100 | 15         |