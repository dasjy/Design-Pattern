package FactoryPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver
{
    WebDriver driver=null;
    public MyChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
   public WebDriver getDriver()
   {
       return driver;
   }
}
