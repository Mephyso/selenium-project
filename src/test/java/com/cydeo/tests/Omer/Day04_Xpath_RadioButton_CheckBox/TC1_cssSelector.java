package com.cydeo.tests.Omer.Day04_Xpath_RadioButton_CheckBox;

import com.cydeo.utilities.WebDriverTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_cssSelector {
    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/forgot_password
        WebDriver driver = WebDriverTools.getDriver("Chrome","https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement home= driver.findElement(By.cssSelector("a.nav-link"));
        home= driver.findElement(By.cssSelector("a[href='/']"));
        //b. “Forgot password” header
        WebElement forgotPassword= driver.findElement(By.cssSelector("h2"));
        forgotPassword= driver.findElement(By.cssSelector("div.example>h2"));
        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.cssSelector("label[for='email']"));
        emailLabel= driver.findElement(By.cssSelector("div>label"));
        //d. E-mail input box
        WebElement emailBox= driver.findElement(By.cssSelector("input[type='text']"));
        emailBox= driver.findElement(By.cssSelector("input[name='email']"));
        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button.radius"));
        retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));
        //f. “Powered by Cydeo text
        WebElement cydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        cydeoText = driver.findElement(By.cssSelector("div[class='large-4 large-centered columns']>div"));
        System.out.println("home = " + home.isDisplayed());
        System.out.println("cydeoText = " + cydeoText.isDisplayed());
        System.out.println("retrievePassword = " + retrievePassword.isDisplayed());
        System.out.println("emailBox = " + emailBox.isDisplayed());
        System.out.println("emailLabel = " + emailLabel.isDisplayed());
        System.out.println("forgotPassword = " + forgotPassword.isDisplayed());
        //4. Verify all web elements are displayed.
        //Try to create 2 different cssSelector if possible
        driver.quit();

    }
}
