Feature: Register on the web
  Like new user
  I want to register in the web www.utest.com
  Scenario: Register on the web
    Given I want to register on the page
    Then I go to register page
    When I fill the 1st form with valid data
      | name     | lastname | email         | month   | day | year | language |
      | Isabella | Bedoya   | test@optq.com | January | 23  | 2001 | Spanish  |
    When I fill the 2nd form with valid data
      | city    | zip   | country  |
      | Palmira | 12345 | Colombia |
    When I fill the 3rd form with valid data
      | computer | version   |
      | Mac      | OS X 10.3 |
    When I fill the last form with valid data
      | password     |
      | Osopanda14$% |
    And I click on the register button
    Then I should see the message that I have registered successfully