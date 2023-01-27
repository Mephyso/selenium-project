package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverTools;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03_HWP4_Locator
{
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        WebDriver driver = WebDriverTools.getDriver("chrome","https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        driver.findElement(By.xpath("//a[@class='nav-link']")).click();

        //4- Verify title is as expected:
        //Expected: Practice
        String control = driver.getTitle();
        WebDriverTools.Verification(control,"Practice", "title" );
        Thread.sleep(3000);

        driver.quit();

        //PS: Locate “Home” link using “className” locator
    }
}
