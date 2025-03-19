

package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage {
    private final WebDriver driver;


    //private ArrayList<WebElement> productElements;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {

        WebElement el=driver.findElement(By.xpath("(//a[@class=\"dp-widget-link hashAdded\"])[1]"));

       // String productsWindow = driver.getWindowHandle();

        el.click();

      //  String currentWindow = productsWindow;
//        driver.switchTo().window(productsWindow);
          //Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement addToCartButton = (WebElement) js.executeScript(
                "return document.querySelector('div#add-cart-button-id');"
        );
        js.executeScript("arguments[0].click();", addToCartButton);



        //div[@class='row marL0']

        // driver.switchTo().window(currentWindow);

     //   System.out.println(driver.findElement(By.xpath("//h1")).getText());
     //   driver.close();

      //  driver.switchTo().window(productsWindow);
    }
}
