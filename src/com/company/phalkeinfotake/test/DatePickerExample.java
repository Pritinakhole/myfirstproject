package com.company.phalkeinfotake.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        String selDate="15";
        String selMonth="May";
        String selYear="2022";
        driver.findElement(By.id("datepicker1")).click();
        WebElement liMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        WebElement liYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));

        if(liMonth.equals(selMonth)&&liYear.equals(selYear))
        {
            List<WebElement> allDate= (List<WebElement>) driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

          for(WebElement date:allDate)
          {
               if (date.getText().equals(selDate))
               {

                    date.click();

                    break;
        }

    }
              Thread.sleep(3000);
    }             driver.close();
    }

}
