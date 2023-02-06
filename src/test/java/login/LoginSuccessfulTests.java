package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Products;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginSuccessfulTests extends BaseTests {

    @Test()
    public void testSuccessfulLogin(){
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        Products products =loginPage.clickLoginButton();
        assertTrue(products.getHeaderText().contains("PRODUCTS"),"text is incorrect");
    }
    
}
