package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day1.ChapterOnePage;
import pageObjects.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
//    @Before
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);
//        WebElement element = driver.findElement(By.linkText("Chapter1"));
        Assert.assertTrue(homePage.chapterone.isDisplayed(), "Chapter Link not displayed");
        homePage.clickChapterOne();

//        Assert.assertTrue(element.isDisplayed(), "Chapter Link not displayed");
//        Assertions.assertTrue(homePage.chapterone.isDisplayed(), "Chapter Link not displayed");
//        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!");

        chapterPage.selectFromSelectTypeDD("Selenium RC");
        Assertions.assertEquals( "Hello World!", chapterPage.getTextOfTextBox(), "Text not the same");

        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        chapterPage.getTextOfWindowLink();
        chapterPage.printAttributeVerifyButton();
        chapterPage.printAttributeVerifyButton();
    }


}

