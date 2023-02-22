package com.pe.testcases;

import com.pe.qa.base.TestBase;
import com.pe.qa.page.InventoryPage;
import com.pe.qa.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ValidateLogin extends TestBase {
    InventoryPage inventoryPage;
    LoginPage loginPage;

    public ValidateLogin() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        inventoryPage = new InventoryPage();
        loginPage = new LoginPage();

    }

    @Test
    public void validateLogin() {
        LoginPage login = new LoginPage();
        InventoryPage inventory = new InventoryPage();
        login.insertUser("standard_user");
        login.insertPassword("secret_sauce");
        login.enterLogin();

        boolean flagTitleProduc = inventory.validateTitleProduct(prop.getProperty("title"));
        Assert.assertTrue(flagTitleProduc);

        boolean flagPriceProduc = inventory.validatePrice(prop.getProperty("price"));
        Assert.assertTrue(flagPriceProduc);

        inventory.enterAddCart();
        inventory.clicCart();
        inventory.chechout();
        inventory.insertFirstName("Joel");
        inventory.insertLastName("Apellido");
        inventory.insertPostal("511");
        inventory.enterContinue();
        inventory.enterFinalizar();

        boolean flagSuccessfull = inventory.validateTitleSuccessful(prop.getProperty("successfull"));
        Assert.assertTrue(flagSuccessfull);


    }

    @AfterMethod
    public void close() {
        // driver.quit();
    }


}
