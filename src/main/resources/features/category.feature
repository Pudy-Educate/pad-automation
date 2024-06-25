Feature: Category
  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: add category
    Given user is on home page
    When user is navigate on category pages
    And user click button add categories
    And user add categories
    Then the new categories is on the table

  Scenario: delete category
    Given user is on categories page
    When user click button delete
    And confirm to delete data
    Then deleted data is not displayed