package samplesPages;

import samplesPages.core.BaseFuncSample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectSample {
    //Select should be handleded at pageObject classes.

    @FindBy(how = How.ID, using = "id")
    public WebElement ids;

    // creating a new object,  in () can be added:
    // locator
    Select select = new Select(driver.findElement(By.id("ids")));

    //or WebElement itself
    Select select1 = new Select(ids);

    //options of select:
    // select by Index(int i) -  It is used to select an option based on its index, beginning with 0.
    public void selectByIndex(){
        select.selectByIndex(1);
    }

    // selectByValue(String value) - It is used to select an option based on its 'value' attribute.
    public void selectByValue(){
        select.selectByValue("name of value");
    }

    //selectByVisibleText(String text) - It is used to select an option based on the text over the option.
    public void selectByVisibleText(){
        select.selectByVisibleText("string text of option");
    }

    //getOptions() - This gets the all options belonging to the Select tag. It takes no parameter and returns List<WebElements>.
    public void selectGetOptions(){
       List<WebElement> options = select.getOptions();
    }

    //deselectAll() - Clear all selected entries.
    public void deselectAll(){
        select.deselectAll();
    }

    //deselectByIndex(int index) - Deselect the option at the given index.
    public void deselectByIndex(){
        select.deselectByIndex(1);
    }

   // deselectByValue(String value) - Deselect all options that have a value matching the argument.
    public void deselectByValue(){
        select.deselectByValue("value");
    }
    //deselectByVisibleText(String text) - Deselect all options that display text matching the argument.
    public void deselectByVisibleText(){
        select.deselectByVisibleText("text");
    }
}
