package pageObjects.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TaskOwn extends BaseFunc {
    public TaskOwn(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Components')]")
    private WebElement components;

    public void clickComponents() {
        components.click();
    }

}
