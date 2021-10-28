package utils;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestException;

public class SeleniumWrappers extends BaseTest{

    public void hoverElement(WebElement element){
        try{
            waitForElementToBeDisplayed(element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
        }catch(Exception e){
            throw new TestException("the element was not present");
        }
    }
    public void dragAndDropSlider(WebElement element, int xOffset, int yOffset){
        try{
            waitForElementToBeDisplayed(element);
            Actions actions = new Actions(driver);
            actions.dragAndDropBy(element,xOffset,yOffset).perform();
        }catch(Exception e){
            throw new TestException("The element was not present");
        }
    }
    public void doubleClick(WebElement element){
        try{
            waitForElementToBeDisplayed(element);
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
        }catch(Exception e){
            throw new TestException("The element was not present");
        }
    }

    public void waitForElementToBeDisplayed(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            throw new TestException("The element was not present!");
        }
    }
    public void waitForElementToBeClickable(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (Exception e){
            throw new TestException("The element was not present!");
        }
    }

    /**
     * Method used to send key values (String) to an input or text area field
     * First clears the element of any text
     * @param element:WebElement that receives the text input
     * @param value: The String value to be sent
     */
    public void sendKeys(WebElement element, String value){
        try{
            waitForElementToBeDisplayed(element);
            element.clear();
            element.sendKeys(value);
        }catch (Exception e){
            throw new TestException("The element was not present!");
        }
    }
    /**
     * Method used to click an element. Makes use of method waitForElementToBeClickable(element);
     * @param element: element to be clicked on (type WebElement)
     */
    public void click(WebElement element){
        waitForElementToBeClickable(element);
        try {
            element.click();
        }catch(StaleElementReferenceException e){
            element.click();
        }catch (Exception e){
            throw new TestException("The element was not clickable!");
        }

    }


}
