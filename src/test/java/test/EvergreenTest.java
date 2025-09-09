
package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class EvergreenTest extends BaseTest {

    @Test
    public void testAddGroceriesToCart() {
        HomePage homePage = new HomePage(driver);

        // Step 1: Verify categories
        Assert.assertTrue(homePage.verifyCategories(), "Categories are missing on homepage");

        // Step 2: Click Groceries
        homePage.clickGroceries();

        // Step 3: Add all products
        homePage.addAllProductsToCart();

        // Step 4: Verify cart count = 2
        String cartCount = homePage.getCartCount();
        Assert.assertEquals(cartCount, "2", "Cart count is incorrect");



        /* // Step 5: Click Cart
        cartPage.openCart();

        // Step 6: Increase Gourmet Olive Oil until free shipping
        cartPage.increaseOliveOilUntilFreeShipping();

        // Step 7: Proceed to checkout
        cartPage.proceedToCheckout();

        // Step 8: Verify Olive Oil quantity
        int oliveOilQty = cartPage.getOliveOilQuantity();
        Assert.assertTrue(oliveOilQty > 1, "Olive Oil quantity not increased correctly");

        // Step 9: Enter details and place order
        checkoutPage.enterName("John Doe");
        checkoutPage.selectCreditCard();
        checkoutPage.enterCardDetails("4111111111111111", "12/28", "123");
        checkoutPage.placeOrder();

        // Step 10: Verify confirmation
        String confirmation = checkoutPage.getConfirmationMessage();
        Assert.assertTrue(confirmation.contains("Thank you"), "Order confirmation failed"); */
    }
}
