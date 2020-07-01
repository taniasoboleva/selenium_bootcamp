package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.DelfiHomePage;

public class DelfiTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void checkingDelfi(){
        DelfiHomePage delfiHomePage = new DelfiHomePage(driver);

//        delfiHomePage.selectMenuItem("Versijas");
        delfiHomePage.clickArticle(8);
    }

}
