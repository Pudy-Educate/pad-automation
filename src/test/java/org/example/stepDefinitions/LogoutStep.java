package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class LogoutStep {
    WebDriver driver;

    public void setUp() { driver = new FirefoxDriver(); }

    @Given("user is logged in")
    public void user_is_logged_in() {
        setUp();
        driver.get("http://localhost:3001/admin/home");
    }

    @When("user clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
        LogoutPage logout = new LogoutPage(driver);
        logout.clickLogout();
    }

    @When("user clicks on button confirmation")
    public void user_clicks_on_button_confirmation() {
        LogoutPage logout = new LogoutPage(driver);
        logout.clickConfirm();
    }

    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {
        LogoutPage logout = new LogoutPage(driver);
        String expectedUrl = "http://localhost:3001/login";
        assertEquals(expectedUrl,logout.getUrl());
    }
}
