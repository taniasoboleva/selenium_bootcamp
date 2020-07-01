package pageObjects.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadPage extends BaseFunc {
    public UploadPage(WebDriver driver) {
        super(driver);
    }

//    String path =System.getProperty("user.dir")+ "\\src\\resources\\test_document_uploading.docx";
    String path =System.getProperty("user.dir")+ "\\src\\resources\\Test document uploading.docx";
    @FindBy(how = How.CSS, using = "[type='file']")
    private WebElement fileInput;

    public void sendFile(){
        fileInput.sendKeys(path);
    }
}
