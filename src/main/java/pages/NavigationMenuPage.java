package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationMenuPage {

    public WebDriver driver;

    public NavigationMenuPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "BOOKS") public WebElement shopLink;
    @FindBy(linkText = "CONTACTS") public WebElement contactLink;
    @FindBy(css ="a[class*='popup_login_link']") public WebElement loginLink;

    public void navigateTo(WebElement element){
        element.click();
    }




}
