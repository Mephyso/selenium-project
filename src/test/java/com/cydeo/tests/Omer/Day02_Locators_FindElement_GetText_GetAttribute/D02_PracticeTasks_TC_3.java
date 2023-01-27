package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_PracticeTasks_TC_3
{
    public static void main(String[] args)
    {

    //TC#3: Google search
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    //1- Open a chrome browser
    //2- Go to: https://google.com
        driver.get("https://google.com");
        WebElement cookies = driver.findElement(By.id("W0wltc"));
        cookies.click();

    //3- Write “apple” in search box
    //4- Press ENTER to search

        WebElement searchBox = driver.findElement(By.tagName("input"));
        searchBox.sendKeys("apple"+ Keys.ENTER);

    //5- Verify title:
        System.out.println("Title = " + driver.getTitle());
    //Expected: Title should start with “apple” word
        if (driver.getTitle().startsWith("apple"))
            System.out.println("Verify title PASSED.");
        else System.out.println("Verify title FAILED!!!");
        driver.quit();
    }
}
