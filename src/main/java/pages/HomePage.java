package pages;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public List<String> getAllCategories() {
		throw new NotImplementedException("Unimplemented method 'getAllCategories'");
	}

	public void clickCategory(String category) {
		throw new NotImplementedException("Unimplemented method 'clickCategory'");
	}

	public void addAllProductsToCart() {
		throw new NotImplementedException("Unimplemented method 'addAllProductsToCart'");
	}

	public void clickCart(boolean clearCart) {
        throw new NotImplementedException("Unimplemented method 'clickCart'");
    }

}
