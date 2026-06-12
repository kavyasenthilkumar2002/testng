package project;

import org.testng.annotations.Test;

public class dependson {

    @Test
    public void login() {
        System.out.println("Login Successful");
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        System.out.println("Product Searched");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void addToCart() {
        System.out.println("Product Added To Cart");
    }

    @Test(dependsOnMethods = "addToCart")
    public void payment() {
        System.out.println("Payment Successful");
    }
}