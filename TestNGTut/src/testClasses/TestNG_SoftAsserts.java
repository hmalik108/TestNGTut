package testClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
  @Test
  public void testSum() {
	  
	  SoftAssert sa = new SoftAssert();
	  System.out.println("Running test");
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(1, 2);
	  sa.assertEquals(result, 2);
	  System.out.println("After assert 1");
	  
	  sa.assertEquals(result, 2);
	  System.out.println("After assert 2");
	  
	  
  }
  
  @Test
  public void testSum2() {
	  
	  SoftAssert sa = new SoftAssert();
	  System.out.println("Running test");
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(1, 2);
	  sa.assertEquals(result, 2);
	  System.out.println("After assert 1");
	  
	  sa.assertEquals(result, 2);
	  System.out.println("After assert 2");
	  
	  sa.assertAll();
  }
}

