package pageObjects.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PracticePageAddToCart extends BaseFunc {
    public PracticePageAddToCart(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//p[contains(@class, 'buttons_bottom_block no-print')]")
//    @FindBy(how = How.XPATH, using = "//p[contains(@class, 'buttons_bottom_block no-print') and contains(@id, 'add_to_cart')]")
    private List<WebElement> addToCards;


    public String clickAddToCard(String menuName) {
        String elementCheck = null;
        for (WebElement element : addToCards) {
            elementCheck = element.getText();
            if (menuName.equals(elementCheck)) {
                element.click();
                break;
            }
        }
        return elementCheck;
    }
}