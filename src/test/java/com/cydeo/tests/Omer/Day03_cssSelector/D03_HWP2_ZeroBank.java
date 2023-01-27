package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverTools;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03_HWP2_ZeroBank {
    public static void main(String[] args) {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        WebDriver driver= WebDriverTools.getDriver("chrome","http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        String control= driver.findElement(By.cssSelector("div.page-header")).getText();
        WebDriverTools.Verification(control, "Log in to ZeroBank","Header text" );

        //Expected: “Log in to ZeroBank”
        driver.quit();
    }
}
