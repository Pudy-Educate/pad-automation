package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static org.example.object.Basepage.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddKlinikStep {
    @Given("the user is on home page klinik")
    public void the_user_is_on_home_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/home"));
    }

    @When("the user navigates to the klinik section")
    public void the_user_navigates_to_the_klimik_section() throws InterruptedException{
        WebElement articlesSection = driver.findElement(By.xpath("//a[@href='/admin/klinik']")); // Replace with appropriate selector
        articlesSection.click();
        Thread.sleep(2000);
    }

    @When("clicks on the Tambah Klinik button")
    public void clicks_on_the_tambah_klinik_button() {
        WebElement addArticleButton = driver.findElement(By.xpath("//button[text()='Tambah Klinik']")); // Replace with appropriate selector
        addArticleButton.click();
    }

    @When("enters the klinik name {string}")
    public void enters_the_klinik_name(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='name']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("enters the klinik address {string}")
    public void enters_the_klinik_address(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='alamat']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }
    @When("enters the klinik phone number {string}")
    public void enters_the_klinik_phone(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='phone']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("enters the klinik email {string}")
    public void enters_the_klinik_email(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='email']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("enters the password {string}")
    public void enters_the_password(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//input[@name='password']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("enters the time klinik open")
    public void enters_the_time_klinik_open() throws InterruptedException {

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

    @When("enters the time klinik close")
    public void enters_the_time_klinik_close() {
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

    @When("enters the description {string}")
    public void enters_the_description(String title) {
        WebElement titleInput = driver.findElement(By.xpath("//textarea[@name='description']")); // Replace with appropriate selector
        titleInput.sendKeys(title);
    }

    @When("enters image of klinik")
    public void enters_image_of_klinik() {
        WebElement imageInput = driver.findElement(By.xpath("//input[@type='file']")); // Replace with appropriate selector
        String filePath = new File("src/main/resources/assets/test_klinikswa.jpeg").getAbsolutePath();
        imageInput.sendKeys(filePath);
    }
    @When("click the {string} button")
    public void clicks_the_publish_button(String buttonName) {
        WebElement publishButton = driver.findElement(By.xpath("//button[text()='Tambahkan']")); // Replace with appropriate selector
        publishButton.click();
    }

    @When("click klinik confirmation")
    public void click_klinik_confirmation() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(By.xpath("//button[text()='OK']"));
        confirmButton.click();
    }
}
