package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
        Select drpdown=new Select(dropdown);               //select is the method for using dropdown
        dropdown.click();
        //Thread.sleep(5000);
        drpdown.selectByVisibleText("India");             //it shows the india is the visible text in dropdownlist
        Thread.sleep(5000);
        driver.quit();

    }
}
