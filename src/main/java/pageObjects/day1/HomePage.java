package pageObjects.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseFunc {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Chapter1")
    public WebElement chapterone;

//    @FindBy(how = How.ID, using = "html5div")
//    private WebElement textBox;

    public void clickChapterOne() {
        chapterone.click();
    }

}
