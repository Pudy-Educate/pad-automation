package org.example.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    By uname = new By.ById("email");
    By pass = new By.ById("password");
    By btnSubmit = By.xpath("/html/body/div[1]/div/div/div[2]/button");
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginForm(String username, String password) {
        driver.findElement(uname).sendKeys(username);
        driver.findElement(pass).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(btnSubmit).click();
    }
}
