package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatiionProgram {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("abc@pqr.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("2435678");

        driver.findElement(By.id("login1")).sendKeys("abc@pqr.com");
        Thread.sleep(3000);

        driver.findElement(By.id("password")).sendKeys("2435678");
        Thread.sleep(3000);

        driver.findElement(By.className("signinbtn")).click();
        Thread.sleep(3000);
        WebElement list= driver.findElement(By.id("login1"));
        WebElement element=driver.findElement(By.name("password"));

        System.out.println(list.getAttribute("login"));
        Thread.sleep(3000);
        driver.close();


    }
}
