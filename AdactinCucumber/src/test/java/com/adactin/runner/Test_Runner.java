package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com.adactin.stepdefinition", monochrome = true, plugin = {
		"html:Report/cucumber_Html_Report", "json:Report/cucumber_Json_Report.json","pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html" })

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		driver = Base_Class.brouserLaunch("chrome");
	}

	@AfterClass
	public static void set_Down() {

		System.out.println("login done");

	}
}
