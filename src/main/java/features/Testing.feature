@Regression
Feature: ZipDev Challenge
  @Ra
  Scenario Outline: Select checkbox against specific name
    Given the user has visit primefaces page
    When he checks the checkbox with name "<name>"
    Then the checkbox is checked
    Examples:
    |name|
    |Blue Band    |
