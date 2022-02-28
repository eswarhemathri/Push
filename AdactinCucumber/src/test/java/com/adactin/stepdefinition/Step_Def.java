package com.adactin.stepdefinition;

import com.adactin.baseclass.Base_Class;
import com.adactin.pomclass.Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Base_Class {

	// public static Login_Page login = new Login_Page(driver);

	public static com.adactin.pomclass.Page_Object_Manager pom = new com.adactin.pomclass.Page_Object_Manager(driver);

	@Given("^User Launch The Adactin Appliction$")
	public void user_Launch_The_Adactin_Appliction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		launchUrl("http://adactinhotelapp.com/");

//	    throw new PendingException();
	}

	@When("^User Enters The Username In The  Username InputBox$")
	public void user_Enters_The_Username_In_The_Username_InputBox() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		sendKeys(pom.get_Instance_login().getUsername(), "vijayaeswar");

//	    throw new PendingException();
	}

	@When("^User Enters The Password  In The Password InputBox$")
	public void user_Enters_The_Password_In_The_Password_InputBox() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		sendKeys(pom.get_Instance_login().getPassword(), "ER886J");

//	    throw new PendingException();
	}

	@Then("^User Clicks The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actionClick(pom.get_Instance_login().getLoginbtn());
//	    throw new PendingException();
	}

	@When("^User Selects The Location From The Dropdown$")
	public void user_Selects_The_Location_From_The_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyText(pom.get_Instance_searching().getLocation(), "London");
		// throw new PendingException();
	}

	@When("^User Selects the Hotel from the Dropdown$")
	public void user_Selects_the_Hotel_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyText(pom.get_Instance_searching().getHotels(), "Hotel Sunshine");
		// throw new PendingException();
	}

	@When("^User Selects the Room Type from the Dropdown$")
	public void user_Selects_the_Room_Type_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyText(pom.get_Instance_searching().getRoomtype(), "Standard");
		// throw new PendingException();
	}

	@When("^User Selects the Room Nos from the Dropdown$")
	public void user_Selects_the_Room_Nos_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		selectbyValue(pom.get_Instance_searching().getRoomnos(), "2");
	}

	@When("^User Selects the Date pickup from the Dropdown$")
	public void user_Selects_the_Date_pickup_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_searching().getDatepickin(), "14/02/2022");
		// throw new PendingException();
	}

	@When("^User Selects the Date Pickout from the Dropdown$")
	public void user_Selects_the_Date_Pickout_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_searching().getDatepickout(), "14/02/2022");
		// throw new PendingException();
	}

	@When("^User Selects the Adult Room from the Dropdown$")
	public void user_Selects_the_Adult_Room_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyIndex(pom.get_Instance_searching().getAdultroom(), 2);
		// throw new PendingException();
	}

	@When("^User Selects the Child Room from the Dropdown$")
	public void user_Selects_the_Child_Room_from_the_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyIndex(pom.get_Instance_searching().getChildroom(), 2);
		// throw new PendingException();
	}

	@Then("^User Clicks The Search Button and it navigates to the Select Hotel Page$")
	public void user_Clicks_The_Search_Button_and_it_navigates_to_the_Select_Hotel_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actionClick(pom.get_Instance_searching().getSearchbtn());
		// throw new PendingException();
	}

	@When("^User Clicks the Hotel from the Radio Buttton$")
	public void user_Clicks_the_Hotel_from_the_Radio_Buttton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actionClick(pom.get_Instance_selection().getRadiobutton());
		// throw new PendingException();
	}

	@Then("^User CLicks the Submit and it Navigates to the Booking Hotel Page$")
	public void user_CLicks_the_Submit_and_it_Navigates_to_the_Booking_Hotel_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actionClick(pom.get_Instance_selection().getSubmit());
		// throw new PendingException();
	}

	@When("^User Enters the First Name in the Input box$")
	public void user_Enters_the_First_Name_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_booking().getFirstname(), "Eswar");
		// throw new PendingException();
	}

	@When("^User Enters the Last Name in the Input box$")
	public void user_Enters_the_Last_Name_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_booking().getLastname(), "Eswar");
		// throw new PendingException();
	}

	@When("^User Enters the Address in the Input box$")
	public void user_Enters_the_Address_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_booking().getAddress(), "asdfghjklqwer");
		// throw new PendingException();
	}

	@When("^User Enters the Credit Card NUmber in the Input box$")
	public void user_Enters_the_Credit_Card_NUmber_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_booking().getCcnum(), "1234567899638527");
		// throw new PendingException();
	}

	@When("^User Enters the Credit Crad Type in the Input box$")
	public void user_Enters_the_Credit_Crad_Type_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyText(pom.get_Instance_booking().getCctype(), "VISA");
		// throw new PendingException();
	}

	@When("^User Enters the Expiry Month in the Input box$")
	public void user_Enters_the_Expiry_Month_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyValue(pom.get_Instance_booking().getCcexpmonth(), "11");
		// throw new PendingException();
	}

	@When("^User Enters the Expiry Year in the Input box$")
	public void user_Enters_the_Expiry_Year_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		selectbyValue(pom.get_Instance_booking().getCcexpyear(), "2022");
		// throw new PendingException();
	}

	@When("^User Enters the Cvv Number in the Input box$")
	public void user_Enters_the_Cvv_Number_in_the_Input_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sendKeys(pom.get_Instance_booking().getCccvv(), "125");
		// throw new PendingException();
	}

	@Then("^User Click on the Book now Button and it Navigates To the Logout Page$")
	public void user_Click_on_the_Book_now_Button_and_it_Navigates_To_the_Logout_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actionClick(pom.get_Instance_booking().getBooknow());
		// throw new PendingException();
	}

	@When("^User Clicks On the Logout Button And it Closes The Window$")
	public void user_Clicks_On_the_Logout_Button_And_it_Closes_The_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		actionClick(pom.get_Instance_logout().getLogout());
		// throw new PendingException();
	}

}
