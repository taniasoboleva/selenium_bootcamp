package pageObjects.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PracticePagePicture extends BaseFunc {
    public PracticePagePicture(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//a[contains(@title,'Faded Short Sleeve T-shirts')]")
    private List<WebElement> clickToPictures;


    public String selectPictureItem(String menuName) {
        String itemName = null;
        for (WebElement element : clickToPictures) {
            itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
        return itemName;
    }

}