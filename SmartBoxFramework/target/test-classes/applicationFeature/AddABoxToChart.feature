Feature: Smartbox Adding Gift to Chart
  Scenario: As a Customer I want to find a desired box and add it to the chart
    Given I am navigated to Smartbox website
    When  I choose desired box
    And I click on Add To Chart button
    And I accept Add To Chart pop up
    Then I should be able to place my order