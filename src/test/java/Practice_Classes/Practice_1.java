package Practice_Classes;

import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_1 {
    @Test
    public void setUp1() {
        //path of chrome driver
        System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

       // BASIC METHODS.......

        driver.get("https://www.amazon.com");

        // driver.get(url);

       // driver.navigate().to(url);
        driver.manage().window().maximize();

        // to get current url value
        String currentUrl1 = driver.getCurrentUrl();
        System.out.println("Current Url -->" + currentUrl1);

        // to get title of page
        String pageTitle = driver.getTitle();
        System.out.println("Page title -->" + pageTitle);

        // TO PAUSE THE PAGE FOR 2 SECONDS
        Misc.pause(5);

        // to close page after launching automatically
        driver.close();

    }
    @Test
    public void testClass(){
        MyDriver.launchUrlOnNewWindow("https://www.amazon.com");
        Misc.pause(3);
        MyDriver.getDriver().manage().window().maximize();

    }
    @Test
    public void basicMethods(){

        //Webdriver is an interface and chrome driver is a class(which is related to webdriver interface)
        WebDriver driver = new ChromeDriver();

        //to get the current URL

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url --->" + currentUrl);

        // to get the TITLE of webpage

        String currentTitle = driver.getTitle();
        System.out.println("Current Title --->" + currentTitle);

        //to REFRESH the page

        driver.navigate().refresh();

        // to close the webpage

        //driver.close();

        //to quit the window
        driver.quit();


        // Verify correct url is launch
    /*
        Open a browser window
        Launch facebook.com
        verify currentUrl is facebook.com

     */

    }

    @Test
    public void verifyCurrentUrl(){
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com");
        String url = "https://www.facebook.com/";
        MyDriver.getDriver().manage().window().maximize();

        WebDriver driver = new ChromeDriver();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(url,currentUrl,"current url is not same as expected");
    }






}