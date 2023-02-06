package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");

    private By loginButton = By.id("login-button");

    private By errorMessage = By.tagName("h3");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String userName){
       driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public Products clickLoginButton(){
        driver.findElement(loginButton).click();
        return new Products(driver);
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
