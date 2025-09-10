
package test;

import org.testng.annotations.Test;
import pages.HomePage;
import java.util.List;

public class EvergreenTest extends BaseTest {

    @Test
    public void testAddGroceriesToCart() {
        HomePage homePage = new HomePage(driver);

        List<String> categories = homePage.getAllCategories();
        // Step 1. Verify categories "Groceries" exist

        homePage.clickCategory("Groceries");

        // Step 2: Add all products to cart
        homePage.addAllProductsToCart();

        // Step 3: Click Cart
        homePage.clickCart();

        // Step 4: Increase Gourmet Olive Oil until free shipping
        // cartPage.increaseProductQuanityUnitlFreeShipping("Gourmet Olive Oil");

        // Step 5: Proceed to checkout
        // cartPage.proceedToCheckout();

        // Step 6: Enter details by selecting credit card and place order

        // Step 7: Verify confirmation message from right bottom corner
    }
}
