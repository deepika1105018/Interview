package com.flip.steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.flip.pages.HomePage;
//import com.flip.pages.LoginPage;
import com.flip.utility.FunctionLibrary;
import com.webapp.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Flipkart extends FunctionLibrary {
	WebDriver driver;


	static HomePage home;
	
	@Given("the user launch url")
	public void the_user_launch_url() {
		FunctionLibrary.browserFactory();
	}

	
	@When("user enters product")
	public void user_enters_product() {
		home.getuser();
	}
	
	@When("the user click button")
	public void the_user_click_button() {
	    home.getclick1();
	}
	@Then("the user selectmodel")
	public void the_user_selectmodel() {
	    home.model();
	}
	@Then("the user addcart")
	public void the_user_addcart() {
	   home.getAddCart();
	}



	
}