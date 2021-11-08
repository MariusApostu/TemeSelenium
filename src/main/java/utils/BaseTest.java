package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends Driver {

    public String url = ReadProperties.config.getProperty("url");
    public static WebDriver driver;
    public BasePage page;

    @BeforeClass
    public void setUp(){
        driver = initDriver();
        driver.get(url);

        page = new BasePage();

     //  PageFactory.initElements(driver, LoginPage.class);

     //   LoginPage loginPage = new LoginPage(driver);
     //   PageFactory.initElements(driver, loginPage);

    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }


}
