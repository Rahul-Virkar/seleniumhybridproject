package tngscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priortization {
	
	@Test 
   public void testa(){
	   System.out.println("T1");
	   Assert.fail();
   }
	@Test (dependsOnMethods = "testa")
   public void testb() {
	  		   System.out.println("T2");
   }
	@Test 
   public void test() {
	   System.out.println("T3");
   }
}
