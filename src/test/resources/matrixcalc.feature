Feature: Matrix Calculator
  //Тест 1
  Scenario:
    Given I have my matrix calculator
    When I have entered 2 as matrix dimension
    When I have entered 1,2,1,2 as first operand
    And I have entered 1,2,1,2 as second operand
    And I press 'CompareMatrix'
    Then The result should be "true"

  //Тест 2
  Scenario:
    Given I have my matrix calculator
    When I have entered 2 as matrix dimension
    When I have entered 1,2,1,2 as first operand
    And I have entered 1,2,3,4 as second operand
    And I press 'CompareMatrix'
    Then The result should be "false"

  //Тест 3
  Scenario:
    Given I have my matrix calculator
    When I have entered 3 as matrix dimension
    When I have entered 1,2,3,1,2,3,1,2,3 as first operand
    And I press 'CompareMatrix'
    Then The result should be 1,1,1,2,2,2,3,3,3