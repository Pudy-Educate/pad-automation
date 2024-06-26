package org.example.pages;

import org.example.object.ArticleObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.File;

import static org.example.pages.Basepage.driver;
import static org.example.object.ArticleObject.*;
public class ArticlePage {
    public void navigateToArticlesSection() throws InterruptedException {
        WebElement articlesSection = driver.findElement(ArticleObject.ARTICLES_SECTION);
        articlesSection.click();
        Thread.sleep(5000);
    }

    public void clickButton() {
        WebElement button = driver.findElement(ArticleObject.ADD_ARTICLE_BUTTON);
        button.click();
    }

    public void enterArticleTitle(String title) {
        WebElement titleInput = driver.findElement(ArticleObject.TITLE_INPUT);
        titleInput.sendKeys(title);
    }

    public void selectCategory(String category) {
        WebElement categoryDropdown = driver.findElement(ArticleObject.CATEGORY_DROPDOWN);
        categoryDropdown.sendKeys(category);
    }

    public void enterArticleContent(String content) {
        String script = "arguments[0].innerHTML = arguments[1];";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement contentEditor = driver.findElement(ArticleObject.CONTENT_EDITOR);
        js.executeScript(script, contentEditor, content);
    }

    public void uploadImage() {
        WebElement imageInput = driver.findElement(ArticleObject.IMAGE_INPUT);
        String filePath = new File("src/main/resources/assets/test_article.jpg").getAbsolutePath();
        imageInput.sendKeys(filePath);
    }

    public void acceptModalConfirmation() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(ArticleObject.CONFIRM_BUTTON);
        confirmButton.click();
    }

    public boolean isArticleVisible(String articleTitle) {
        WebElement articleList = driver.findElement(By.xpath("//tr[contains(td/text(), '" + articleTitle + "')]"));
        return articleList.isDisplayed();
    }

    public void submit() {
        WebElement button = driver.findElement(ArticleObject.SUBMIT_BTN);
        button.click();
    }



    public void clickDeleteButton(String articleTitle) {
        WebElement articlesSection = driver.findElement(By.xpath("//tr[td[text()='" + articleTitle + "']]"));
        WebElement deleteButton = articlesSection.findElement(By.xpath(".//button[text()='Hapus']"));
        deleteButton.click();
    }

    public void confirmDelete() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(DELETE_CONFIRM_BUTTON);
        confirmButton.click();
    }

    public void confirmDeleteSuccess() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(DELETE_SUCCESS_BUTTON);
        confirmButton.click();
    }


}
