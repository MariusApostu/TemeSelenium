package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TemaCurs3 extends BaseTest {
    @Test
    public void findBook() {
        List<WebElement> categories = driver.findElements(By.cssSelector("li[class^='sc_tabs_title']"));
        for (int i = categories.size(); i <= 3; i++) {
            categories.get(i).click();
            WebElement theForest = driver.findElement(By.linkText("The forest"));
            assertTrue(theForest.isDisplayed());
            System.out.println(theForest.getText());
            theForest.click();
            assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");

        }
    }
}
