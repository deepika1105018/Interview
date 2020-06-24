package com.flip.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flip.utility.FunctionLibrary;
public class HomePage extends FunctionLibrary  {
		
			
	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement getuser;

	@FindBy(xpath = "//*[@class='nav-input']")
	WebElement getclick1;

	@FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']")
    WebElement model;
		
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addcart	;
		
	


		public WebElement getAddCart() {
			getAddCart().click();
			return null;
		}


		public WebElement model() {
			model().click();
			return null;
		}


		public WebElement getclick1() {
			getclick1().click();
			return null;
		}


		public WebElement getuser() {
			getuser().sendKeys(readPropertyFile("username"));
			
			return null;
		}
		
}
			
		
		

	

	



