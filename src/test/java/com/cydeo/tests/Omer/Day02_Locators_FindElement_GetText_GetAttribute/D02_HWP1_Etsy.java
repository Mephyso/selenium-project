package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_HWP1_Etsy {
    public static void main(String[] args) throws InterruptedException {
        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        WebElement cookies= driver.findElement(By.xpath("//button[@data-gdpr-single-choice-accept='true']"));
        cookies.click();

        //3. Search for “wooden spoon”
        WebElement search = driver.findElement(By.tagName("input"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
        if (driver.getTitle().equals("Wooden spoon - Etsy DE"))
            System.out.println("Verify title PASSED.");
        else System.out.println("Verify title FAILED!!!");

        //Expected: “Wooden spoon - Etsy DE”
        Thread.sleep(5000);
        driver.quit();
    }
}
