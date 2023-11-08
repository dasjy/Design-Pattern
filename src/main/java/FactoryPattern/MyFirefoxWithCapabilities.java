package FactoryPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyFirefoxWithCapabilities
{
    WebDriver driver=null;
    public MyFirefoxWithCapabilities()
    {
        WebDriverManager.chromedriver().setup();

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "FIREFOX");

        driver=new FirefoxDriver(capabilities);
    }
    public WebDriver getDriver(){
        return driver;
    }
}
