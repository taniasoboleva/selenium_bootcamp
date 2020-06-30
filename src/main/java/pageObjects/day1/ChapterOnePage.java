package pageObjects.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {

    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.ID, using = "multiplewindow")
    private WebElement textWindow;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifyButton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement mainHeading;

    public void setTextBox(String textToSend){
        textBox.click();
        textBox.sendKeys(textToSend);
    }
    public void getTextOfWindowLink(){
        String text = textWindow.getText();
        System.out.println(text);
    }
    public void getAttributeOfVerifyButton() {
        String text = verifyButton.getAttribute( "value");
        System.out.println(text);
    }
    public void getCssValueMainheading() {
        String text = mainHeading.getCssValue("color");
        System.out.println(text);
    }
}
