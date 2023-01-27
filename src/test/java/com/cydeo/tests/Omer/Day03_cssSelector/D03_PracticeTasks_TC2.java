package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D03_PracticeTasks_TC2 {
    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        WebDriver driver= WebDriverTools.getDriver("chrome", "https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberME = driver.findElement(By.className("login-item-checkbox-label"));
        String control=rememberME.getText();
        WebDriverTools.Verification(control, "Remember me on this computer", "remember me label text");

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotten = driver.findElement(By.className("login-link-forgot-pass"));
        control=forgotten.getText();
        WebDriverTools.Verification(control, "Forgot your password?", "forgot your password label text");

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        if (forgotten.getAttribute("href").contains("forgot_password=yes"))
            System.out.println("href attribute’s value verification PASSED. ");
        else System.out.println("href attribute’s value verification FAILED. ");

        driver.quit();
    }
}
