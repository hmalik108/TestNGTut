package regressionSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import base.BaseTestSuite;

public class TestNG_TestClass2 extends BaseTestSuite {
	@Test
	  public void testMethod() {
		  System.out.println("Class 2 -> testMethod");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Class 2 -> @BeforeMethod");

	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Class 2 -> @AfterMethod");

	  }
	  

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Class 2 -> @BeforeClass");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("Class 2 -> @AfterClass");

	  }

}
