package org.example.auth;

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
        clickLogout();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
