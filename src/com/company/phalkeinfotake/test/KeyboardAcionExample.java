package com.company.phalkeinfotake.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAcionExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions act=new Actions(driver);

        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        act.sendKeys(Keys.CONTROL).perform();
        Thread.sleep(2000);

        act.sendKeys(Keys.ARROW_RIGHT).perform();
        Thread.sleep(2000);

        act.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(2000);


        driver.close();
    }
}
