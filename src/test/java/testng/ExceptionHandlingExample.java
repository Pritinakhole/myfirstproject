package testng;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionHandlingExample {


   @Test (expectedExceptions ={ ArithmeticException.class, IOException.class})
    void testCase1()
   {
       System.out.println(10/0);
       System.out.println("Test case1");

   }
    @Test (expectedExceptions = NullPointerException.class)
    void testCase2()
    {    String s=null;
        System.out.println(s.length());
        System.out.println("Test case2");
    }

    @Test(expectedExceptions = IOException.class)
    void testCase3()throws Exception
    {
        System.out.println("Test case3");
        throw new IOException();


    }



}
