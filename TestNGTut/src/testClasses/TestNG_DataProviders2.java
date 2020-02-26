package testClasses;

import org.testng.annotations.Test;

public class TestNG_DataProviders2 {
  
  @Test(dataProvider = "dp", dataProviderClass=TestData.class)
  public void testMethod(String s1, String s2) {
	  
	  System.out.println("Input :"+s1 + "-"+ s2);
	  
  }
}
