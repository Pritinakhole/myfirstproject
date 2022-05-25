package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
        WebElement SignUpButton =driver.findElement(By.xpath("//input[@value='Send']"));
        SignUpButton.click();
        if(SignUpButton.isDisplayed()){
            System.out.println("The element is displayed hiiiii");

        }
        else {
            System.out.println("The button is not displayed");
        }
        Thread.sleep(4000);
        driver.close();
    }
}
