package classTests.day3;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day3.PracticePageTShirts;
import pageObjects.day3.PracticePageWomen;

public class PracticeTShirtsTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(PracticeTShirtsTest.class);
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }


    @Test
    public void checkingPractice() {

        PracticePageTShirts practicePage = new PracticePageTShirts(driver);
        LOGGER.info("clicking T-SHIRTS");
        Assertions.assertEquals(practicePage.selectMenuItem("T-SHIRTS"), "T-SHIRTS");
    }

}
