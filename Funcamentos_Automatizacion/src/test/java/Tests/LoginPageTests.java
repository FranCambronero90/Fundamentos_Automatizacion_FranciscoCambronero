package Tests;

import DataProviders.UsersDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.LoginPage;
import PageObjects.dashboardPage;
import pojo.loginData;

public class LoginPageTests extends BaseTest {

    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void doLogin(loginData _LoginData) throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.waitUntilElementExists(dashboard.setDashboardAccountContainer());
        // dashboard.implicitWait(30);
        Assert.assertEquals(dashboard.setDashboardAccountContainer().isDisplayed(), true);
    }
}
