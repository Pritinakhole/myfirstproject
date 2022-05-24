package testng;

import org.testng.annotations.Test;

public class Invocationcount {

    @Test(invocationCount = 10,invocationTimeOut = 5)
    public void Setup()
    {
        System.out.println("This is first invocation program");
    }


    @Test(invocationCount = 10,invocationTimeOut = 2)
       public void login()
    {
        System.out.println("This is second case");
    }
}
