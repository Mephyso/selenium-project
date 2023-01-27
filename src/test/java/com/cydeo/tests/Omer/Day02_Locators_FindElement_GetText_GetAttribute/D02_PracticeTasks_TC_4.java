package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_PracticeTasks_TC_4 {
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement username= driver.findElement(By.className("form-control"));
        username.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        Thread.sleep(5000);

        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator
        driver.quit();
    }
}
