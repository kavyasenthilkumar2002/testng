package project;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite {
	
	@BeforeSuite
	public void before()
	{
		System.out.println("I am Before Suite");
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
  
  
  
  @AfterSuite
	public void After()
	{
		System.out.println("I am After Suite");
	}
  
}