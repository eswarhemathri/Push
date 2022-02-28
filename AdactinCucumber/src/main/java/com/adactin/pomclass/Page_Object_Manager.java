package com.adactin.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {

	private WebDriver driver;
	
	private Login_Page login;
	private Select_Hotel selection;
	private Search_Hotel searching;
	private Logout_Page logout;
	private Book_Hotel booking;
	
	
	public Login_Page get_Instance_login() {
		login = new Login_Page(driver);
		return login;
		}
	
	public Search_Hotel get_Instance_searching() {
		searching = new Search_Hotel(driver);
		return searching;
		}
	
	public Select_Hotel get_Instance_selection() {
		selection = new Select_Hotel(driver);
		return selection;
		}
	
	public Book_Hotel get_Instance_booking() {
		booking = new Book_Hotel(driver);
		return booking;
		}
	
	public Logout_Page get_Instance_logout() {
		logout = new Logout_Page(driver);
		return logout;
		}
	
	
	public Page_Object_Manager(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}