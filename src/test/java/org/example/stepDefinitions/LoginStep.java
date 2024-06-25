package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LoginPage;
import org.example.object.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Basepage.driver.get("https://naturecare-pad.vercel.app/login/");
    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        LoginPage login = new LoginPage(Basepage.driver);
        login.setLoginForm("pudy123@gmail.com", "herbacare");
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        LoginPage login = new LoginPage(Basepage.driver);
        login.clickSubmit();
    }
    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() throws InterruptedException {
        LoginPage login = new LoginPage(Basepage.driver);
        Thread.sleep(2000);
        boolean modal = login.getModal();
        assertTrue(modal);
        login.confirmLogin();
    }
}
