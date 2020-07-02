package classTests.day3;

import baseWebTest.BaseWebTest;
import classTests.day2.AlertTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day3.PracticePageWomen;

public class PracticeWomenTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(PracticeWomenTest.class);
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void articleTesting() {
        PracticePageWomen practicePage = new PracticePageWomen(driver);
        LOGGER.info("clicking title women");
        Assertions.assertEquals(practicePage.clickTitleWomen(), "WOMEN");
    }

}
