package project;
import org.testng.annotations.Test;
public class groupsassert {


	    @Test(groups = {"Smoke"})
	    public void login() {
	        System.out.println("Login Test");
	    }

	    @Test(groups = {"Smoke"})
	    public void logout() {
	        System.out.println("Logout Test");
	    }

	    @Test(groups = {"Regression"})
	    public void addEmployee() {
	        System.out.println("Add Employee Test");
	    }

	    @Test(groups = {"Regression"})
	    public void deleteEmployee() {
	        System.out.println("Delete Employee Test");
	    }

	    @Test(groups = {"Smoke", "Regression"})
	    public void searchEmployee() {
	        System.out.println("Search Employee Test");
	    }
	}