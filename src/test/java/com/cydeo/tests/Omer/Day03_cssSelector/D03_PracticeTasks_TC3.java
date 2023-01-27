package com.cydeo.tests.Omer.Day03_cssSelector;

import com.cydeo.utilities.WebDriverTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D03_PracticeTasks_TC3 {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        WebDriver driver = WebDriverTools.getDriver("chrome", "https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        WebElement loginbutton = driver.findElement(By.cssSelector("input.login-btn"));
        String control= loginbutton.getAttribute("value");
        WebDriverTools.Verification(control, "Log In","Log In button text");

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

        driver.quit();
    }
}
