package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;

public class TaskOwnTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

}
