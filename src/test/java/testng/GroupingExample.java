package testng;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupingExample {

//    @BeforeGroups
//    void beforegroup(){
//        System.out.println("this is before group");
//    }


    @Test()
    void test1(){
        System.out.println("this is test1...");
    }


    @Test(groups = "p1")
    void test2(){
        System.out.println("this is test2...");
    }

    @Test(groups = "smoke")
    void test3(){
        System.out.println("this is test3...");
    }

    @Test()
    void test4(){
        System.out.println("this is test4...");
    }

    @Test(groups = "smoke")
    void test5(){
        System.out.println("this is test5...");
    }












}
