Feature: Matrix Calculator
    #Тест 1. Сравнение матриц
  Scenario:
    Given I have my matrix calculator
    When I have entered 2 as matrix dimension
    And I have entered 1,2,1,2 as first operand
    And I have entered 1,2,1,2 as second operand
    And I press 'CompareMatrix'
    Then The result should be "true"

    #Тест 2. Сравнение матриц
  Scenario:
    Given I have my matrix calculator
    When I have entered 2 as matrix dimension
    And I have entered 1,2,1,2 as first operand
    And I have entered 1,2,3,4 as second operand
    And I press 'CompareMatrix'
    Then The result should be "false"

    #Тест 3. Транспонирование матрицы
  Scenario:
    Given I have my matrix calculator
    When I have entered 3 as matrix dimension
    And I have entered 1,2,3,1,2,3,1,2,3 as first operand
    And I press 'Trans'
    Then The result of Trans should be 1,1,1,2,2,2,3,3,3

    #Тест 4. Двойное Транспонирование матрицы
  Scenario:
    Given I have my matrix calculator
    When I have entered 3 as matrix dimension
    And I have entered 1,2,3,1,2,3,1,2,3 as first operand
    And I press 'TwiceTrans'
    Then The result of Trans should be 1,2,3,1,2,3,1,2,3

    #Тест 5. Сложение двух матриц
  Scenario:
    Given I have my matrix calculator
    When I have entered 3 as matrix dimension
    And I have entered 1,2,3,1,2,3,1,2,3 as first operand
    And I have entered 1,1,1,2,2,2,3,3,3 as second operand
    And I press 'Add'
    Then The result of Add should be 2,3,4,3,4,5,4,5,6