package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03_PracticeTasks_TC2 {
    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        WebDriver driver= WebDriverFactory.getDriver("firefox", "https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberME = driver.findElement(By.className("login-item-checkbox-label"));
        if (rememberME.getText().equals("Remember me on this computer"))
            System.out.println("Remember me label text verification PASSED. ");
        else System.out.println("Remember me label text verification FAILED. ");

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotten = driver.findElement(By.className("login-link-forgot-pass"));
        if (forgotten.getText().equals("Forgot your password?"))
            System.out.println("Forgot your password label text verification PASSED. ");
        else System.out.println("Forgot your password label text verification FAILED. ");
        System.out.println(forgotten.getText());

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        if (forgotten.getAttribute("href").contains("forgot_password=yes"))
            System.out.println("href attribute’s value verification PASSED. ");
        else System.out.println("href attribute’s value verification FAILED. ");

        driver.quit();
    }
}
