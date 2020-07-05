package classTests.day2;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.day2.TutorialHomePage;

import java.awt.*;

public class TutorialTest extends BaseWebTest {
//    final Logger LOGGER = LogManager.getLogger(DelfiHomePage.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void checkingTutorialsNinja() {
        TutorialHomePage tutorialHomePage = new TutorialHomePage(driver);
        Assertions.assertEquals(tutorialHomePage.selectComponents("Components"), "Components");

    }

    @Test
    public void pressMonitors() {
        TutorialHomePage tutorialHomePage = new TutorialHomePage(driver);
        tutorialHomePage.selectComponents("Components");
        tutorialHomePage.clickMonitors(0);
    }

    @Test
    public void pressOnAppleCinema() {
        TutorialHomePage tutorialHomePage = new TutorialHomePage(driver);
        pressMonitors();
        tutorialHomePage.clickAppleCinema(0);
    }

    @Test
    public void selectElementsForAppleCinema() throws AWTException, InterruptedException {


        TutorialHomePage tutorialHomePage = new TutorialHomePage(driver);
        pressOnAppleCinema();
        tutorialHomePage.clickingElements(0, "Learning to code", 2, 0, 0, 121314);
    }
}

