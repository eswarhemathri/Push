package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	
	 private WebDriver driver;
		
		@FindBy(name = "radiobutton_0")
		private WebElement radiobutton;
		
		@FindBy(name = "continue")
		private WebElement submit;

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getRadiobutton() {
			return radiobutton;
		}

		public WebElement getSubmit() {
			return submit;
		}
		public Select_Hotel(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		
	}
}
