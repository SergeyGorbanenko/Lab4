Feature: Matrix Calculator
  Scenario:
    Given I have my matrix calculator
    When I have entered matrix1 as first operand
    And I have entered matrix1 as second operand
    And I press 'CompareMatrix'
    Then The result should be true