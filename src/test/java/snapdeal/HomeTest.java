package snapdeal;


import org.testng.Assert;
import org.testng.annotations.Test;

import static snapdeal.Base.driver;

public class HomeTest extends Base {
    private HomePage homePage;

    @Test(priority = 1)
    public void testHomePage() {
        homePage = new HomePage(driver);
        String title = homePage.navigate();
        Assert.assertTrue(title.contains("Shop"));
    }

    @Test(priority = 2)
    public void testSearch() {
        String searchTitle = homePage.search("shoes");
        Assert.assertEquals(searchTitle, "We've got 10000+ results for shoes");
    }
}