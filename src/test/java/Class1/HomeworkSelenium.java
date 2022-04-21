package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeworkSelenium {
    @Test
    public void useSelenium(){


         System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
}
