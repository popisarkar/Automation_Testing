package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FourthClass2 extends DriverSetup{

    @Test
    public void NavTest() throws InterruptedException {
        browser.navigate().to("https://trytestingthis.netlify.app/");
        browser.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        browser.navigate().back();
        Thread.sleep(2000);
        browser.navigate().forward();
        Thread.sleep(2000);
        browser.navigate().refresh();
        Thread.sleep(2000);

    }
    @Test
    public void windowTest() throws InterruptedException {
        browser.navigate().to("https://trytestingthis.netlify.app/");
        Thread.sleep(2000);
        browser.switchTo().newWindow(WindowType.TAB);
        browser.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);
        browser.manage().window().maximize();
        Thread.sleep(2000);
        browser.manage().window().minimize();
        Thread.sleep(2000);
        browser.manage().window().fullscreen();
        Thread.sleep(2000);
        System.out.println(browser.getCurrentUrl());

    }

    @Test
    public void TestAlert() throws InterruptedException {

        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert alert= browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You successfully clicked an alert" );
        Thread.sleep(3000);

        browser.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        alert= browser.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        alert= browser.switchTo().alert();
        Thread.sleep(3000);
        alert.dismiss();
        Thread.sleep(3000);

        browser.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        alert= browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("hello");
        Thread.sleep(3000);
        alert.accept();

        browser.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        alert= browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("hello");
        Thread.sleep(3000);
        alert.dismiss();
        Thread.sleep(3000);







    }

}
