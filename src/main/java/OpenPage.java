import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

class OpenPage {

    private WebDriver driver;

    OpenPage(WebDriver driver) { this.driver = driver; }

    void checkLink(String str) {
        WebElement link =  driver.findElement(By.linkText(str));
        Assert.assertEquals("Error", str, link.getText());
        link.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    void moveTo(String str) {
        WebElement link =  driver.findElement(By.linkText(str));
        new Actions(driver).moveToElement(driver.findElement(By.linkText(str))).perform();
        Assert.assertEquals("Error", str, link.getText());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

}
