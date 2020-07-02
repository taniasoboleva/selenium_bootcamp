package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.DelfiHomePage;
import pageObjects.day3.DelfiArticlePage;

public class DelfiArticleTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.delfi.lv/");
    }

    @Test
    public void articleTesting() {
    DelfiHomePage homePage = new DelfiHomePage(driver);

    //copy of our object model - article.java
        // that in test class created Object model is actually one from Pag class (DelfiHomePage.class
        Article articleHome = homePage.getArticleTitleAndComment(1);


        DelfiArticlePage delfiArticlePage = new DelfiArticlePage(driver);

        Article articleArticle = delfiArticlePage.getArticleAtAtributes();

        Assertions.assertEquals(articleHome.getTitle(), articleArticle.getTitle(), "Articles not the same");
        Assertions.assertEquals(articleHome.getCommentNumber(), articleArticle.getCommentNumber(),"Amount of comments not the same");

    }
}
