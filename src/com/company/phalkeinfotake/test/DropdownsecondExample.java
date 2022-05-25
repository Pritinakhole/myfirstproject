package com.company.phalkeinfotake.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsecondExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='Month']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",dropdown);
        Select drpdown=new Select(dropdown);

        //drpdown.selectByValue("DZ");
        drpdown.selectByIndex(6);
        drpdown.selectByIndex(7);
        drpdown.selectByIndex(8);
        drpdown.selectByIndex(1);
        drpdown.selectByIndex(2);

        drpdown.deselectByVisibleText("January");
        Thread.sleep(3000);
        drpdown.deselectByIndex(7);
        Thread.sleep(3000);
        drpdown.deselectAll();
        driver.quit();

    }
}
