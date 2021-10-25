package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NavigationMenuPage;
import utils.BaseTest;

public class TestExample extends BaseTest {
    NavigationMenuPage navPage;
    LoginPage loginPage;

    @Test(priority = 1)
    public void navigate(){
        navPage = new NavigationMenuPage(driver);
        navPage.navigateTo(navPage.shopLink);
        navPage.navigateTo(navPage.contactLink);

    }
    @Test(priority = 2)
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        navPage.navigateTo(navPage.loginLink);
        loginPage.loginInApp();


    }

}
