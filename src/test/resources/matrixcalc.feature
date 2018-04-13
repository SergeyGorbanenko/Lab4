Feature: Matrix Calculator
  Scenario:
    Given I have my matrix calculator
    When I have entered 2 as matrix dimension
    When I have entered 1,2,1,2 as first operand
    And I have entered 1,2,1,2 as second operand
    And I press 'CompareMatrix'
    Then The result should be "true"