package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CategoriesPage;
import org.example.object.Basepage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteCategoriesStep {
    WebDriver driver = Basepage.driver;
    String data = "UI Automation";
    CategoriesPage page = new CategoriesPage();

    @Given("user is on categories page")
    public void user_is_on_categories_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/category"));
    }
    @When("user click button delete")
    public void user_click_button_delete() {
        page.clickDeleteBtn(data);
    }
    @When("confirm to delete data")
    public void confirm_to_delete_data() throws InterruptedException {
        Thread.sleep(3000);
        page.modalDelete();
    }
    @Then("deleted data is not displayed")
    public void deleted_data_is_not_displayed() throws InterruptedException {
        Thread.sleep(1000);
        page.closeModal();
    }
}
