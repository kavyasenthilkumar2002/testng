package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {

    @Test
    public void test1() {

        String actual = "Welcome";
        String expected = "Welcome";

        Assert.assertEquals(actual, expected);

        System.out.println("Test Passed");
    }
}