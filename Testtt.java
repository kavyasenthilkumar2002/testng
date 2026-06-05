package project;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testtt {
  @Test
  @BeforeTest
	public void before()
	{
		System.out.println("I am Before Test");
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



@AfterTest
	public void After()
	{
		System.out.println("I am After Test");
	}

}