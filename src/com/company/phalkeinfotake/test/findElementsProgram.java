package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementsProgram {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       List<WebElement> ele1 =driver.findElements(By.className("cell"));
       for(WebElement l:ele1){
           System.out.println(l);
       }
       int s= ele1.size();
        System.out.println(s);
       // driver.close();
    }

}
