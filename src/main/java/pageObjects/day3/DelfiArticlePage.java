package pageObjects.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePage extends BaseFunc {
    public WebElement articleTesting;

    public DelfiArticlePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title')]")
    private WebElement titleAndComment;


    public Article getArticleAtAtributes() {
        waitElementAppeared(titleAndComment);

        Article commentsCount = new Article();

        commentsCount.setTitle(titleAndComment.findElement(By.xpath(".//h1")).getText());
        List <WebElement> commentsArticle = titleAndComment.findElements(By.xpath(".//a[contains(@class,'text-red-ribbon d-print-none')]")) ;


        if (commentsArticle.isEmpty()) {
            commentsCount.setCommentNumber(0);
        } else {
           commentsCount.setCommentNumber(commentsArticle.get(0).getText());
        }

        return commentsCount;
    }

}


