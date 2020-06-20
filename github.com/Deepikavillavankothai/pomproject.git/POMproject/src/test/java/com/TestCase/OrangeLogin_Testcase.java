package com.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.OrangeLoginpage;

public class OrangeLogin_Testcase extends Library {
	
	 OrangeLoginpage login; 
	 
	  @BeforeClass
	  
	  public void launchapp(){
		  
		  launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		  
	  }

	  
	  @Test
	  
	  public void signup() {
		  
		  login = new OrangeLoginpage(driver);
		  
		  login.uname("Admin");
		  
		  login.pword("admin123");
		  
		  login.clicklogin();
	  }
	  
	  @AfterClass
	  
	  public void close() {
		  quit();
	  }
	  
}
