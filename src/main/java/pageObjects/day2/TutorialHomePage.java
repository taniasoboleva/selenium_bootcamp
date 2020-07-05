package pageObjects.day2;

import core.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

public class TutorialHomePage extends BaseFunc {
    public TutorialHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = ".//a[@data-toggle='dropdown']")
    private List<WebElement> components;

    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28']")
    private List<WebElement> monitors;

    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=product/product&path=25_28&product_id=42']")
    private List<WebElement> appleCinema;

    @FindBy(how = How.XPATH, using = "//input[@name='option[218]']")
    private List<WebElement> radio;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private List<WebElement> checkbox;

    @FindBy(how = How.CSS, using = "[id='input-option208']")
    private WebElement text;

    @FindBy(how = How.CSS, using = "[id='input-option217']")
    private WebElement select;

    @FindBy(how = How.CSS, using = "[id='input-option209']")
    private WebElement textArea;

    @FindBy(how = How.CSS, using = "[id='button-upload222']")
    private WebElement uploadFile;

    @FindBy(how = How.CSS, using = "[id='button-cart']")
    private WebElement addToCart;

    @FindBy(how = How.CSS, using = "[id='cart-total']")
    private WebElement cart;

    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/checkout']")
    private List<WebElement> checkOut;

    @FindBy(how = How.XPATH, using = "//input[@value='guest' and @name='account']")
    private List<WebElement> guestAcc;

    @FindBy(how = How.CSS, using = "[id='button-account']")
    private WebElement continueClick;

    @FindBy(how = How.CSS, using = "[id='input-payment-firstname']")
    private WebElement addFirstName;

    @FindBy(how = How.CSS, using = "[id='input-payment-lastname']")
    private WebElement addLastName;

    @FindBy(how = How.CSS, using = "[id='input-payment-email']")
    private WebElement addEmail;

    @FindBy(how = How.CSS, using = "[id='input-payment-telephone']")
    private WebElement addPhoneNumber;

    @FindBy(how = How.CSS, using = "  [id='input-payment-company']")
    private WebElement addCompany;

    @FindBy(how = How.CSS, using = "[id='input-payment-address-1']")
    private WebElement addAdressOne;

    @FindBy(how = How.CSS, using = "[id='input-payment-address-2']")
    private WebElement addAdressTwo;

    @FindBy(how = How.CSS, using = "[id='input-payment-city']")
    private WebElement addCity;

    @FindBy(how = How.CSS, using = "[id='input-payment-postcode']")
    private WebElement addPostCode;

    @FindBy(how = How.CSS, using = "[id='input-payment-country']")
    private WebElement selectCountry;

    @FindBy(how = How.CSS, using = "[id='input-payment-zone']")
    private WebElement selectRegion;

    @FindBy(how = How.CSS, using = "[id='button-guest']")
    private WebElement clickContinue;

    @FindBy(how = How.XPATH, using = "//textarea[@name='comment']")
    private WebElement addCommentsAboutOrder;

    @FindBy(how = How.CSS, using = "[id='button-shipping-method']")
    private WebElement clickAgainContinue;

    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    private WebElement termsAndCondition;

    @FindBy(how = How.CSS, using = "[id='button-payment-method']")
    private WebElement stepFiveClickContinue;

    @FindBy(how = How.CSS, using = "[id='button-confirm']")
    private WebElement clickConfirmButton;

    @FindBy(how = How.CSS, using = "[id='cart-total']")
    private WebElement verifyShippingCart;

    @FindBy(how = How.XPATH, using = "//div[@id='content']")
    private WebElement verifyOrderPlaced;


    public String selectComponents(String menuName) {
        String itemName = null;
        for (WebElement element : components) {
            itemName = element.getText();
            if (menuName.equals(itemName)) {
                element.click();
                break;
            }
        }
        return itemName;
    }

    public void clickMonitors(int i) {
//        waitElementAppeared(monitors.get(0));
        monitors.get(i).click();

    }

    public void clickAppleCinema(int i) {
        appleCinema.get(i).click();
    }

    public void clickingElements(int i, String learning_to_code, int indexOfFirstSelect,
                                 int iCheckout, int clickOnIt, int telephone)
            throws AWTException, InterruptedException {
        radio.get(i).click();
        checkbox.get(i).click();
        text.clear();
        text.sendKeys(learning_to_code);
        select.click();
        Select select = new Select(driver.findElement(By.cssSelector("[id='input-option217']")));
        select.selectByIndex(indexOfFirstSelect);
        textArea.sendKeys(learning_to_code);

        fileUploadWithRobot();

        addToCart.click();
        waitElementAppeared(cart);
        cart.click();
        waitElementAppeared(checkOut.get(iCheckout));
        checkOut.get(iCheckout).click();
        waitListElementsAppeared(guestAcc);
        guestAcc.get(clickOnIt).click();
        continueClick.click();
        waitElementAppeared(addFirstName);
        addFirstName.sendKeys("Tania");
        addLastName.sendKeys("Soboleva");
        addEmail.sendKeys("ts@piu.lv");
        addPhoneNumber.sendKeys(String.valueOf(telephone));
        addCompany.sendKeys(learning_to_code);
        addAdressOne.sendKeys("Holywoodstreet");
        addAdressTwo.sendKeys(learning_to_code);
        addCity.sendKeys("Los Angeles");
        addPostCode.sendKeys("PPPP");
        selectCountry.click();
        Select selectCountries = new Select(driver.findElement(By.cssSelector("[id='input-payment-country']")));
        selectCountries.selectByIndex(223);
        selectRegion.click();
        waitElementAppeared(selectRegion);
        Select selectRegions = new Select(driver.findElement(By.cssSelector("[id='input-payment-zone']")));
        Thread.sleep(2000);
        selectRegions.selectByIndex(5);
        clickContinue.click();
        waitElementAppeared(addCommentsAboutOrder);
        addCommentsAboutOrder.sendKeys("Almost done");
        clickAgainContinue.click();
        waitElementAppeared(termsAndCondition);
        termsAndCondition.click();
        stepFiveClickContinue.click();
//        Thread.sleep(3000);
        waitElementAppeared(clickConfirmButton);
        clickConfirmButton.click();
        Thread.sleep(3000);
//        waitElementAppeared(verifyShippingCart);
        verifyShippingCart.click();
        Thread.sleep(3000);
        WebElement finalShoppingCart = driver.findElement(By.cssSelector("[class='text-center']"));
        Assertions.assertEquals(finalShoppingCart.getText(), "Your shopping cart is empty!");
        WebElement finalShoppingCartTwo = driver.findElement(By.xpath("//h1[text()='Your order has been placed!']"));
        Assertions.assertEquals(finalShoppingCartTwo.getText(), "Your order has been placed!");
    }

    private void fileUploadWithRobot() throws AWTException {
        File file = null;

        try {
            file = new File(TutorialHomePage.class.getClassLoader().getResource("IMG_8574.JPG").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        uploadFile.click();

        StringSelection ss = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(250);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(3000);
    }

    public void getTextAtributes() {
        waitElementAppeared(verifyOrderPlaced);

      verifyOrderPlaced.findElement(By.xpath(".//h1")).getText();

    }

}

