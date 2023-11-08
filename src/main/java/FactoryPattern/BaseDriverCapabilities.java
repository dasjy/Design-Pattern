package FactoryPattern;

import org.openqa.selenium.WebDriver;

public interface BaseDriverCapabilities
{
    public WebDriver initializeDriverCapabilities(String string, String type);
}
