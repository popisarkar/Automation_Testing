package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FourthClass extends DriverSetup{

    @Test
    public void testAdvanceElement2() throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app/");
        String value = browser.findElement(By.xpath("//input[@id=\"male\"]")).getAttribute("value");
        System.out.println(value);

         value = browser.findElement(By.xpath("//input[@id=\"male\"]")).getCssValue("font-size");
         System.out.println(value);

         Boolean display= browser.findElement(By.xpath("//input[@id=\"male\"]")).isDisplayed();
         System.out.println(display);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        display= browser.findElement(By.xpath(" //input[@id='displayed-text']")).isDisplayed();
        System.out.println(  "Before Display " + display);
        Thread.sleep(3000);

        browser.findElement(By.xpath(" //input[@id='hide-textbox']")).click();
        Thread.sleep(3000);
        display= browser.findElement(By.xpath(" //input[@id='displayed-text']")).isDisplayed();
        System.out.println(  " After Display " + display);
        Thread.sleep(3000);

         browser.findElement(By.xpath(" //input[@id='show-textbox']")).click();
         display= browser.findElement(By.xpath(" //input[@id='displayed-text']")).isDisplayed();
         System.out.println(  " AfterShow click Display " + display);
         Thread.sleep(3000);


        Boolean select= browser.findElement(By.xpath(" //input[@id='checkBoxOption1']")).isSelected();
        System.out.println(  "Before select" + select);
        Thread.sleep(3000);

        browser.findElement(By.xpath(" //input[@id='checkBoxOption1']")).click();
        select= browser.findElement(By.xpath(" //input[@id='checkBoxOption1']")).isSelected();
        System.out.println(  "After select" + select);
        Thread.sleep(3000);














    }
}
