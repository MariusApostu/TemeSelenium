package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TemaCurs2 extends BaseTest {

    @Test
    public void elementsDisplayed() {
        assertTrue(driver.findElement(By.className("menu_user_login")).isDisplayed());
        WebElement login = driver.findElement(By.className("menu_user_login"));
        WebElement user = driver.findElement(By.name("log"));
        WebElement pass = driver.findElement(By.name("pwd"));
        assertFalse(user.isDisplayed());
        assertFalse(pass.isDisplayed());
        login.click();
        assertTrue(user.isDisplayed());
        assertTrue(pass.isDisplayed());
    }
}
