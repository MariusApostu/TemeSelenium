package utils;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import java.io.File;

public class BaseTest extends Driver {

    public String url = ReadProperties.config.getProperty("url");
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = initDriver();
        driver.get(url);
            }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @AfterMethod
    public void pictureOnFailure(ITestResult result) {
        if(ITestResult.FAILURE == result.getStatus()){
            try{
                TakesScreenshot poza  = (TakesScreenshot)driver;
                File picture = poza.getScreenshotAs(OutputType.FILE);
                Files.copy(picture, new File( "screenshots/"+ result.getName() +".png"));
            }catch (Exception e) {
                System.out.println("Cannot take picture");
                e.printStackTrace();
            }


        }



    }

}
