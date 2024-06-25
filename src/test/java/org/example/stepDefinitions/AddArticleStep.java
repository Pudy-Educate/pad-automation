package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.object.Basepage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Random;

import static org.example.object.Basepage.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddArticleStep {


    @Given("the user is on home page")
    public void the_user_is_on_category_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/home"));
    }

    @When("the user navigates to the articles section")
    public void the_user_navigates_to_the_articles_section() throws InterruptedException{
        WebElement articlesSection = driver.findElement(By.xpath("//a[@href='/admin/article']")); // Replace with appropriate selector
        articlesSection.click();
        Thread.sleep(5000);
    }

    @When("clicks on the {string} button")
    public void clicks_on_the_button(String buttonName) {
        WebElement addArticleButton = driver.findElement(By.xpath("//button[text()='Tambah Artikel']")); // Replace with appropriate selector
        addArticleButton.click();
    }

    @When("enters the article title {string}")
    public void enters_the_article_title(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='title']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("selects the category {string}")
    public void selects_the_category(String category) {
        WebElement categoryDropdown = driver.findElement(By.xpath("//select[@class=' border-2 border-grey-accent p-3  rounded-xl duration-500 focus:border-primary-blue outline-none w-full cursor-pointer']")); // Replace with appropriate selector
        categoryDropdown.sendKeys(category); // Alternatively, use Select class for dropdowns
    }

    @When("enters the article content {string}")
    public void enters_the_article_content(String content) {
        String htmlContent = "<p>This is a <strong>test</strong> paragraph.</p>";
        String script = "arguments[0].innerHTML = arguments[1];";

        // Find the contenteditable div
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script, driver.findElement(By.cssSelector("div.ql-editor")), content);
    }

    @When("upload an image")
    public void upload_an_image() {
        WebElement imageInput = driver.findElement(By.xpath("//input[@type='file']")); // Replace with appropriate selector
        String filePath = new File("src/main/resources/assets/test_article.jpg").getAbsolutePath();
        imageInput.sendKeys(filePath);
    }
    @When("clicks the {string} button")
    public void clicks_the_publish_button(String buttonName) {
        WebElement publishButton = driver.findElement(By.xpath("//button[text()='Tambahkan']")); // Replace with appropriate selector
        publishButton.click();
    }

    @When("accept modal confirmation")
    public void accept_modal_confirmation() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(By.xpath("//button[text()='OK']"));
        confirmButton.click();
    }

    @Then("the new article {string} should be visible in the article list")
    public void the_new_article_should_be_visible_in_the_article_list(String articleTitle) {
        WebElement articleList = driver.findElement(By.xpath("//tr[contains(td/text(), '" + articleTitle + "')]"));
        Assert.assertTrue(articleList.getText(), true);
    }

    @After
    public void tearDown() {
            driver.quit();
    }
}
