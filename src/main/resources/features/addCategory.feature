Feature: Category

  Scenario: Creating a new Category
    Given User is on the category page
    When User try to add new category
    Then User will see a new category on the list

