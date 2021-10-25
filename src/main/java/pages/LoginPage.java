package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ReadProperties;

public class LoginPage {

    public WebDriver driver;
    public String username = ReadProperties.config.getProperty("user");
    public String password = ReadProperties.config.getProperty("pass");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="log") public WebElement usernameField;
    @FindBy(id = "password") public WebElement passwordField;
    @FindBy(css = "input[class='submit_button']") public WebElement submitButton;

    public void loginInApp(){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }




}
