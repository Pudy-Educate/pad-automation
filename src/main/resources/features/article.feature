Feature: Add Article

  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: Add a new article
    Given the user is on category page
    When the user navigates to the articles section
    And clicks on the "Add Article" button
    And enters the article title "Latest Tech Trends"
    And selects the category "Tech"
    And enters the article content "Content of the latest tech trends."
    And clicks the "Publish" button
    Then the new article "Latest Tech Trends" should be visible in the article list
