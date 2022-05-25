package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement dragelement= driver.findElement(By.id("draggable"));
        WebElement dropelement1=driver.findElement(By.id("droppable"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",dragelement);
        Actions action1=new Actions(driver);                                        //Actions is the class
                                                                                    // action1 is the object
        action1.dragAndDrop(dragelement,dropelement1).build().perform();
        Thread.sleep(2000);
        driver.close();
    }
}
