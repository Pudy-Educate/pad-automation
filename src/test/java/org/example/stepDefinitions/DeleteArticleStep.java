package org.example.stepDefinitions;


import io.cucumber.java.en.When;
import org.example.pages.ArticlePage;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.pages.Basepage.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeleteArticleStep {
    ArticlePage articlePage = new ArticlePage();
    @When("the user is on the article list page")
    public void the_user_is_on_category_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/article"));
    }

    @When("the user clicks on the delete button of the article {string}")
    public void user_clicks_on_the_delete_button(String articleTitle) {
        articlePage.clickDeleteButton(articleTitle);
    }

    @When("accept modal confirmation delete")
    public void user_clicks_on_the_confirm_button() throws InterruptedException {
        articlePage.confirmDelete();
    }

    @When("accept modal deleted successfully")
    public void accept_modal_deleted_successfully() throws InterruptedException {
        articlePage.confirmDeleteSuccess();
    }

    @When("the klinik should be added to the list of klinik")
    public void the_klinik_should_be_added_to_the_list_of_klinik() {
        WebElement articlesSection = driver.findElement(By.xpath("//tr[td[text()='Klinik Test']]"));
        Assert.assertTrue(articlesSection.isDisplayed());
    }

}
