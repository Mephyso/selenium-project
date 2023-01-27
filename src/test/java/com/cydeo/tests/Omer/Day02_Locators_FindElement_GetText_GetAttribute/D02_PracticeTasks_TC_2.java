package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_PracticeTasks_TC_2 {
    public static void main(String[] args) {

        //TC #2: Back and forth navigation
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.

        WebElement AB_Testing = driver.findElement(By.linkText("A/B Testing"));
        AB_Testing.click();

        //4- Verify title is:

        String title = driver.getTitle();
        System.out.println("title = " + title);

        //Expected: No A/B Test

        if (title.equals("No A/B Test"))
            System.out.println("Verify title PASSED.");
        else System.out.println("Verify title FAILED!!!");

        //5- Go back to home page by using the .back();

        driver.navigate().back();

        //6- Verify title equals:

        title = driver.getTitle();
        System.out.println("title = " + title);

        //Expected: Practice

        if (title.equals("Practice"))
            System.out.println("Verify title PASSED.");
        else System.out.println("Verify title FAILED!!!");
        driver.quit();
    }
}
