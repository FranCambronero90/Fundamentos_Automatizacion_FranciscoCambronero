package Tests;

import DataProviders.UsersDataProvider;
import PageObjects.CurrencyPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.dashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.loginData;

public class CurrencyCheckTests extends BaseTest{

    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void checkEuroCurrency(loginData _LoginData) throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        CurrencyPage checkCurrency = new CurrencyPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        checkCurrency.goToHomePage();
        checkCurrency.selectProduct();
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("Euros");
        Assert.assertEquals(dashboard.setDashboardCurrency().getText().contains("€"),true);
    }
    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void checkDollarCurrency(loginData _LoginData) throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        CurrencyPage checkCurrency = new CurrencyPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        checkCurrency.goToHomePage();
        checkCurrency.selectProduct();
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("Dollar");
        Assert.assertEquals(dashboard.setDashboardCurrency().getText().contains("$"),true);
    }
    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void checkLibrasCurrency(loginData _LoginData) throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        CurrencyPage checkCurrency = new CurrencyPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        checkCurrency.goToHomePage();
        checkCurrency.selectProduct();
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("Libras");
        Assert.assertEquals(dashboard.setDashboardCurrency().getText().contains("£"),true);
    }

}
