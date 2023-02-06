package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {
    private WebDriver driver;
    private By header = By.cssSelector("div.header_secondary_container span.title");

    public Products(WebDriver driver){
        this.driver = driver;
    }

    public String getHeaderText(){
       return driver.findElement(header).getText();
    }
}
