package org.example.pages;

import org.example.object.KlinikObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import static org.example.pages.Basepage.driver;
public class KlinikPage {
    public void navigateToKlinikSection() {
        WebElement articlesSection = driver.findElement(KlinikObject.KLINIK_SECTION);
        articlesSection.click();
    }

    public void clickTambahKlinikButton()throws InterruptedException {
        Thread.sleep(3000);
        WebElement addArticleButton = driver.findElement(KlinikObject.TAMBAH_KLINIK_BUTTON);
        addArticleButton.click();
    }

    public void enterKlinikName(String name) {
        WebElement nameInput = driver.findElement(KlinikObject.KLINIK_NAME_INPUT);
        nameInput.sendKeys(name);
    }

    public void enterKlinikAddress(String address) {
        WebElement addressInput = driver.findElement(KlinikObject.KLINIK_ADDRESS_INPUT);
        addressInput.sendKeys(address);
    }

    public void enterKlinikPhone(String phone) {
        WebElement phoneInput = driver.findElement(KlinikObject.KLINIK_PHONE_INPUT);
        phoneInput.sendKeys(phone);
    }

    public void enterKlinikEmail(String email) {
        WebElement emailInput = driver.findElement(KlinikObject.KLINIK_EMAIL_INPUT);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(KlinikObject.PASSWORD_INPUT);
        passwordInput.sendKeys(password);
    }

    public void enterKlinikOpenTime() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement hourOpen = driver.findElement(By.xpath("(//input[@name='hour12'])[1]")); // Replace with appropriate selector
        hourOpen.sendKeys("9");

        WebElement hourOpen2 = driver.findElement(By.xpath("(//input[@name='hour12'])[1]")); // Replace with appropriate selector
        hourOpen2.sendKeys("9");

        WebElement minuteOpen = driver.findElement(By.xpath("//input[@name='minute']")); // Replace with appropriate selector
        minuteOpen.sendKeys("7");

        WebElement timeAMPM = driver.findElement(By.xpath("//select[@name='amPm']")); // Replace with appropriate selector
        timeAMPM.click();
        WebElement amOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='am']")));
        amOption.click();
        WebElement amOption2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='am']")));
        amOption2.click();
        Thread.sleep(2000);

        WebElement inputGroup = driver.findElement(By.xpath("//label[@for='klinikOpen' and @class='mt-8 mb-2']"));
        inputGroup.click();
    }

    public void enterKlinikCloseTime() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement hourClose = driver.findElement(By.xpath("(//input[@name='hour12'])[2]")); // Replace with appropriate selector
        hourClose.sendKeys("5");

        WebElement hourClose2 = driver.findElement(By.xpath("(//input[@name='hour12'])[2]")); // Replace with appropriate selector
        hourClose2.sendKeys("5");
//
        WebElement minuteClose = driver.findElement(By.xpath("(//input[@name='minute'])[2]")); // Replace with appropriate selector
        minuteClose.sendKeys("7");

        WebElement timeAMPM = driver.findElement(By.xpath("(//select[@name='amPm'])[2]")); // Replace with appropriate selector
        timeAMPM.click();
        WebElement amOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//option[@value='pm'])[2]")));
        amOption.click();

        WebElement inputGroup = driver.findElement(By.xpath("//label[@for='klinikOpen' and @class='mt-8 mb-2']"));
        inputGroup.click();


    }

    public void enterDescription(String description) {
        WebElement descriptionInput = driver.findElement(KlinikObject.DESCRIPTION_TEXTAREA);
        descriptionInput.sendKeys(description);
    }

    public void uploadKlinikImage() {
        WebElement imageInput = driver.findElement(KlinikObject.IMAGE_INPUT);
        String filePath = new File("src/main/resources/assets/test_klinikswa.jpeg").getAbsolutePath();
        imageInput.sendKeys(filePath);
    }

    public void clickButton(String buttonName) {
        WebElement button = driver.findElement(KlinikObject.BUTTON_TAMBAHKAN);
        button.click();
    }

    public void confirmKlinik() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(KlinikObject.CONFIRM_BUTTON);
        confirmButton.click();
    }
}
