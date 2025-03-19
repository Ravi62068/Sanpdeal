package snapdeal;



import snapdeal.ProductPage;
import org.testng.annotations.Test;

import static snapdeal.Base.driver;

public class ProductTest extends Base {
    @Test
    public void testProduct() {
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }
}