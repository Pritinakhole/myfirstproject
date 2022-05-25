package com.company.phalkeinfotake.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFirstSeleniumProgram {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "C://Users//Anvi Nakhole//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver=new FirefoxDriver();
        //driver=new EdgeDriver();
        //driver=new InternetExplorerDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3330);
        driver.close();
    }
}
