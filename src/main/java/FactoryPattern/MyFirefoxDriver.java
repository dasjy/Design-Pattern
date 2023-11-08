package FactoryPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver
{
    WebDriver driver=null;
    public MyFirefoxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }
    public WebDriver getDriver()
    {
        return driver;
    }
}
