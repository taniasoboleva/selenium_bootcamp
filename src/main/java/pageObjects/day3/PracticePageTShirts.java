package pageObjects.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PracticePageTShirts extends BaseFunc {
    public PracticePageTShirts(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//a[contains(@title,'T-shirts')]")
    private List<WebElement> subTitleTShirts;


    public String selectMenuItem(String menuName) {

        String itemName = null;
        for (WebElement element : subTitleTShirts) {
            itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
        return itemName;
    }

}