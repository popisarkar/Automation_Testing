package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass extends DriverSetup {

    @Test
    public void openWeb(){

        browser.get("https://mvnrepository.com/artifact/org.testng/testng/7.10.1");
//        Assert.assertEquals(browser.getTitle(),"Maven Repository: org.testng » testng » 7.10.1");
//
    }
}
