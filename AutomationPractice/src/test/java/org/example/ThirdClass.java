package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ThirdClass extends DriverSetup{

    @Test
    public void testAdvanceElement() throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app/");

        // "//div/h1" OR "div>h1" parent to child locator
        System.out.println(browser.findElement(By.xpath("//div/h1")).getText());
        System.out.println(browser.findElement(By.xpath("//tr/th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr/th[last()]")).getText());
        System.out.println(browser.findElement(By.xpath("//td[text()=\"Green\"]")).getText());
        System.out.println(browser.findElement(By.xpath("//h2[contains(text(),\"yout one\")]")).getText());




        //div>h1" parent to child locator
        System.out.println(browser.findElement(By.cssSelector("div>h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr>th:nth-child(1)")).getText());

        Thread.sleep(3000);

        // multiple Attribute Use in Xpath
        WebElement homeClick= browser.findElement(By.xpath("//a[@class=\"button bar-item\" and @href=\"/contact\"]"));
        homeClick.click();
        Thread.sleep(3000);

        // multiple Attribute Use in CssSelector
        homeClick= browser.findElement(By.cssSelector("a[class=\"button bar-item\"][href=\"/\"]"));
        homeClick.click();
        Thread.sleep(3000);




    }

}
