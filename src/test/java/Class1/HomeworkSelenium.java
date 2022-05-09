package Class1;

import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeworkSelenium {
    @Test
    public void useSelenium(){


         System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();
    }

    @Test
    public void staticWord(){
        MyDriver.launchUrlOnNewWindow("www.amazon.com");
        String pageTitle = MyDriver.getDriver().getCurrentUrl();
        boolean isStartsWith = pageTitle.startsWith("amazon");
        Assert.assertTrue(isStartsWith,"it starts with amazon");

        MyDriver.quitWindows();
    }

    @Test
    public void checkMsg(){

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com");

        MyDriver.getDriver().manage().window().maximize();




    }
}
