package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) { super(driver); }

    private WebElement setAddToCartButton() {
        return driver.findElement(By.xpath("//div[@class='button-group']//button[@type='button']//i[@class='fa fa-shopping-cart']"));
    }

    public void addToCart(){
        this.setAddToCartButton().click();
    }
}
