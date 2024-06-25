package org.example.auth;

import io.cucumber.java.After;
import org.example.object.Basepage;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogout() {
        driver.findElement(AuthObject.btnLogout).click();
    }

    public void clickConfirm() {
        if (driver.findElement(AuthObject.swalLogout).isDisplayed()) {
            driver.findElement(AuthObject.btnConfirmModal).click();
        }
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    @After
    public void tearDown() {
        Basepage.driver.quit();
    }
}
