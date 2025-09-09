package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Click Cart icon
    public void openCart() {
        driver.findElement(By.cssSelector("a[href='/cart']")).click();
    }

    // Increase Gourmet Olive Oil quantity until free shipping
    public void increaseOliveOilUntilFreeShipping() {
        WebElement increaseBtn = driver.findElement(By.xpath("//div[text()='Gourmet Olive Oil']/following::button[contains(text(),'+')]"));
        WebElement shipping = driver.findElement(By.id("shipping-charge")); // adjust selector based on DOM

        while (!shipping.getText().equalsIgnoreCase("Free")) {
            increaseBtn.click();
        }
    }

    // Proceed to checkout
    public void proceedToCheckout() {
        driver.findElement(By.xpath("//button[text()='Proceed to Checkout']")).click();
    }

    // Get total Gourmet Olive Oil quantity
    public int getOliveOilQuantity() {
        String qty = driver.findElement(By.xpath("//div[text()='Gourmet Olive Oil']/following::span[@class='quantity']")).getText();
        return Integer.parseInt(qty);
    }
}
