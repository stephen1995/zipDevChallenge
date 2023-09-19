package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


    public static WebDriver driver;
    public static void setup(String url){

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);

    }
    public static void tearDown(){
        driver.quit();
    }
}
