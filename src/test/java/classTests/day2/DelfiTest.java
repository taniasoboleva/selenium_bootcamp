package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.AlertPage;
import pageObjects.day2.DelfiHomePage;

public class DelfiTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(DelfiHomePage.class);
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void checkingDelfi(){
        LOGGER.info("Initializing Alert Page");
        DelfiHomePage delfiHomePage = new DelfiHomePage(driver);

//        delfiHomePage.selectMenuItem("Versijas");
        LOGGER.info("clicking article");
        delfiHomePage.clickArticle(8);
    }

}
