package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LogoutPage;
import org.example.object.Basepage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class LogoutStep {
    @Given("user is logged in")
    public void user_is_logged_in() {
        Assertions.assertTrue(Basepage.driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/home"));

    }

    @When("user clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
        LogoutPage logout = new LogoutPage(Basepage.driver);
        logout.clickLogout();
    }

    @When("user clicks on button confirmation")
    public void user_clicks_on_button_confirmation() throws InterruptedException {
        Thread.sleep(3000);
        LogoutPage logout = new LogoutPage(Basepage.driver);
        logout.clickConfirm();
    }

    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {
        LogoutPage logout = new LogoutPage(Basepage.driver);
        String expectedUrl = "https://naturecare-pad.vercel.app/login";
        assertEquals(expectedUrl,logout.getUrl());
    }
}
