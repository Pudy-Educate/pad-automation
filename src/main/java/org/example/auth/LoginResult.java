package org.example.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginResult {
    WebDriver driver;
    public LoginResult(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean getModal()
    {
        WebElement modal = driver.findElement(By.className("swal2-icon-success"));
        return modal.isDisplayed();
    }
}
