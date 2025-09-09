package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // Enter name
    public void enterName(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    // Select Credit Card
    public void selectCreditCard() {
        driver.findElement(By.id("payment-creditcard")).click();
    }

    // Enter Credit Card details
    public void enterCardDetails(String number, String expiry, String cvv) {
        driver.findElement(By.id("card-number")).sendKeys(number);
        driver.findElement(By.id("card-expiry")).sendKeys(expiry);
        driver.findElement(By.id("card-cvv")).sendKeys(cvv);
    }

    // Place Order
    public void placeOrder() {
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
    }

    // Verify confirmation message
    public String getConfirmationMessage() {
        return driver.findElement(By.id("order-confirmation")).getText();
    }
}
