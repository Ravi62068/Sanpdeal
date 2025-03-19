package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private final WebDriver driver;

    private static final By searchField = By.xpath("//input[@placeholder='Search products & brands']");
    private static final By searchTitle = By.xpath("//span[contains(text(),'shoes')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String navigate() {
        driver.get("https://www.snapdeal.com/");
        return driver.getTitle();
    }

    public String search(String item) {
        WebElement searchElement = driver.findElement(searchField);
        searchElement.sendKeys(item);
        searchElement.sendKeys(Keys.ENTER);

        return driver.findElement(searchTitle).getText();
    }
}
