package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SecondClass extends DriverSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");

//      WebElement is the variable type here header is variable which is WebElement type
        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());

        WebElement FirstName= browser.findElement(By.id("fname"));
        FirstName.sendKeys("hi , im popy");
        Thread.sleep(5000);

        WebElement LastName= browser.findElement(By.name("lname"));
        LastName.sendKeys("hi , im popy");
        Thread.sleep(5000);

        WebElement radioClick= browser.findElement(By.cssSelector("input[id=\"female\"]"));
        radioClick.click();
        Thread.sleep(5000);

        radioClick= browser.findElement(By.xpath("//input[@id=\"male\"]"));
        radioClick.click();
        Thread.sleep(5000);


         WebElement openTab = browser.findElement(By.linkText("here"));
         openTab.click();
         Thread.sleep(5000);




    }
}
