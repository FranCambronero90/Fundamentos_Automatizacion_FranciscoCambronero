package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrencyPage extends BasePage {

    public CurrencyPage(WebDriver _driver) { super(_driver); }

    private WebElement getHomePage(){
        return driver.findElement(By.xpath("//div[@id='logo']//h1//a"));
    }

    private WebElement getProduct(){
        return driver.findElement(By.xpath("//img[@title='MacBook']"));
    }

    private WebElement getCurrencyDropdown(){
        return driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
    }

    private WebElement getEuroCurrency(){
        return driver.findElement(By.name("EUR"));
    }
    private WebElement getPoundCurrency(){
        return driver.findElement(By.name("GBP"));
    }
    private WebElement getDollarCurrency(){
        return driver.findElement(By.name("USD"));
    }

    public void goToHomePage() {
        this.getHomePage().click();
    }
    public void selectProduct() {
        this.getProduct().click();
    }

    public void expandCurrencyDropdown(){
        this.getCurrencyDropdown().click();
    }

    public void selectCurrency(String currency){
        switch (currency){
            case "Dollar":
                this.getDollarCurrency().click();
                break;
            case "Euros":
                this.getEuroCurrency().click();
                break;
            case "Libras":
                this.getPoundCurrency().click();
                break;
            default:
                break;
        }
    }


}
