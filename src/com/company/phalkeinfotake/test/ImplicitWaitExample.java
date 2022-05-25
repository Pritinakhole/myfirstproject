package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //Implicit wait syntax
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("q")).sendKeys("Selenium");//selenium word send through automation to google
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);            //it returns the next page to previous page
        driver.findElement(By.xpath("//h3[text()=\"Selenium\"]")).click();//click on selenium tab by searching on google
        Thread.sleep(4000);
        driver.close();

    }
}
