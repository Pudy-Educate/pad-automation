package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.KlinikPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static org.example.pages.Basepage.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddKlinikStep {
    KlinikPage klinikPage = new KlinikPage();

    @Given("the user is on home page klinik")
    public void the_user_is_on_home_page() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/home"));
    }

    @When("the user navigates to the klinik section")
    public void the_user_navigates_to_the_klinik_section() {
        klinikPage.navigateToKlinikSection();
    }

    @When("clicks on the Tambah Klinik button")
    public void clicks_on_the_tambah_klinik_button() throws InterruptedException {
        klinikPage.clickTambahKlinikButton();
    }

    @When("enters the klinik name {string}")
    public void enters_the_klinik_name(String name) {
        klinikPage.enterKlinikName(name);
    }

    @When("enters the klinik address {string}")
    public void enters_the_klinik_address(String address) {
        klinikPage.enterKlinikAddress(address);
    }

    @When("enters the klinik phone number {string}")
    public void enters_the_klinik_phone(String phone) {
        klinikPage.enterKlinikPhone(phone);
    }

    @When("enters the klinik email {string}")
    public void enters_the_klinik_email(String email) {
        klinikPage.enterKlinikEmail(email);
    }

    @When("enters the password {string}")
    public void enters_the_password(String password) {
        klinikPage.enterPassword(password);
    }

    @When("enters the time klinik open")
    public void enters_the_time_klinik_open() throws InterruptedException {
        klinikPage.enterKlinikOpenTime();
    }

    @When("enters the time klinik close")
    public void enters_the_time_klinik_close() {
        klinikPage.enterKlinikCloseTime();
    }

    @When("enters the description {string}")
    public void enters_the_description(String description) {
        klinikPage.enterDescription(description);
    }

    @When("enters image of klinik")
    public void enters_image_of_klinik() {
        klinikPage.uploadKlinikImage();
    }

    @When("click the {string} button")
    public void clicks_the_publish_button(String buttonName) {
        klinikPage.clickButton(buttonName);
    }

    @When("click klinik confirmation")
    public void click_klinik_confirmation() throws InterruptedException {
        klinikPage.confirmKlinik();
    }
}
