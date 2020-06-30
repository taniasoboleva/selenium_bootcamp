package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.day1.ChapterOnePage;
import pageObjects.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @Before
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World");

        chapterPage.getTextOfWindowLink();
        chapterPage.getAttributeOfVerifyButton();
        chapterPage.getCssValueMainheading();
    }


}

