package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public String baseUrl = "https://www.saucedemo.com/";
    public static WebDriver driver; // public static webdriver variable created so it can be accessed globaly

    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");// setting up driver's property


        driver = new ChromeDriver();// creating chrome driver object
        driver.get(baseUrl); // opening Url
        driver.manage().window().maximize();// maximize window once opened url

    }

    public void quitAllUrl(){

        driver.quit();

    }

}
