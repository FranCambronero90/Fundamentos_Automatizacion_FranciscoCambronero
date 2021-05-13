package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver _driver) { super(_driver); }

    private WebElement getRegisterDropdown() {
        return driver.findElement(By.xpath("//li[@class='dropdown']//a[@title='My Account']"));
    }

    private WebElement getRegisterButton() {
        return driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Register')]"));
    }

    private WebElement setFirstNameText() {
        return driver.findElement(By.name("firstname"));
    }
    private WebElement setLastNameText() {
        return driver.findElement(By.name("lastname"));
    }
    private WebElement setEmailText() {
        return driver.findElement(By.xpath("//div[@class='col-sm-10']//input[@name='email']"));
    }
    private WebElement setTelephoneText() {
        return driver.findElement(By.name("telephone"));
    }
    private WebElement setPasswordText() {
        return driver.findElement(By.xpath("//div[@class='col-sm-10']//input[@name='password']"));
    }
    private WebElement setConfirmPasswordText() {
        return driver.findElement(By.xpath("//div[@class='col-sm-10']//input[@name='confirm']"));
    }

    private WebElement getAgreeCheckbox() {
        return driver.findElement(By.xpath("//div[@class='pull-right']//input[@name='agree']"));
    }

    private WebElement getContinueButton(){
        return driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Continue']"));
    }

    public void expandRegisterDropdown(){
        this.getRegisterDropdown().click();
    }
    public void selectRegisterButton(){
        this.getRegisterButton().click();
    }
    public void doRegister(String firstName, String lastName, String email, String telephone, String password, String confirmPassword){
        this.setFirstNameText().sendKeys(firstName);
        this.setLastNameText().sendKeys(lastName);
        this.setEmailText().sendKeys(email);
        this.setTelephoneText().sendKeys(telephone);
        this.setPasswordText().sendKeys(password);
        this.setConfirmPasswordText().sendKeys(confirmPassword);
        this.getAgreeCheckbox().click();
        this.getContinueButton().click();
    }

}
