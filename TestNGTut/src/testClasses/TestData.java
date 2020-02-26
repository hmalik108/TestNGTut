package testClasses;

import org.testng.annotations.DataProvider;

public class TestData {

	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "One", "1" },
	      new Object[] { "Two", "2" },
	    };
	  }
}
