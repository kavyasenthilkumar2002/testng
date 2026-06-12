package project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritychecking {
  
  @BeforeClass
	public void before()
	{
		System.out.println("I am Before Class");
	}
	
	
@Test(priority = 3)
public void one() {
	  System.out.println("I am One");
	  
}

@Test(priority = 4)
public void two() {
	  
	  System.out.println("I am Two");
	  
}

@Test(priority = 2)
public void three() {
	  
	  System.out.println("I am Three");
	  
}

@Test(priority = 1)
public void Four() {
	  
	  System.out.println("I am Four");
	  
}

@Test (priority = 5)
public void Five() {
	  
	  System.out.println("I am Five");
	  
}

@AfterClass
	public void After()
	{
		System.out.println("I am After Class");
	}}

