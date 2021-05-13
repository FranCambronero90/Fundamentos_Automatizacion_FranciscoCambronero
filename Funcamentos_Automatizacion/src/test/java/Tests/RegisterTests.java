package Tests;

import DataProviders.RegisterDataProvider;
import PageObjects.RegisterPage;
import PageObjects.dashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.registerData;

public class RegisterTests extends BaseTest {

    @Test(groups = {"regression", "sanity"}, dataProvider = "getRegisterDataFromJson", dataProviderClass = RegisterDataProvider.class)
    public void doRegisterTest(registerData _registerData) throws InterruptedException {
        RegisterPage register = new RegisterPage(driver);
        register.expandRegisterDropdown();
        register.selectRegisterButton();
        register.doRegister(_registerData.getFirstName(), _registerData.getLastName(), _registerData.getEmailRegister(), _registerData.getTelephone(), _registerData.getPassword(), _registerData.getConfirmPassword());
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.waitUntilElementExists(dashboard.setDashboardRegisterSuccess());
        Assert.assertEquals(dashboard.setDashboardRegisterSuccess().isDisplayed(), true);

    }
}
