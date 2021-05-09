Feature: Smartbox Adding Gift to Chart
  Scenario: As a Customer I want to find a desired box and add it to the chart
    Given I am navigated to Smartbox website
    When I am on the home page "Smartbox Ireland - Experience Gifts for all Occasions"
    When  I choose desired box
    And I click on Add To Chart button on page "Gift Box Pamper Treats - Smartbox"
    And I accept Add To Chart pop up
    Then I should be able to place my order on page "Original gift boxes for anyone - Smartbox"
    
  Scenario: As a Customer I want to find desired boxes and add it to the chart
    Given I am navigated to Smartbox website
    When I am on the home page "Smartbox Ireland - Experience Gifts for all Occasions"
    When  I choose desired box
    And I click on Add To Chart button on page "Gift Box Pamper Treats - Smartbox"
    When I decide to Continue Shopping
    And I choose desired box2
    And I click on Add To Chart button on page
    And I accept Add To Chart pop up
    Then I should be able to place my order on page "Original gift boxes for anyone - Smartbox"
  