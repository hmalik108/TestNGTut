package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTestSuite {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BaseTestSuite -> @BeforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("BaseTestSuite -> @@AfterSuite");

	}

	@BeforeClass
	public void beforeClassBaseTestSuite() {
		System.out.println("BaseTestSuite -> @BeforeClass");
	}

	@AfterClass
	public void afterClassBaseTestSuite() {
		System.out.println("BaseTestSuite -> @@AfterClass");

	}

}
