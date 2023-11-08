package FactoryPattern;

import org.openqa.selenium.WebDriver;

public class BaseTest implements Broswer, BaseDriverCapabilities {

    @Override
    public WebDriver initializeDriverCapabilities(String string, String type) {
        switch (string) {
            case "chrome":
                if (type.equalsIgnoreCase("normalDriver"))
                    return new MyChromeDriver().getDriver();
                else if (type.equalsIgnoreCase("pre-setCapabilities"))
                    return new MyChromeDriverWithCapabilities().getDriver();
            case "FireFox":
                if (type.equalsIgnoreCase("normalDriver"))
                    return new MyFirefoxDriver().getDriver();
                else if (type.equalsIgnoreCase("pre-setCapabilities"))
                    return new MyFirefoxWithCapabilities().getDriver();
            default: {
                System.out.println("Please enter a valid Driver");
                return null;
            }
        }
    }

    @Override
    public WebDriver getBroswer(String broswer) {
        switch (broswer) {
            case "chrome":
                return new MyChromeDriver().getDriver();
            case "FireFox":
                return new MyFirefoxDriver().getDriver();

            default: {
                System.out.println("Please enter a valid Driver");
                return null;
            }
        }
    }
}

