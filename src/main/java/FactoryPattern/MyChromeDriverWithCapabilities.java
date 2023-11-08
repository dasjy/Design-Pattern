package FactoryPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyChromeDriverWithCapabilities
{
    WebDriver driver=null;

    public MyChromeDriverWithCapabilities()
    {
        WebDriverManager.chromedriver().setup();

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "CHROME");

        driver=new ChromeDriver(capabilities);
    }
    public WebDriver getDriver(){
        return driver;
    }

}
