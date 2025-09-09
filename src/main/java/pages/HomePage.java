package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Verify all categories exist
    public boolean verifyCategories() {
        String[] categories = {"All","Groceries", "Bakery", "Beverages", "Household", "Home Decor", "Lifestyle"};
        for (String category : categories) {
            WebElement element = driver.findElement(By.xpath("//button[text()='" + category + "']"));
            if (element == null || !element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    // Click Groceries
    public void clickGroceries() {
        driver.findElement(By.xpath("//button[text()='Groceries']")).click();
    }

    // Add all products under Groceries
    public void addAllProductsToCart() {
        List<WebElement> addButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to Cart')]"));
        for (WebElement button : addButtons) {
            button.click();
        }
    }

    // Get cart count
    public String getCartCount() {
    // This div contains the number
    WebElement cartBadge = driver.findElement(By.cssSelector("a[href='/cart'] div.rounded-full"));
    return cartBadge.getText().trim();
}

}
