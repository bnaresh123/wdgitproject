package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver){
	this.driver=driver;	
	}
	
	@FindBy(id="login1")
	public WebElement email;
	
	@FindBy(name="passwd")
	public WebElement password;
	
	@FindBy(name="proceed")
	public WebElement loginbutton;
	
	public void enteremail(String uname){
		email.sendKeys(uname);
	}
	
	public void enterpassword(String pass){
		password.sendKeys(pass);
	}
	public void Clickloginbutton(){
		loginbutton.click();
	}
	
	

}