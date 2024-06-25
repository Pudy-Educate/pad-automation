package org.example.object;

import org.openqa.selenium.By;

public class CategoriesObject {
    public static final By categoriesPages = By.xpath("//a[@href='/admin/category']");
    public static final By addCategories = By.xpath("//button[text()='Tambah Artikel']");
    public static final By inputCategories = By.xpath("//input[@name='kategori']");
    public static final By storeCategories = By.xpath("//button[text()='Tambahkan']");
    public static final By closeModal = By.xpath("//button[text()='OK']");
    public static final By deleteBtn = By.xpath("//button[text()='Hapus']");
    public static final By confirmDelete = By.xpath("//button[text()='Ya']");
}
