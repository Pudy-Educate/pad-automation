package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class ArticleStep {
    WebDriver driver;
    WebDriverWait wait;
    String newCategoryName;
    @Given("User is on the category page")
    public void user_is_on_the_category_page() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3001/admin/category");
    }
    @When("User try to add new category")
    public void user_try_to_add_new_category() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/button")).click();
        WebElement popUp = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div"));
        wait.until(ExpectedConditions.visibilityOf(popUp));
        Random random = new Random();
         newCategoryName = "Category " + random.nextInt(1000000);
        driver.findElement(By.xpath("//*[@id=\"kategori\"]")).sendKeys(newCategoryName);
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/button[1]")).click();
    }
    @Then("User will see a new category on the list")
    public void user_will_see_a_new_category_on_the_list() {
        WebElement newCategoryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//table//td[text()='" + newCategoryName + "']")
        ));

        assert newCategoryElement.isDisplayed();
    }
}
