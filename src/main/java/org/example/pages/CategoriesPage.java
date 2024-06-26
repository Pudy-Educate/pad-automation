package org.example.pages;

import org.example.object.CategoriesObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesPage {
    WebDriver driver = Basepage.driver;
    public void navigateCategoriesPage() {
        driver.findElement(CategoriesObject.categoriesPages).click();
    }

    public void clickAddCategories(){
        driver.findElement(CategoriesObject.addCategories).click();
    }

    public void inputCategories(String kategori){
        driver.findElement(CategoriesObject.inputCategories).sendKeys(kategori);
        driver.findElement(CategoriesObject.storeCategories).click();
    }

    public void closeModal(){
        driver.findElement(CategoriesObject.closeModal).click();
    }

    public void clickDeleteBtn(String kategori){
        WebElement row = driver.findElement(By.xpath("//tr[td[text()='" + kategori + "']]"));
        row.findElement(CategoriesObject.deleteBtn).click();
    }

    public void modalDelete(){
        driver.findElement(CategoriesObject.confirmDelete).click();
    }
}
