package org.example.object;

import org.openqa.selenium.By;

public class KlinikObject {
    public static final By KLINIK_SECTION = By.xpath("//a[@href='/admin/klinik']");
    public static final By TAMBAH_KLINIK_BUTTON = By.xpath("//button[text()='Tambah Klinik']");
    public static final By KLINIK_NAME_INPUT = By.xpath("//input[@name='name']");
    public static final By KLINIK_ADDRESS_INPUT = By.xpath("//input[@name='alamat']");
    public static final By KLINIK_PHONE_INPUT = By.xpath("//input[@name='phone']");
    public static final By KLINIK_EMAIL_INPUT = By.xpath("//input[@name='email']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@name='password']");
    public static final By HOUR_OPEN_INPUT = By.xpath("(//input[@name='hour12'])[1]");
    public static final By MINUTE_OPEN_INPUT = By.xpath("//input[@name='minute']");
    public static final By TIME_AMPM_SELECT = By.xpath("//select[@name='amPm']");
    public static final By INPUT_GROUP_LABEL = By.xpath("//label[@for='klinikOpen' and @class='mt-8 mb-2']");
    public static final By HOUR_CLOSE_INPUT = By.xpath("(//input[@name='hour12'])[2]");
    public static final By MINUTE_CLOSE_INPUT = By.xpath("(//input[@name='minute'])[2]");
    public static final By DESCRIPTION_TEXTAREA = By.xpath("//textarea[@name='description']");
    public static final By IMAGE_INPUT = By.xpath("//input[@type='file']");
    public static final By BUTTON_TAMBAHKAN = By.xpath("//button[text()='Tambahkan']");
    public static final By CONFIRM_BUTTON = By.xpath("//button[text()='OK']");
}
