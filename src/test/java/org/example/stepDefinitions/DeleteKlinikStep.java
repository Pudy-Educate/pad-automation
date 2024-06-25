package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.object.Basepage.driver;

public class DeleteKlinikStep {

    @When("the user is on klinik section")
    public void the_user_is_on_klinik_section() {
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://naturecare-pad.vercel.app/admin/klinik"));
    }

    @When("clicks on the Hapus button on {string}")
    public void clicks_on_the_hapus_button(String klinikName) {
        WebElement articlesSection = driver.findElement(By.xpath("//tr[td[text()='" + klinikName + "']]"));
        WebElement deleteButton = articlesSection.findElement(By.xpath(".//button[text()='Hapus']"));
        deleteButton.click();
    }

    @When("click delete klinik confirmation")
    public void click_delete_klinik_confirmation() throws InterruptedException{
        WebElement confirmButton = driver.findElement(By.xpath("//button[text()='Ya']"));
        confirmButton.click();
    }
    @When("clik OK confirmation")
    public void click_ok_confirmation() throws InterruptedException{
        Thread.sleep(1000);
        WebElement confirmButton = driver.findElement(By.xpath("//button[text()='OK']"));
        confirmButton.click();
    }
}
