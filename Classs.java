package project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Classs {
  @Test
  @BeforeClass
	public void before()
	{
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

@Test
public void three() {
	  
	  System.out.println("I am Three");
	  
}

@Test
public void Four() {
	  
	  System.out.println("I am Four");
	  
}

@Test
public void Five() {
	  
	  System.out.println("I am Five");
	  
}



@AfterClass
	public void After()
	{
		System.out.println("I am After Class");
	}}

