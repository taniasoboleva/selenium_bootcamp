package samplesPages.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// This is Parent PageObject class should contains common methods which will be used for many PageObjects to prevent code duplication.
public class BaseFuncSample {
    // declare web driver
    private WebDriver driver;

    //constructor
    public BaseFuncSample() {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        if (!url.startsWith("http://") && !url.startsWith("htpps://")) {
            url = "https://" + url;
        }
        driver.get(url);
    }

    // method which finds WebElement and returning it, that we could interact with it
    public WebElement getElement(By locator){

        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator){

        return driver.findElements(locator);
    }

}
