package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.DelfiHomePage;
import pageObjects.day2.OneATvPage;

public class OnATvTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
    }

    @Test
    public void checkingOneATv() {
        OneATvPage onATvHomePage = new OneATvPage(driver);
        onATvHomePage.printProductDetails(39);
    }
}
