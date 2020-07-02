package classTests.day3;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day3.PracticePagePicture;
import pageObjects.day3.PracticePageWomen;

public class PracticePictureTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(PracticePictureTest.class);
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php?id_category=5&controller=category");
    }


    @Test
    public void checkingItemPractice() {
        PracticePagePicture practicePage = new PracticePagePicture(driver);
        LOGGER.info("clicking picture");
        Assertions.assertEquals(practicePage.selectPictureItem("Faded Short Sleeve T-shirts"), "Faded Short Sleeve T-shirts");
    }

}
