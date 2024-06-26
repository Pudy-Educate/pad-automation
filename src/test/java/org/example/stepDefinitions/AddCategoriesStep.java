package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CategoriesPage;
import org.example.pages.Basepage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCategoriesStep {
    WebDriver driver = Basepage.driver;
    String data = "UI Automation";
    CategoriesPage page = new CategoriesPage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/home"));
    }
    @When("user is navigate on category pages")
    public void user_is_navigate_on_category_pages() throws InterruptedException {
        page.navigateCategoriesPage();
        Thread.sleep(3000);
    }
    @When("user click button add categories")
    public void user_click_button_add_categories() {
        page.clickAddCategories();
    }
    @When("user add categories")
    public void user_add_categories() throws InterruptedException {
        page.inputCategories(data);
        Thread.sleep(3000);
        page.closeModal();
    }
    @Then("the new categories is on the table")
    public void the_new_categories_is_on_the_table() {
        WebElement text = driver.findElement(By.xpath("//*[contains(text(), '" + data + "')]"));
        text.isDisplayed();
    }
}
