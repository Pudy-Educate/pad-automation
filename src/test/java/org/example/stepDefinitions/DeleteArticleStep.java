package org.example.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.object.Basepage.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeleteArticleStep {
    @When("the user is on the article list page")
    public void the_user_is_on_category_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/article"));
    }

    @When("the user clicks on the delete button of the article {string}")
    public void user_clicks_on_the_delete_button(String articleTitle) {
        WebElement articlesSection = driver.findElement(By.xpath("//tr[td[text()='" + articleTitle + "']]"));
        WebElement deleteButton = articlesSection.findElement(By.xpath(".//button[text()='Hapus']"));
        deleteButton.click();
    }


    @When("accept modal confirmation delete")
    public void user_clicks_on_the_confirm_button() throws InterruptedException{
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(By.xpath("//button[text()='Ya']"));
        confirmButton.click();
    }

    @When("accept modal deleted successfully")
    public void accept_modal_deleted_succefully() throws InterruptedException{
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(By.xpath("//button[text()='OK']"));
        confirmButton.click();
    }


}
