package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LoginPage;
import org.example.auth.LoginResult;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {
    WebDriver driver;
    public void setUp() {driver = new FirefoxDriver();}

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        setUp();
        driver.get("http://localhost:3001/login/");
    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        LoginPage login = new LoginPage(driver);
        login.setLoginForm("admin@gmail.com", "12345678");
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        LoginPage login = new LoginPage(driver);
        login.clickSubmit();
    }
    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        LoginResult result = new LoginResult(driver);
        boolean modal = result.getModal();
        assertTrue(modal);
    }

    @After()
    public void closeBrowser(){
        driver.quit();
    }
}
