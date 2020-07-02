package pageObjects.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticePageWomen extends BaseFunc {
    public PracticePageWomen(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'sf-with-ul') and contains(text(), 'Women')]")
    private WebElement titleWomen;


    public String clickTitleWomen() {
        String elementRes = titleWomen.getText();
        titleWomen.click();
        return elementRes;
    }
}