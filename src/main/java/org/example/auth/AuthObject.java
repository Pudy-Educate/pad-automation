package org.example.auth;

import org.openqa.selenium.By;

public class AuthObject {
    public final static By email = new By.ById("email");
    public final static By password = new By.ById("password");
    public final static By btnLogin = By.xpath("/html/body/div[1]/div/div/div[2]/button");
    public final static By btnLogout = new By.ById("logoutBtn");

    public final static By swalLogin = new By.ByClassName("swal2-icon-success");
    public final static By swalLogout = new By.ByClassName("swal2-icon-warning");

    public final static By btnConfirmModal = new By.ByClassName("swal2-confirm");
}
