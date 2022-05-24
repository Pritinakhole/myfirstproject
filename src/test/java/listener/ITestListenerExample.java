package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerExample implements ITestListener{


    public void onTestStart(ITestResult result) {
        System.out.println("This is start test paas");

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("test success");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("test fail");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("test Skip");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("test fail with percentage");
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        //ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println("Test with timeout");
    }

    public void onStart(ITestContext context) {
       // ITestListener.super.onStart(context);
        System.out.println("start process");
    }

    public void onFinish(ITestContext context) {
        //ITestListener.super.onFinish(context);
        System.out.println("Finish Process");
    }
}
