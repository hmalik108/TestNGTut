package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_BeforeClassAnnotations {

    @BeforeClass
    public void setUp() {
        System.out.println("Before Class");

    }

    @AfterClass
    public void cleanUp() {
        System.out.println("After class");

    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After");

    }

    @Test
    public void testMethod1() {
        System.out.println("testMethod1 executing");
    }

    @Test
    public void testMethod2() {
        System.out.println("testMethod2 executing");
    }


}
