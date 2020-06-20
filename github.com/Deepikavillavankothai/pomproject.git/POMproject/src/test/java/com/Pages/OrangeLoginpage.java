package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginpage {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
    WebElement username;
	@FindBy(id="txtPassword")
	WebElement pwd;
	@FindBy(id="btnLogin")
	WebElement LoginButton;

public OrangeLoginpage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
public void uname(String user) {
	username.sendKeys(user);
	}


public void pword(String pass) {
	pwd.sendKeys(pass);
} 
	
	

public void clicklogin() {
	LoginButton.click();
	
	
}

}

	

	
	

