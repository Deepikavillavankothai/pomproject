package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions
	(
			features = "C:\\Users\\Deepi\\git\\pomproject\\github.com\\Deepikavillavankothai\\pomproject.git\\POMproject\\src\\test\\resource\\Feature File",
					 plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
			"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
			glue = {"com.StepDefinition"}
	)
	public class TestRunner 
	{
		 @AfterClass
	     public static void extendReport()
	   {
	       Reporter.loadXMLConfig("C:\\Users\\Deepi\\git\\pomproject\\github.com\\Deepikavillavankothai\\pomproject.git\\POMproject\\src\\test\\resource\\extent-config.xml");
	       Reporter.setSystemInfo("user", System.getProperty("user.name"));
	       Reporter.setSystemInfo("os", "Windows");
	       Reporter.setTestRunnerOutput("Sample test runner output message");
	   }

}

