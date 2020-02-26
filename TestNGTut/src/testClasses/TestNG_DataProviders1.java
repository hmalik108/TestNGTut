package testClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders1 {


    @DataProvider
    public Object[][] dp() {
        return new Object[][]{
                new Object[]{1, "a"},
                new Object[]{2, "b"},
        };
    }

    @Test(dataProvider = "dp")
    public void testMethod(Integer n, String s) {

        System.out.println("Input 1:" + n);
        System.out.println("Input 1:" + s);

    }
}
