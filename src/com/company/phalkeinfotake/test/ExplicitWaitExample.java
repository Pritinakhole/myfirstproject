package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.name("q")).sendKeys("Selenium");//selenium word send through automation to google
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
       WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Selenium\"]")));
       element.click();
       driver.close();
    }
}
