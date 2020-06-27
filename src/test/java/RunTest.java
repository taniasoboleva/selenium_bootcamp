import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {

    WebDriver driver;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void driverTest(){
        driver.get("https://www.google.com/");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
