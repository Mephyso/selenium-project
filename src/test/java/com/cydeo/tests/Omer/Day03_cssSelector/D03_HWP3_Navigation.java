package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverTools;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03_HWP3_Navigation {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        WebDriver driver = WebDriverTools.getDriver("chrome","https://google.com");
        WebElement cookies = driver.findElement(By.xpath("//button[@id='W0wltc']"));
        cookies.click();

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
        gmail.click();

        //4- Verify title contains:
        //Expected: Gmail
        String control = driver.getTitle();
        WebDriverTools.Verification(control,"Gmail","title in Gmail page");

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        control= driver.getTitle();
        WebDriverTools.Verification(control,"Google", "title in Google page");

        driver.quit();
    }
}
