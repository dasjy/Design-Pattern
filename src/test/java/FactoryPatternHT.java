import FactoryPattern.BaseTest;
import FactoryPattern.Broswer;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;

public class FactoryPatternHT
{
    static WebDriver driver=null;
    public static void main(String[] args)
    {
        Broswer base;
        base=new BaseTest();
        driver=base.getBroswer("chrome");
        driver.get("https://www.epam.com/");
        System.out.println("The chrome driver is initialized"+ driver);
        driver.quit();

        driver=base.getBroswer("FireFox");
        driver.get("https://www.epam.com/");
        System.out.println("The firefox driver is initialized"+ driver);
        driver.quit();

    }
}
