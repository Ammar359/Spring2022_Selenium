import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework3_Sol {

    /**
     * TC-1:  darksky.net
     * Verify correct temperature value is displayed after changing temperature units
     * */
    @Test
    public void verifyTempValue() {

        System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");
        driver.manage().window().maximize();

        String arrowLocatorXpath = "//body/div[@id='header']/div[1]/div[1]/div[2]/b[1]";
        By arrowLocatorByXpath = By.xpath(arrowLocatorXpath);
        WebElement arrowLocator = MyDriver.getDriver().findElement(arrowLocatorByXpath);
        arrowLocator.click();


        String changeToCTempXpath = "//body/div[@id='header']/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]";
        By changeToCTempByXpath = By.xpath(changeToCTempXpath);
        WebElement changeToCTempKmh = MyDriver.getDriver().findElement(changeToCTempByXpath);
        changeToCTempKmh.click();

        String verifyTempValueContains = "//span[contains(text(),'14 Clear,')]";
        By verifyTempValueByText = By.xpath(verifyTempValueContains);
        WebElement verifyTempValue = MyDriver.getDriver().findElement(verifyTempValueByText);
        Assert.assertEquals(true, verifyTempValue.isDisplayed());
    }


    /**
     * TC-2: facebook.com
     * Verify current date is selected in the dropdown when user lands on the Create new account form
     */



    @Test
    public void verifyCurrentDateIsPresent(){


        System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        By createButtonLocator = By.xpath("//a[contains(.,'Create new account')]");
        WebElement createButtonElement = MyDriver.getDriver().findElement(createButtonLocator);
        createButtonElement.click();
        Misc.pause(3);

        MyDriver.getDriver().manage().window().maximize();

        SimpleDateFormat sdFormatMonth = new SimpleDateFormat("MMM");
        Date now = new Date();
        String month = sdFormatMonth.format(now);

        By monthLocator = By.xpath("//select[@id='month']//option[@selected='1']");
        WebElement monthLocatorElement = MyDriver.getDriver().findElement(monthLocator);
        String monthTextValue = monthLocatorElement.getText();

        Assert.assertEquals(month,monthTextValue,"Current month is not present");

        SimpleDateFormat sdFormatDay = new SimpleDateFormat("d");
        String day = sdFormatDay.format(now);

        By dayLocator = By.xpath("//select[@id='day']//option[@selected='1']");
        WebElement dayLocatorElement = MyDriver.getDriver().findElement(dayLocator);
        String dayTextValue = dayLocatorElement.getText();

        Assert.assertEquals(day,dayTextValue,"Current day is not present");

        SimpleDateFormat sdFormatYear = new SimpleDateFormat("yyyy");
        String year= sdFormatYear.format(now);

        By yearLocator = By.xpath("//select[@id='year']//option[@selected='1']");
        WebElement yearLocatorElement = MyDriver.getDriver().findElement(yearLocator);
        String yearTextValue = yearLocatorElement.getText();

        Assert.assertEquals(year,yearTextValue,"Current year is not present");

        MyDriver.quitWindows();
    }









    /**
     * TC-3: https://classroomessentialsonline.com/
     * Verify user lands on Economy Church Chairs page after clicking the option from Church Chairs
     */

    @Test
    public void verifyCorrectOption() {

        System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://classroomessentialsonline.com/");

        MyDriver.getDriver().manage().window().maximize();


        By churchChairLocator = By.xpath("(//a[contains(text(),'Church Chairs')])[1]");

        WebElement churchChairLocatorElement = MyDriver.getDriver().findElement(churchChairLocator);

        Actions dropDown = new Actions(MyDriver.getDriver());

        dropDown.moveToElement(churchChairLocatorElement).build().perform();

        Misc.pause(3);

        WebElement economicChairElement = MyDriver.getDriver().
                findElement(By.xpath("(//a[contains(text(),'Economy Church Chairs')])[1]"));

        economicChairElement.click();

        Misc.pause(3);



        WebElement economicChairTextElement = MyDriver.getDriver().
                findElement(By.xpath("//h1[@class='page-heading']"));

        boolean isItDisplayed = economicChairTextElement.isDisplayed();
        Assert.assertTrue(isItDisplayed,"It is not displayed");

        String text= economicChairTextElement.getText();
        Assert.assertEquals(text,"ECONOMY CHURCH CHAIRS","Wrong title is shown");

        MyDriver.quitWindows();

    }
}
