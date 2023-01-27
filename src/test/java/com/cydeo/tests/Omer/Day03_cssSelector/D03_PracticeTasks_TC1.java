package com.cydeo.tests.Omer.Day03_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03_PracticeTasks_TC1 {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement username= driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");


        //5- Click to login button.
        WebElement button= driver.findElement(By.className("login-btn"));
        button.click();

        //6- Verify error message text is as expected:
        System.out.println(driver.findElement(By.className("errortext")).getText());
        //Expected: Incorrect login or password
        if (driver.findElement(By.className("errortext")).getText().equals("Incorrect login or password"))
            System.out.println("Error text verification PASSED.");
        else System.out.println("Error text verification FAILED.");

        driver.quit();
    }
}
