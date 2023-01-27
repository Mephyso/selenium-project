package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_HWP4_Locator
{
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        driver.findElement(By.className("nav-link")).click();
        Thread.sleep(3000);
        //4- Verify title is as expected:
        //Expected: Practice
        if (driver.getTitle().equals("Practice"))
            System.out.println("Verify title PASSED.");
        else System.out.println("Verify title FAILED!!!");
        driver.quit();

        //PS: Locate “Home” link using “className” locator
    }
}
