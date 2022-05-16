package com.project.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.objectrepository.MobilePurchasePage;
import com.project.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps extends Commonactions{

	Commonactions c = new Commonactions();
	MobilePurchasePage m = new MobilePurchasePage();
	static String name;
	
	@Given("User login flipkart application")
	public void user_login_flipkart_application() {
		System.out.println("Background");
		 
		 try{
				
				//WebElement closeIcon = driver.findElement(By.xpath("//button[text()='✕']"));
				m.getCloseIcon().isDisplayed();
				//closeIcon.click();
				
				c.button(m.getCloseIcon());
				
			}catch (Exception e) {
				
				System.out.println("Login not required");
				
			}
	    
	}

	@When("user search mobile")
	public void user_search_mobile() {
		
		name = "realme";
		
		c.insertText(m.getSearchBar(), name);
	    
	}

	@When("user choose the mobile")
	public void user_choose_the_mobile() {
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]"));
	    String fn = mobileName.getText();
		System.out.println("Mobile Name is :"+fn);
		
		c.button(mobileName);
	    
	}

	@When("user switch to new window")
	public void user_switch_to_new_window() {
		
        c.windowsHandling();
	    
	}

	@Then("User validate the both names")
	public void user_validate_the_both_names() {
		
		
		c.scrollDown(m.getBuyNow());
		String text = m.getBuyNow().getText();
		//Assert.assertTrue(text.contains("Hi"));
		
		Assert.assertEquals("BUY NOW", text);
		
		System.out.println(text);
		if(text.contains("Hi")){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
	    
	}
	
	
	@When("user search mobile by one Dim list")
	public void user_search_mobile_by_one_Dim_list(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> datas = dataTable.asList();
		
        name = datas.get(1);
		
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
		
	    
	}
	
	@When("user search mobile by one Dim map")
	public void user_search_mobile_by_one_Dim_map(io.cucumber.datatable.DataTable dataTable) {
		
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		
        name = datas.get("3");
		
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
		
	    
	}
	
	@When("user search mobile {string}")
	public void user_search_mobile(String mobile) {
		
		name = mobile;
		
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
	    
	}

	
}
