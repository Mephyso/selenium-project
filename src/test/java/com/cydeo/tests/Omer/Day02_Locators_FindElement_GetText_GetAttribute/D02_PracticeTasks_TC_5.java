package com.cydeo.tests.Omer.Day02_Locators_FindElement_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_PracticeTasks_TC_5 {
    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        if ((driver.findElement(By.className("page-header"))).getText().equals("Registration form"))
            System.out.println("Verify header text PASSED.");
        else System.out.println("Verify header text FAILED!!!");

        //Expected: Registration form
        //4- Locate “First name” input box
        WebElement FirstName = driver.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        if (FirstName.getAttribute("placeholder").equals("first name"))
            System.out.println("Verify placeholder attribute’s value PASSED.");
        else System.out.println("Verify placeholder attribute’s value FAILED!!!");
        //Expected: first name
        driver.quit();
    }
}
