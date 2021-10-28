package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.NavigationMenuPage;
import pages.ShopPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TemaCurs5 extends BaseTest {

    NavigationMenuPage navigationMenuPage;
    ShopPage shopPage;


    @Test(priority = 0)
    public void buyTheBook() throws InterruptedException {
        /*WebElement loginMenu = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
        loginMenu.click();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
        usernameField.sendKeys("TestUser");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password' or @name = 'pwd']"));
        passwordField.sendKeys("12345@67890");
        WebElement rememberMeCheckBox = driver.findElement(By.xpath("//input[@id='rememberme']"));
        rememberMeCheckBox.click();
        WebElement buttonLogin = driver.findElement(By.xpath("//input[@class='submit_button']"));
        buttonLogin.click();*/
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,'search_submit')][contains(@title, 'Open')]"));
        searchButton.click();
        WebElement startSearch = driver.findElement(By.xpath("//input[contains(@class, 'search_field')]"));
        startSearch.click();
        startSearch.sendKeys("The story about me");
        searchButton.click();
        WebElement loadMoreButton = driver.findElement(By.cssSelector("a[id='viewmore_link']"));
        loadMoreButton.click();
        Thread.sleep(3000);
        //WebElement theBook = driver.findElement(By.xpath("//a[contains(text(),'The story about me')][1]"));
        //assertEquals(driver.getTitle(), "The story about me");
        //theBook.click();
        WebElement theBook = driver.findElement(By.xpath("//a[contains(text(),'The story about me')]"));
        theBook.click();
        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/the-story-about-me/");
        WebElement addToCart = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
        addToCart.click();
        WebElement addedMessage = driver.findElement(By.xpath("//div[@class='woocommerce-message'][@role='alert']"));
        assertTrue(addedMessage.getText().contains("“The story about me” has been added to your cart."));


    }
}
