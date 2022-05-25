package com.company.phalkeinfotake.test;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookieExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Cookie cookiename=new Cookie("hello", "1234456789"); //creating cookie class nd object

        driver.manage().addCookie(cookiename);        //Adding cookies
        Set<Cookie>cookies=driver.manage().getCookies();
        for (Cookie c: cookies)
        {
            System.out.println("The first turn " +c);
        }

        driver.manage().deleteCookie(cookiename);               //delete cookie which we added in first turn
        Set<Cookie>cookie2=driver.manage().getCookies();
        for (Cookie d:cookie2){
            System.out.println("The second turn" +d);
        }

        driver.manage().deleteAllCookies();                       //delete all cookies
        Set<Cookie>cookie3=driver.manage().getCookies();
        for (Cookie d2:cookie3){
            System.out.println("The third turn" +d2);
        }
        driver.close();
    }
}
