package com.pe.qa.page;

import com.pe.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement user;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement buttonLogin;

    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    public void insertUser(String usuario) {
        user.sendKeys(usuario);
    }

    public void insertPassword(String contrasena) {
        password.sendKeys(contrasena);
    }

    public void enterLogin() {
        buttonLogin.click();
    }




}
