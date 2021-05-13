package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage extends BasePage{


    //public WebElement dashboardContainer;

    public dashboardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement setDashboardAccountContainer() {
        return driver.findElement(By.id("account-account"));
    }

    public WebElement setDashboardItemAdded(){
        return driver.findElement(By.id("cart-total"));
    }

    public WebElement setDashboardCurrency(){
        return driver.findElement(By.xpath("//ul//li//h2"));
    }

    public WebElement setDashboardRegisterSuccess() { return driver.findElement(By.id("common-success")); }

}