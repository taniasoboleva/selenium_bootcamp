package classTests.day3;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day3.PracticePageAddToCart;

public class PracticeAddToCartTest extends BaseWebTest {
    final Logger LOGGER = LogManager.getLogger(PracticeAddToCartTest.class);
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php?id_product=1&controller=product");
    }

    @Test
    public void addToCardTesting() {
        PracticePageAddToCart practicePage = new PracticePageAddToCart(driver);
        LOGGER.info("clicking Add to cart");
        Assertions.assertEquals(practicePage.clickAddToCard("Add to cart"), "Add to cart");
    }


}
