package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	 private WebDriver driver;
		
		@FindBy(xpath = "//select[@name='location']")
		private WebElement location;
		@FindBy(name = "hotels")
		private WebElement hotels;
		@FindBy(name = "room_type")
		private WebElement roomtype;
		@FindBy(name = "room_nos")
		private WebElement roomnos;
		@FindBy(name = "datepick_in")
		private WebElement datepickin;
		@FindBy(name = "datepick_out")
		private WebElement datepickout;
		@FindBy(name = "adult_room")
		private WebElement adultroom;
		@FindBy(name = "child_room")
		private WebElement childroom;
		@FindBy(xpath = "//input[@id='Submit']")
		private WebElement Searchbtn;
		
		public WebDriver getDriver() {
			return driver;
		}
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRoomtype() {
			return roomtype;
		}
		public WebElement getRoomnos() {
			return roomnos;
		}
		public WebElement getDatepickin() {
			return datepickin;
		}
		public WebElement getDatepickout() {
			return datepickout;
		}
		public WebElement getAdultroom() {
			return adultroom;
		}
		public WebElement getChildroom() {
			return childroom;
		}
		
		public WebElement getSearchbtn() {
			return Searchbtn;
		}
		public Search_Hotel(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		
	}
	    
	    
	    
}
