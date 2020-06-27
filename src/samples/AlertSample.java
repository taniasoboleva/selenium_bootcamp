package samplesTest;

import baseWebTest.BaseWebTest;
import org.openqa.selenium.Alert;

public class AlertSample extends BaseWebTest {
        //Alerts should be located at "BaseFunc.java"


        //declare alert
        Alert alert = driver.switchTo().alert();

        //accept allert, will click button which confirms - OK, Confirm and etc.
        alert.accept();

        //dismiss Alert - will click button which cancel alert
        alert.dismiss();

        //getText from alert - will get text which displayed in Alert
        alert.getText();

        //sendKeys()- will send text to promt alert
        alert.sendKeys("text");

}
