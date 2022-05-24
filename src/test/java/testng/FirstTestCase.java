package testng;



import org.testng.annotations.Test;


public class FirstTestCase {


    @Test(priority = 0, enabled = false)
    void Setup(){
          System.out.println("This is opening browser");
      }

      @Test(priority = 2)
      void Login(){
          System.out.println("This is login test");
      }


      @Test(dependsOnMethods ="Login")
      void close(){
          System.out.println("This is closing browser");

      }
      @Test(priority = -5)
      void first(){
          System.out.println("Hiiii");
      }

}
