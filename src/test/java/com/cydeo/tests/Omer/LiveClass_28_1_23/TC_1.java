package com.cydeo.tests.Omer.LiveClass_28_1_23;

import com.cydeo.utilities.WebDriverTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC_1 {
    public static void main(String[] args){
        // 1. Open Chrome browser
        // 2. Go to http://practice.cydeo.com/login
        WebDriver driver= WebDriverTools.getDriver("chrome", "http://practice.cydeo.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
        // 3. Enter username: "tomsmith"
        username.sendKeys("tomsmith");
        // 4. Enter password: "SuperSecretPassword"
        password.sendKeys("SuperSecretPassword");
        // 5. Click to Login button
        button.click();
        // 6. Verify text displayed on page
        String control =driver.findElement(By.xpath("//div[@class='flash success']")).getText();
        if (control.contains("You logged into a secure area!"))
            System.out.println("Verification of displayed text PASSED.");
        else System.out.println("Verification of displayed text FAILED.");
        //    Expected: "You logged into a secure area!"

        driver.close();
    }
}
