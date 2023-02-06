package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Products;

import static org.testng.Assert.assertTrue;

public class InvalidUserName extends BaseTests {


    @Test
    public void testInvalidUserName(){
        loginPage.setUserName("standard");
        loginPage.setPassword("secret_sauce");
        Products products =loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessage().contains("Epic sadface: Username and password do not match any user in this service"),
                "text is incorrect");
    }

}
