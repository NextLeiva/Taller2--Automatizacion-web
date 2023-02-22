package com.pe.qa.page;

import com.pe.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends TestBase {

    @FindBy(xpath = "//span[@class='title']")
    public WebElement titleProduct;

    @FindBy(xpath = "//div[text()='29.99']")
    public WebElement priceProduct;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCart;

    @FindBy(id = "checkout")
    public WebElement checkout;

    @FindBy(name = "firstName")
    public WebElement firstName;
    @FindBy(id = "last-name")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement postal;

    @FindBy(name = "continue")
    public WebElement continuar;

    @FindBy(id = "finish")
    public WebElement finish;

    @FindBy(xpath = "//h2")
    public WebElement titleSuccessful;


    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean validateTitleProduct(String tituloProducto) {
        return titleProduct.getText().contains(tituloProducto);
    }

    public boolean validatePrice(String precioProducto) {
        return  priceProduct.getText().contains(precioProducto);
    }

    public void enterAddCart(){
        addCart.click();
    }

    public void clicCart(){
        shoppingCart.click();
    }

    public void chechout(){
        checkout.click();
    }

    public void insertFirstName(String nombre){
        firstName.sendKeys(nombre);
    }
    public void insertLastName(String apellido){
        lastName.sendKeys(apellido);
    }
    public void insertPostal(String codigoPostal){
        postal.sendKeys(codigoPostal);
    }

    public void enterContinue(){
        continuar.click();
    }
    public void enterFinalizar(){
        finish.click();
    }

    public boolean validateTitleSuccessful(String tituloExitoso){
        return titleSuccessful.getText().contains(tituloExitoso);
    }



}
