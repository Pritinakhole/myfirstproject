package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample{

WebDriver driver;
   @BeforeClass
   @Parameters({"a, b"})
    void setup(int a, int b) {
       int c;
       System.out.println(c=a+b);




//       if(browser.equalsIgnoreCase("chrome"));{
//            System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
//            WebDriver driver=new ChromeDriver();

        }
       // driver.get(app);
   //}






}

