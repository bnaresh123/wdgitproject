package com.cucumber.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;	
public class TestBase {
	public static WebDriver driver;	
	
	public void OpenBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/com/cucumber/drivers/IEDriverServer.exe");
		}
		driver.manage().window().maximize();
	}
	
	public void CloseBrowser(){
		driver.close();
	}
	
	public void navigate(String url){
		driver.get(url);
	}
	
	
	

}


