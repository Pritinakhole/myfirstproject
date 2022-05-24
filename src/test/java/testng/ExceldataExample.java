package testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceldataExample {
    public WebDriver driver;

    @DataProvider(name = "excel-data")

    public  Object[][] dataprovider(){
        Object[][] arrayobj= getexceldata("C:\\Users\\Anvi Nakhole\\Testdata.xlsx", "TestData1");
        return arrayobj;
    }
    public String[][] getexceldata(String filepath,String sheetname) throws NullPointerException{
        String[][]data=null;
        try {
            FileInputStream file = new FileInputStream(filepath);
            XSSFWorkbook wb = new XSSFWorkbook(file);  //accessing exel workbook
            XSSFSheet sh = wb.getSheet(sheetname); //accessing exel sheet in workbook
            XSSFRow row = sh.getRow(0);        //accessing row from sheet
            int noOfRows = sh.getPhysicalNumberOfRows();
            int noOfColumns = row.getLastCellNum();
            Cell cell;                                          //cell is the class
            data = new String[noOfRows - 1][noOfColumns];//
            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfColumns; j++) {
                    row = sh.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return data;

    }
    @BeforeMethod
    void beforeMethod(){
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvi Nakhole\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
        }
    }
    @Test(dataProvider = "excel-data")
    public  void feedvalue(String keyword1,String keyword2){
        driver.get("https://www.google.com/");
        WebElement element=driver.findElement(By.name("q"));
        element.sendKeys(keyword1,keyword2);
        element.sendKeys(Keys.ENTER);



    }
    @AfterMethod
    public  void teardown(){
        driver.quit();
}
}