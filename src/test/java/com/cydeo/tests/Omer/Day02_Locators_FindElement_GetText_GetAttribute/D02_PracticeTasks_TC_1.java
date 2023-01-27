package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_PracticeTasks_TC_1 {
    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");

        //3. Verify URL contains

        String URL1 = driver.getCurrentUrl();
        System.out.println("URL = " + URL1);

        //Expected: cydeo
        if (URL1.contains("cydeo"))
            System.out.println("Verify URL PASSED.");
        else System.out.println("Verify URL FAILED!!!");

        //4. Verify title:

        String title = driver.getTitle();
        System.out.println("title = " + title);

        //Expected: Practice

        if (title.contains("Practice"))
            System.out.println("Verify title PASSED.");
        else System.out.println("Verify title FAILED!!!");
        driver.quit();
    }
}
