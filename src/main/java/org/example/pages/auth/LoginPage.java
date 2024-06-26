package org.example.pages.auth;

import org.example.object.AuthObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginForm(String username, String password) {
        driver.findElement(AuthObject.email).sendKeys(username);
        driver.findElement(AuthObject.password).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(AuthObject.btnLogin).click();
    }

    public Boolean getModal()
    {
        WebElement modal = driver.findElement(AuthObject.swalLogin);
        return modal.isDisplayed();
    }

    public void confirmLogin() {
        driver.findElement(AuthObject.btnConfirmModal).click();
    }
}
