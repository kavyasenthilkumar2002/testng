package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class crossbrowsing {

    public static WebDriver driver;

    @BeforeClass
    public void before() {

        driver = new ChromeDriver();

        System.out.println("I am Before Class");
    }

    @Test
    public void one() {

        System.out.println("I am One");
    }

    @Test
    public void two() {

        System.out.println("I am Two");
    }

    @AfterClass
    public void after() {

     

        System.out.println("I am After Class");
    }
}