package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
    WebDriver driver;

    public By inputName = By.cssSelector("input[name='your-name']");
    public By inputEmail = By.cssSelector("input[name='your-email']");
    public By inputSubject = By.cssSelector("input[name='your-s']");
    public By inputMessage = By.cssSelector("textarea[name='your-message']");
    public By sendMessageButton = By.cssSelector("input[value='Send Message']");
    public By messageSent = By.cssSelector("div[class='wpcf7-response-output']");


    public ContactPage(WebDriver driver){
        this.driver = driver;

    }

    public void sendMessage(String name, String email, String subject, String message){
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(inputSubject).sendKeys(subject);
        driver.findElement(inputMessage).sendKeys(message);
        driver.findElement(sendMessageButton).click();

    }

    public boolean returnMessageSentInfo(String text) {
       try{
           WebElement message = driver.findElement(messageSent);
           WebDriverWait wait =  new WebDriverWait(driver, 10);
           wait.until(ExpectedConditions.textToBePresentInElement(message,text));
           return true;
       } catch (NoSuchElementException e) {
           return false;
       }
    }


}
