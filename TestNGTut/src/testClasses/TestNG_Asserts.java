package testClasses;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asserts {

    @Test
    public void testMethod1() {
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

}
