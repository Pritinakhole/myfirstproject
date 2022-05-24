package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
       @Test
       public  void Program1()
       {
        String s="Priti";
        System.out.println("Hiii....this is first case");
      // Assert.assertEquals(s,"Amit","name should be same");
    }

    @Test(dependsOnMethods = "Program1" , alwaysRun = true)
     public void Program2()
    {
           System.out.println("This is second case");
    }

    @Test(dependsOnMethods = "Program2")
      public void Program3()
    {
           System.out.println("This is Third case");
    }

    @Test(dependsOnMethods = "Program3")
       public void Program4()
    {
           System.out.println("This is fourth case");
    }

}
