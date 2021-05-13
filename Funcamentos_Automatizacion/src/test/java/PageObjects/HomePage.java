package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver _driver) { super(_driver); }

    private WebElement setSearchTextField() {
        return driver.findElement(By.name("search"));
    }

    public void SearchProduct(String productName) {
        this.setSearchTextField().sendKeys(productName);
        this.setSearchTextField().sendKeys(Keys.ENTER);
    }


}
