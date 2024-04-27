package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
   WebDriver browser;

  @BeforeSuite
    public void openBrowser(){
        browser = new ChromeDriver();
    }


    @AfterSuite
    public void quiteBrowser(){
        browser.quit();
    }

}
