package com.project.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvPurchaseSteps {
	
	static String name;
	
	@When("user search tv")
	public void user_search_tv() {
		System.out.println("scenario");
		name = "SAMSUNG";
		
		MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(name+" tv",Keys.ENTER);
	    
	}

	@When("user choose the tv")
	public void user_choose_the_tv() {
		
		WebElement mobileName = MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]"));
	    String fn = mobileName.getText();
		System.out.println("Mobile Name is :"+fn);
		
		mobileName.click();
	    
	}

}
