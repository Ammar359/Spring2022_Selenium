import Helper.Misc;
import Web.MyDriver;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork2_Sol {
    /**
     * Testcase-1:
     * <p>
     * <p>
     * Verify "Keep me signed in" is NOT selected for messenger login page
     * <p>
     * Click "Log in" button
     * <p>
     * Verify "Incorrect email or phone number" is displayed
     * <p>
     * Verify "Continue" button is enabled
     */

    // 1. Launch browser
    // 2. Open facebook.com
    // 3. Click Messenger link
    // 4. Verify user lands on messenger.com
    @Test
    public void checkSign() {

        System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://messenger.com");

        driver.manage().window().maximize();

        String LinkText = "Messenger";

        By locatorUsingLinkText = By.linkText(LinkText);

        WebElement linkTextLocator = MyDriver.getDriver().findElement(locatorUsingLinkText);

        linkTextLocator.click();

        Misc.pause(5);

        String boxXpath = "//*[@class='2qcu']";

        By locatorUsingXpath = By.xpath(boxXpath);

        WebElement boxXpathLocator = MyDriver.getDriver().findElement(locatorUsingXpath);

        boolean isBoxSelected = boxXpathLocator.isSelected();

        Assert.assertFalse(isBoxSelected, "'Keep me signed in' is selected");

        MyDriver.getDriver().manage().window().maximize();

        String xPathLogin = "//button[text[]='login']";

        By locatorUsingXpathTextLogin = By.xpath(xPathLogin);

        WebElement LogInLocator = MyDriver.getDriver().findElement(locatorUsingXpathTextLogin);

        LogInLocator.click();

        String messageXpath = "//div[text()='Incorrect email or phone number']";

        By locatorUsingMessageXpath = By.xpath(messageXpath);

        WebElement messageXpathLocator = MyDriver.getDriver().findElement(locatorUsingMessageXpath);

        boolean isItDisplayed = messageXpathLocator.isDisplayed();

        Assert.assertTrue(isItDisplayed, "'Incorrect email or phone number' is not displayed");

        String nameValue = "login";

        By locatorUsingNameValue = By.name(nameValue);

        WebElement nameValueLocator = MyDriver.getDriver().findElement(locatorUsingNameValue);

        boolean isItEnabled = nameValueLocator.isEnabled();

        Assert.assertTrue(isItEnabled, "'Continue button' is not enabled");

        MyDriver.quitWindows();


    }


    @Test

         public void signUpBtnEnabled() {

        System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String xpathOfCreateNewAcc = "//a[contains(@data-testid,'open-registration)]";

        By locatorOfCreateNewAcc = By.xpath(xpathOfCreateNewAcc);

        WebElement createNewAccLocator = MyDriver.getDriver().findElement(locatorOfCreateNewAcc);

        createNewAccLocator.click();

        Misc.pause(5);

        MyDriver.getDriver().manage().window().maximize();

        String signUpNameMethod = "websubmit";

        By locatorOfNameMethod = By.name(signUpNameMethod);

        WebElement nameMethodLocator = MyDriver.getDriver().findElement(locatorOfNameMethod);

        boolean isItEnabled = nameMethodLocator.isEnabled();

        Assert.assertTrue(isItEnabled,"Sign up button is not enabled");

        String firstNameValue = "firstname";

        By locatorOfNameValue = By.name(firstNameValue);

        WebElement nameValueLocator = MyDriver.getDriver().findElement(locatorOfNameValue);

        nameValueLocator.sendKeys("Ammar");


        String lastNameValue = "Lastname";

        By locatorOfLastNameValue = By.name(lastNameValue);

        WebElement lastNameValueLocator = MyDriver.getDriver().findElement(locatorOfLastNameValue);

        lastNameValueLocator.sendKeys("Ashraf");


    }



}