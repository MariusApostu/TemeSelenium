package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public WebDriver driver;

    public By loginLink = By.linkText("Login");
    public By contactLink = By.linkText("CONTACTS");
    public By shopLink = By.linkText("BOOKS");



    public HomePage(WebDriver driver) {
        this.driver =  driver;
    }

    public pages.ShopPage navigateToShop(){
        driver.findElement(shopLink).click();
        return new pages.ShopPage(driver);
    }


    public pages.LoginPage navigateToLogin() {
        driver.findElement(loginLink).click();
        return new pages.LoginPage(driver);
    }

    public pages.ContactPage navigateToContact(){
        driver.findElement(contactLink).click();
        return new pages.ContactPage(driver);
    }



   // WebElement usernameField = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));


}
