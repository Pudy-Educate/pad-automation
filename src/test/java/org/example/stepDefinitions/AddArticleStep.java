package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ArticlePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.File;

import static org.example.pages.Basepage.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddArticleStep {
    private ArticlePage addArticlePage;

    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/category"));
        this.addArticlePage = new ArticlePage();
    }

    @When("the user navigates to the articles section")
    public void the_user_navigates_to_the_articles_section() throws InterruptedException {
        addArticlePage.navigateToArticlesSection();
    }

    @When("clicks on the tambah artikel button")
    public void clicks_on_the_button() {
        addArticlePage.clickButton();
    }

    @When("enters the article title {string}")
    public void enters_the_article_title(String title) {
        addArticlePage.enterArticleTitle(title);
    }

    @When("selects the category {string}")
    public void selects_the_category(String category) {
        addArticlePage.selectCategory(category);
    }

    @When("enters the article content {string}")
    public void enters_the_article_content(String content) {
        addArticlePage.enterArticleContent(content);
    }

    @When("upload an image")
    public void upload_an_image() {
        addArticlePage.uploadImage();
    }

    @When("clicks the submit button")
    public void clicks_the_publish_button() {
        addArticlePage.submit();
    }

    @When("accept modal confirmation")
    public void accept_modal_confirmation() throws InterruptedException {
        addArticlePage.acceptModalConfirmation();
    }

    @Then("the new article {string} should be visible in the article list")
    public void the_new_article_should_be_visible_in_the_article_list(String articleTitle) {
        Assertions.assertTrue(addArticlePage.isArticleVisible(articleTitle));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
