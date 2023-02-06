package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Products;

import static org.testng.Assert.assertTrue;

public class InvalidPassword extends BaseTests {
    @Test
    public void testInvalidPassword(){
        loginPage.setUserName("standard_user");
        loginPage.setPassword("CheckInvalidPassword");
        Products products =loginPage.clickLoginButton();
        assertTrue(loginPage.getErrorMessage().contains("Epic sadface: Username and password do not match any user in this service"),
                "text is incorrect");
    }
}
