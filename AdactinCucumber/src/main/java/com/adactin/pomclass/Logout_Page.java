package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	
	
	@FindBy(xpath = "//a[@href='Logout.php']")
	private WebElement logout;
	private WebDriver driver;

	public WebElement getLogout() {
		return logout;
	}
	
	public Logout_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
}}
