package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Annotation {

    @BeforeClass
    public void beforeclass(){
        System.out.println("this is before class");
    }

    @BeforeMethod
    public void test1(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println("this is before method");
    }
     @Test
     void  test2(){
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.in/");

        System.out.println("This is second step");
    }

     @Test
     void test3(){
        System.out.println("This is third method");
    }

     @AfterMethod
     void runfirstsampleprogram(){
        System.out.println("This is after step");
    }

     @AfterClass
     void afterclassmethod(){
        System.out.println("This is after class");
    }
}
