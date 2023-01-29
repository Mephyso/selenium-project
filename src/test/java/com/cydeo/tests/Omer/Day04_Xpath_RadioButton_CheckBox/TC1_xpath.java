package com.cydeo.tests.Omer.Day04_Xpath_RadioButton_CheckBox;

import com.cydeo.utilities.WebDriverTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_xpath {
    public static void main(String[] args) {

        //TC #1: XPATH and xpath Practices
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/forgot_password
        WebDriver driver = WebDriverTools.getDriver("Chrome","https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement home= driver.findElement(By.xpath("//a[@class='nav-link']"));
        home= driver.findElement(By.xpath("//a[@href='/']"));
        System.out.println("home = " + home.isDisplayed());

        //b. “Forgot password” header
        WebElement forgotPassword= driver.findElement(By.xpath("//h2"));
        forgotPassword= driver.findElement(By.xpath("//div[@class='example']/h2"));
        System.out.println("forgotPassword = " + forgotPassword.isDisplayed());

        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));
        emailLabel= driver.findElement(By.xpath("//div/label"));
        System.out.println("emailLabel = " + emailLabel.isDisplayed());

        //d. E-mail input box
        WebElement emailBox= driver.findElement(By.xpath("//input[@type='text']"));
        emailBox= driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println("emailBox = " + emailBox.isDisplayed());

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@class='radius']"));
        retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println("retrievePassword = " + retrievePassword.isDisplayed());

        //f. “Powered by Cydeo text
        WebElement cydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        cydeoText = driver.findElement(By.xpath("//div[@class='large-4 large-centered columns']/div"));
        System.out.println("cydeoText = " + cydeoText.isDisplayed());

        //4. Verify all web elements are displayed.
        //Try to create 2 different xpath if possible
        driver.quit();

    }
}
