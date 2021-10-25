package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class TemaCurs4 extends BaseTest {

     @Test
    public void review() {
        WebElement cartea = driver.findElement(By.cssSelector("a[href$='son']"));
        cartea.click();
        WebElement review = driver.findElement(By.cssSelector("a[href='#tab-reviews']"));
        review.click();
        WebElement result = driver.findElement(By.className("wp-social-login-connect-with"));
        assertEquals(result.getText(), "Connect with:");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        driver.switchTo().alert().accept();
        WebElement checkBox = driver.findElement(By.id("wp-comment-cookies-consent"));
        assertFalse(checkBox.isSelected());
        WebElement starRating = driver.findElement(By.cssSelector("a[class*='star-4']"));
        starRating.click();
        WebElement reviewComment = driver.findElement(By.cssSelector(".comment-form-comment>textarea"));
        reviewComment.sendKeys("The Son is a sequel for Good boy.");
        WebElement name = driver.findElement(By.cssSelector(".comment-form-author>input"));
        name.sendKeys("Marius");
        WebElement eMail = driver.findElement(By.cssSelector(".comment-form-email>input"));
        eMail.sendKeys("email@email.com");
        checkBox.click();
        assertTrue(checkBox.isSelected());
        submit.click();
        WebElement approval = driver.findElement(By.cssSelector("em[class*=woocommerce-review__awaiting-approval"));
        assertEquals(approval.getText(), "Your review is awaiting approval");
    }
}
