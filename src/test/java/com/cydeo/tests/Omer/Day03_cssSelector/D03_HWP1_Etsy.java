package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverTools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D03_HWP1_Etsy {
    public static void main(String[] args) throws InterruptedException {
        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        WebDriver driver= WebDriverTools.getDriver("chrome","https://www.etsy.com" );
        WebElement cookies= driver.findElement(By.xpath("//button[@data-gdpr-single-choice-accept='true']"));
        cookies.click();

        //3. Search for “wooden spoon”
        WebElement search = driver.findElement(By.xpath("//input[@data-id=\"search-query\"]"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
        String control = driver.getTitle();
        WebDriverTools.Verification(control, "Wooden spoon - Etsy DE","title");
               //Expected: “Wooden spoon - Etsy DE”
        Thread.sleep(5000);
        driver.quit();
    }
}
