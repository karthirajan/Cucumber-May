package com.project.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.project.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario");
        c.launch("https://www.flipkart.com/");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}else{
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}
		
		System.out.println("After Scenario");
		driver.quit();

	}

}
