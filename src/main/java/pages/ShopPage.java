package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
    WebDriver driver;
    Select select;
    WebElement orderDropDown;



    public By dropdown = By.name("orderby");

  //  public WebElement sortDropdown(){
   //     return this.driver.findElement(By.xpath("//select[@class='orderby']"));
   // }

    public ShopPage(WebDriver driver){
        this.driver = driver;
    }

    public void filterByVisibleText(String visibleText){
        orderDropDown = driver.findElement(dropdown);
        select =  new Select(orderDropDown);
        select.selectByVisibleText(visibleText);
    }

    public void filterByIndex(int index){
        orderDropDown = driver.findElement(dropdown);
        select =  new Select(orderDropDown);
        select.selectByIndex(index);
    }


    public String getTheCurrentSelectionFromDropdown(){
        orderDropDown = driver.findElement(dropdown);
        select =  new Select(orderDropDown);
       return  select.getFirstSelectedOption().getText();
    }





}
