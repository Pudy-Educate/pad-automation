package org.example.object;

import org.openqa.selenium.By;

public class ArticleObject {
    public static final By ARTICLES_SECTION = By.xpath("//a[@href='/admin/article']");
    public static final By ADD_ARTICLE_BUTTON = By.xpath("//button[text()='Tambah Artikel']");
    public static final By TITLE_INPUT = By.xpath("//input[@name='title']");
    public static final By CATEGORY_DROPDOWN = By.xpath("//select[@class=' border-2 border-grey-accent p-3  rounded-xl duration-500 focus:border-primary-blue outline-none w-full cursor-pointer']");
    public static final By CONTENT_EDITOR = By.cssSelector("div.ql-editor");
    public static final By IMAGE_INPUT = By.xpath("//input[@type='file']");
    public static final By CONFIRM_BUTTON = By.xpath("//button[text()='OK']");

    public final static By SUBMIT_BTN =  By.xpath("/html/body/div[2]/div/div[2]/div/button[1]");


    public static final By DELETE_CONFIRM_BUTTON = By.xpath("//button[text()='Ya']");
    public static final By DELETE_SUCCESS_BUTTON = By.xpath("//button[text()='OK']");

}
