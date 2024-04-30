package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class PracticeClass extends DriverSetup{

    @Test
    public void practiceTest(){
       browser.get("https://automationexercise.com/");
      WebElement contact = browser.findElement(By.cssSelector("a[href='/contact_us']"));







    }
}
