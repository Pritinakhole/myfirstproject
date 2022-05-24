package listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.ISuiteListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class ISuiteListenerExample
{

    ExtentReports reports=new ExtentReports();
    ExtentSparkReporter spark=new ExtentSparkReporter("MorningBatch.html");//Morning batch is just a file name which we have given for report
    ExtentTest test;

    @BeforeTest
    void beforeTest(){
        reports.attachReporter(spark);

    }
    @Test
    public  void verifyTest1(){
        System.out.println("Verify test 1");
        test=reports.createTest("This is my first test1");
        test.pass("Test 1 is passing");

    }
    @Test
    public  void verifyTest2() {
        System.out.println("Verify test 2");
        test=reports.createTest("This is my first test2").assignAuthor("Priti").assignDevice("Chrome");
        test.fail("Test 2 is fail");
        Assert.assertFalse(true);
    }
    @Test
    public  void verifyTest3() {
        System.out.println("Verify test 3");
        test=reports.createTest("This is my first test3").assignAuthor("Sonam").assignDevice("Firefox");
        test.pass("Test 3 is passing");
    }

    @Test
    public  void verifyTest4() {
        System.out.println("Verify test 4");
        test=reports.createTest("This is my first test4").assignAuthor("Anvi").assignDevice("IE");
        test.pass("Test 4 is pass");
        Assert.assertFalse(true);
    }

    @Test
    public  void verifyTest5() {
        System.out.println("Verify test 5");
        test=reports.createTest("This is my first test5").assignAuthor("Priyanka").assignDevice("Edge");
        test.pass("Test 5 is passing");
    }


    @AfterTest
    void afterTest(){
        reports.flush();

    }


}
