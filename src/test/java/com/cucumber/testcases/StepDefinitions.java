package com.cucumber.testcases;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.TestBase;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends TestBase {
	TestBase cucumber=new TestBase();
	@Given("^user open \"(.*?)\"$")
	public void user_open_browser_chrome(String browser) throws Throwable {
	    System.out.println("user open browser chrome: "+browser);
	    cucumber.OpenBrowser(browser);
	}

	@When("^user navigate \"(.*?)\"$")
	public void user_navigate_url_http_hdfcbank_com(String url) throws Throwable {
	   System.out.println("user navigate url: "+url);
	   cucumber.navigate(url);
	}

	@Then("^user click on rediffmail$")
	public void user_click_on_rediffmail() throws Throwable {
	    System.out.println("user click on rediffmail");
	    HomePage hp=PageFactory.initElements(driver, HomePage.class);
	   hp.Clickrmlink();
	   
	}
	
	@Given("^user enter email \"(.*?)\"$")
	public void user_enter_email(String uname) throws Throwable {
	    System.out.println("user enter email");
	    LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	    lp.enteremail(uname);
	}

	@When("^user enter password \"(.*?)\"$")
	public void user_enter_password(String pass) throws Throwable {
	    System.out.println("user enter password ");
	    LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	    lp.enterpassword(pass);
	}

	@Then("^user click on login buttton$")
	public void user_click_on_login_buttton() throws Throwable {
	   System.out.println("user click on login buttton");
	   LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	    lp.Clickloginbutton();
	}

}
