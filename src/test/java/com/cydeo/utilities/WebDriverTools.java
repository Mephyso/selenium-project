package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverTools
{
    public static WebDriver getDriver(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return driver;
        }
        else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

    public static void Verification (String controlValue, String expectedValue, String toVerify){
        if (controlValue.equals(expectedValue)) System.out.println("Verification of "+toVerify+" PASSED.");
        else System.out.println("Verification of "+toVerify+" FAILED.");
    }
}
