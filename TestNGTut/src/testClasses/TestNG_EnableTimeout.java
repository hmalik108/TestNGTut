package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeout {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");

    }

    @Test(enabled = false)
    public void test1() {
        System.out.println("test1");

    }

    @Test(timeOut = 100)
    public void test2() throws InterruptedException {
        System.out.println("test2");
        Thread.sleep(200);

    }


}
