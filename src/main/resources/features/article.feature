Feature: Add Article

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

  Scenario: Add a new article
    Given the user is on home page
    When the user navigates to the articles section
    And clicks on the tambah artikel button
    And enters the article title "Latest Tech Trends"
    And selects the category "UI Automation"
    And enters the article content "Content of the latest tech trends."
    And upload an image
    And clicks the submit button
    And accept modal confirmation
    Then the new article "Latest Tech Trends" should be visible in the article list

  Scenario: Delete an article
    Given the user is on the article list page
    When the user clicks on the delete button of the article "Latest Tech Trends"
    And accept modal confirmation delete
    Then accept modal deleted successfully
