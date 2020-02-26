package testClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestNG_TestParameters {
  
  @BeforeMethod
  @Parameters({"browser", "platform"})
  public void beforeMethod(String browser, String platform) {
	  System.out.println("TestNG_TestParameters -> Setup");
	  System.out.println("1. Parameter value from xml file: browser - "+browser);
	  System.out.println("2. Parameter value from xml file: platform -"+platform);
	  
	  
  }
  
  @Test
  @Parameters({"response"})
  public void testMethod1(String response) {
	  System.out.println("TestNG_TestParameters -> testMethod1");
	  System.out.println("Response form xml file: response -  "+response);
	  
  }

}
