package testng;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import listener.IRetryAnalyzerExample;
import listener.ITestListenerExample;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.*;


//@Listeners(ITestListenerExample.class)


public class ExtentReportExample {
    public static Logger logger= LogManager.getLogger(ExtentReportExample.class);

//    ExtentReports reports=new ExtentReports();
//    ExtentSparkReporter spark=new ExtentSparkReporter("MorningBatch.html");//Morning batch is just a file name which we have given for report
//    ExtentTest test;

@BeforeTest
   void beforeTest(){
//    reports.attachReporter(spark);

}
@Test
   public  void verifyTest1(){
    System.out.println("Verify test 1");
    logger.info("this is information msg");
    logger.trace("this is trace msg");
    logger.warn("this is warning msg");
    logger.error("this is error msg");
    logger.debug("this is debug msg");


    //test=reports.createTest("This is my first test1");
    //test.pass("Test 1 is passing");

}
//@Test(retryAnalyzer = IRetryAnalyzerExample.class)   //retry analyzer
//  public  void verifyTest2() {
//      System.out.println("Verify test 2");
//    test=reports.createTest("This is my first test2").assignAuthor("Priti").assignDevice("Chrome");
//    test.fail("Test 2 is fail");
//    Assert.assertFalse(true);
//  }
//@Test()
//    public  void verifyTest3() {
//        System.out.println("Verify test 3");
//    test=reports.createTest("This is my first test3").assignAuthor("Sonam").assignDevice("Firefox");
//    test.pass("Test 3 is passing");
//    }
//
//@Test
//    public  void verifyTest4() {
//        System.out.println("Verify test 4");
//    test=reports.createTest("This is my first test4").assignAuthor("Anvi").assignDevice("IE");
//    test.pass("Test 4 is pass");
//   // Assert.assertFalse(true);
//    }
//
//@Test
//    public  void verifyTest5() {
//        System.out.println("Verify test 5");
//    test=reports.createTest("This is my first test5").assignAuthor("Priyanka").assignDevice("Edge");
//    test.pass("Test 5 is passing");
//    }


////@AfterTest
//void afterTest(){
//    reports.flush();

//}
}