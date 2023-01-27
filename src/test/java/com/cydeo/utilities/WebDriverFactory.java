package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory
{
    public static WebDriver getDriver(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver= new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        }
        else return null;
    }
    public static WebDriver getDriver(String browserType, String url)
    {
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }
        else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }
        else return null;
    }
}
