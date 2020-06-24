package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_OrangeHrm {
	
	WebDriver driver;
	
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	@FindBy(id="menu_admin_UserManagement")
	WebElement user;
	@FindBy(id="searchSystemUser_userName")
    WebElement username;
	@FindBy(id="searchSystemUser_userType")
	WebElement role;
	@FindBy(name="searchSystemUser[employeeName][empName]")
	WebElement empname;
}
