package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGDemo {
    @BeforeSuite
    public void beforesuit(){
        System.out.println("Before Suit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Before Method");
    }


    @Test(priority = 2)
    public void test1() {
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(word1, word2);
    }

    @Test(priority = 3)
    public void test2() {
        String word1 = "javascript";
        String word2 = "java";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);
        throw new SkipException("Just skipped");

    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("Test3");
        Assert.assertTrue(5 > 10);

    }
    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("After method");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("After Suite");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

}
