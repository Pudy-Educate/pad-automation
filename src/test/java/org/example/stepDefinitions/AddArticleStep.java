package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.object.Basepage;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddArticleStep {


    @Given("the user is on category page")
    public void the_user_is_on_category_page() {
        Assertions.assertTrue(Basepage.driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/home"));
    }

    @When("the user navigates to the articles section")
    public void the_user_navigates_to_the_articles_section() {
        WebElement articlesSection = Basepage.driver.findElement(By.id("articles-section")); // Replace with appropriate selector
//        Basepage.driver.executeScript("arguments[0].scrollIntoView();", articlesSection);
    }

    @When("clicks on the {string} button")
    public void clicks_on_the_button(String buttonName) {
        WebElement addArticleButton = Basepage.driver.findElement(By.id("add-article-button")); // Replace with appropriate selector
        addArticleButton.click();
    }

    @When("enters the article title {string}")
    public void enters_the_article_title(String title) {
        WebElement titleInput = Basepage.driver.findElement(By.id("article-title")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("selects the category {string}")
    public void selects_the_category(String category) {
        WebElement categoryDropdown = Basepage.driver.findElement(By.id("category-dropdown")); // Replace with appropriate selector
        categoryDropdown.sendKeys(category); // Alternatively, use Select class for dropdowns
    }

    @When("enters the article content {string}")
    public void enters_the_article_content(String content) {
        WebElement contentInput = Basepage.driver.findElement(By.id("article-content")); // Replace with appropriate selector
        contentInput.sendKeys(content);
    }

    @When("clicks the {string} button")
    public void clicks_the_publish_button(String buttonName) {
        WebElement publishButton = Basepage.driver.findElement(By.id("publish-button")); // Replace with appropriate selector
        publishButton.click();
    }

    @Then("the new article {string} should be visible in the article list")
    public void the_new_article_should_be_visible_in_the_article_list(String articleTitle) {
        WebElement articleList = Basepage.driver.findElement(By.id("article-list")); // Replace with appropriate selector
        String articlesText = articleList.getText();
//        assertTrue(articlesText.contains(articleTitle));
    }

    @After
    public void tearDown() {
            Basepage.driver.quit();
    }
}
