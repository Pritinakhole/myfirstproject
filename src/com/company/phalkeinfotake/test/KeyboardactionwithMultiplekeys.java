package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardactionwithMultiplekeys {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");

        WebElement input1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
        WebElement input2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
input1.sendKeys("Welcome to selenium");
        Actions act=new Actions(driver);

        //ctrl+A   for selecting text on the box
        act.keyDown(Keys.CONTROL);
         act.sendKeys("a");
         act.keyUp(Keys.CONTROL);
         act.perform();

         //Ctrl+c    for copying the text to second input box
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //TAB    shift to second input box
        act.sendKeys(Keys.TAB);
        act.perform();

        //Ctrl+V  for pesting the text to second input box

        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //Comparing text
        if
        (input1.getAttribute("Value").equals(input2.getAttribute("Value")))
        System.out.println("Text copied");
        else
        System.out.println("Text not copied");


    }
}
