package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class FifthClass extends DriverSetup{
 @Test
    public void testDropdown() throws InterruptedException {
     browser.get("https://trytestingthis.netlify.app/");
     WebElement dropdown = browser.findElement(By.xpath("//select[@id='option']"));
     Select select = new Select(dropdown);
     dropdown.click();
     // for keyboard press
     dropdown.sendKeys(Keys.DOWN);
     Thread.sleep(2000);
     select.selectByValue("option 1");
     Thread.sleep(2000);
     System.out.println(select.getFirstSelectedOption().getText());
     select.selectByVisibleText("Option 3");
     Thread.sleep(2000);
     System.out.println(select.getFirstSelectedOption().getText());

 }
  @Test
 public void hoverTest() throws InterruptedException {


// browser.get("https://demoqa.com/menu");
// WebElement manu = browser.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
//  Actions hover = new Actions(browser);
// hover.clickAndHold(manu).build().perform();
// Thread.sleep(3000);
// hover.clickAndHold(browser.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"))).clickAndHold().build().perform();
// Thread.sleep(3000);


//  hover.scrollByAmount(0,1000);
//  Thread.sleep(3000);
//  hover.clickAndHold(browser.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
//  Thread.sleep(3000);
//  hover.click(browser.findElement(By.xpath("//a[contains(text(),'Top')]"))).build().perform();
//  Thread.sleep(3000);
//
//
//   //for copy paste
//   hover.sendKeys(browser.findElement(By.xpath("//input[@id='autocomplete']")),"hello").build().perform();
//   hover.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//   hover.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//
//   WebElement cp= browser.findElement(By.id("name"));
//   cp.sendKeys(Keys.CONTROL,"v");
//   Thread.sleep(3000);
   browser.get("https://rahulshettyacademy.com/AutomationPractice/");
   Thread.sleep(3000);
   JavascriptExecutor js = (JavascriptExecutor) browser;
   js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
   Thread.sleep(3000);
   js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
   Thread.sleep(3000);

   WebElement Mouse =browser.findElement(By.xpath("//button[@id='mousehover']"));
   js.executeScript("arguments[0].scrollIntoView();",Mouse);
   Thread.sleep(3000);

 }
}
