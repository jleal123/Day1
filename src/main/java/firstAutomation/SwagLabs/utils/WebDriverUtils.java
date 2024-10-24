package firstAutomation.SwagLabs.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
   public static WebDriver driver;

   public static void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       String url = "https://www.saucedemo.com/";
       driver.get(url);
   }

    public static void quitDriver(){
      driver.quit();
    }




}
