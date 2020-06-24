package com.StepDefinition;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.OrangeLoginpage;
import com.SeleniumReusableFunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrangeHrmlogin_steps extends Library {
	
	 OrangeLoginpage login;
	 SeleniumUtility utility;
	
	@Given("^to launch the browser and anvigate to url$")
	public void to_launch_the_browser_and_anvigate_to_url() {
		 launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	    
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() {
		  
		  login = new OrangeLoginpage(driver);
		  
		  login.uname("Admin");
		  
		  login.pword("admin123");
		  
	  
	}

	@Then("^click loginbutton$")
	public void click_loginbutton()  {
		 login.clicklogin();
	   
	}
	
	@Then("^take screenshot of the loginpage$")
	public void take_screenshot_of_the_loginpage() throws IOException {
		
		utility = new SeleniumUtility(driver);
		
	  utility.to_take_screenshot("E:\\takescreen\\org_sc.png");
	}


	@Then("^close the browser$")
	public void close_the_browser()  {
		
		quit();
	   
	}



}
