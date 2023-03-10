package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

public class BaseTests {

    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }



 

}
