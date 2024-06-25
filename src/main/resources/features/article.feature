Feature: Add Article

  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: Add a new article
    Given the user is on home page
    When the user navigates to the articles section
    And clicks on the "Add Article" button
    And enters the article title "Latest Tech Trends"
    And selects the category "Tech"
    And enters the article content "Content of the latest tech trends."
    And upload an image
    And clicks the "Publish" button
    And accept modal confirmation
    Then the new article "Latest Tech Trends" should be visible in the article list

  Scenario: Delete an article
    Given the user is on the article list page
    When the user clicks on the delete button of the article "Latest Tech Trends"
    And accept modal confirmation delete
    Then accept modal deleted successfully
