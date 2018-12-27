import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

public class YandexTest {

    private WebDriver driver;

    @Before
    public void start() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void exit() {
        driver.quit();
    }

    @Test
    public void yandex() {
        OpenPage openPage = new OpenPage(driver);
        driver.get("https://yandex.ru/");
        openPage.checkLink("Маркет");
        openPage.moveTo("Компьютерная техника");
        openPage.checkLink("Компьютеры");
        openPage.checkLink("Ноутбуки");

    }
}
