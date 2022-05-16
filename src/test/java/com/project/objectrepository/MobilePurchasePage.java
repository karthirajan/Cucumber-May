package com.project.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.project.resources.Commonactions;

public class MobilePurchasePage extends Commonactions{
	
	public MobilePurchasePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeIcon;
	
	@FindBy(name = "q")
	private WebElement searchBar;
	
	//And Operator
	@FindBys({
			@FindBy(name = "email"),
			@FindBy(id = "email")
	})
	private WebElement username;
	
	//Or Operator
	@FindAll({
		@FindBy(name = "email"),
		@FindBy(id = "email")
      })
    private WebElement user;
	
	@FindBy(xpath = "//button[text()='BUY NOW']")
	private WebElement buyNow;

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}
	
	

}
