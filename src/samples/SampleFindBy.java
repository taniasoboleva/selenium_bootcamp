package samplesTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Sample1findBy {
    //WebElements and locators should locate at pageObject classes

        //find element by ID
        WebElement elementId = driver.findElement(By.id("id"));
        //find element by name
        WebElement elementName = driver.findElement(By.name("name"));

        // find element by cssSelector and xPath
        WebElement cssSelector = driver.findElement(By.cssSelector("input[type='name']"));
        WebElement xPath = driver.findElement(By.xpath("//input[@type='name']"));

        //find element by xPath using "contains(@attribute)" and "contains(text())"
        WebElement containsByAttributeText = driver.findElement(By.xpath("//input[contains(@attributeName, 'part of text of attribute')]"));

        WebElement containsByText = driver.findElement(By.xpath("//input[contains(text(), 'text')]"));




}
