package com.project.resources;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	//launch -- to launch the browser
	public void launch(String url) {
		
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		// options.addArguments("--headless");
		 options.setExperimentalOption("excludeSwitches",
			     Arrays.asList("disable-popup-blocking"));
		 
		 driver = new ChromeDriver(options);
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	public void windowsHandling() {
		
        String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			
			if(!x.equals(parent)){
				driver.switchTo().window(x);
				System.out.println("window switched");
			}
			
		}

	}
	
	public void insertText(WebElement ele,String value) {
		
		ele.sendKeys(value,Keys.ENTER);

	}
	
	public void button(WebElement ele) {
		
		ele.click();

	}
	
	public void scrollDown(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

}
