package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//*[@id='homewrapper']/div[5]/a[1]/div/u")
	public WebElement rediffmaillink;
	
	public void Clickrmlink(){
		rediffmaillink.click();
	}
	
	
	
	
}
