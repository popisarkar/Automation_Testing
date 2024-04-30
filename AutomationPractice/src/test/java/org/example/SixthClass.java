package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SixthClass extends DriverSetup{
    @Test
    public void IframeTest() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js =(JavascriptExecutor)browser;
        js.executeScript("arguments[0].scrollIntoView()",browser.findElement(By.xpath("//button[@id='mousehover']")));
        Thread.sleep(3000);
        browser.switchTo().frame(0);
        System.out.println(browser.findElement(By.xpath("(//a[@href=\"https://courses.rahulshettyacademy.com/sign_up\"])[1]")).getText());
        browser.switchTo().defaultContent();
        //browser.switchTo().parentFrame();
        System.out.println(browser.findElement(By.xpath("//button[@id='mousehover']")).getText());


        // For asserstion
        SoftAssert softAssert = new SoftAssert();
        System.out.println(1);
        System.out.println(2);
        Assert.assertEquals(1,3);
        System.out.println(6);
        softAssert.assertAll();




    }
}
