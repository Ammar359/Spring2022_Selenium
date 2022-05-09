package Class1;

import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FIle1 {

WebDriver MyDriver;
 @Test
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com");
        driver.manage().window().maximize();

     Misc.pause(5);

        String titlePage = driver.getTitle();
     System.out.println("Current Title is-->" + titlePage);

     String getUrl = driver.getCurrentUrl();
     System.out.println("Current Url -->" + getUrl);



     driver.close();

 }


}

// testNG
// behaviour driven framework
//framwork...  test driven Development framework TDD
//before class method
// after class method
//before suite
//after suite
//before test
//after test
//In Interview they will ask about Selenium Methods.
//DOM-->