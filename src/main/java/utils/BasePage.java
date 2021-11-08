package utils;

import pages.ContactPage;
import pages.LoginPage;
import pages.NavigationMenuPage;

public class BasePage extends BaseTest{

    public NavigationMenuPage navPage = new NavigationMenuPage(driver);
    public ContactPage contactPage = new ContactPage(driver);
    public LoginPage loginPage = new LoginPage(driver);

}
