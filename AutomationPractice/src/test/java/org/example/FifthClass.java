package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

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
 public void hoverTest(){
 browser.get("https://demoqa.com/menu");


 }
}
