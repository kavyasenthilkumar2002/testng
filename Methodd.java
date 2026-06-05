package project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Methodd {
  @Test
  @BeforeMethod
	public void before()
	{
		System.out.println("I am Before Method");
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



@AfterMethod
	public void After()
	{
		System.out.println("I am After Method");
	}}

