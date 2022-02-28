Feature: Adactin Hotel Booking Application 
Scenario: Login Functionality 
	Given User Launch The Adactin Appliction 
	When  User Enters The Username In The  Username InputBox 
	And   User Enters The Password  In The Password InputBox 
	Then User Clicks The Login Button And It Navigates To The Search Hotel Page 
	
Scenario: Searching Functionality 
	When User Selects The Location From The Dropdown 
	And User Selects the Hotel from the Dropdown 
	And User Selects the Room Type from the Dropdown 
	And User Selects the Date pickup from the Dropdown 
	And User Selects the Date Pickout from the Dropdown 
	And User Selects the Adult Room from the Dropdown 
	And User Selects the Child Room from the Dropdown 
	And User Selects the Room Nos from the Dropdown 
	Then User Clicks The Search Button and it navigates to the Select Hotel Page 
	
Scenario: Selection Functionality 
	When User Clicks the Hotel from the Radio Buttton 
	Then User CLicks the Submit and it Navigates to the Booking Hotel Page 
	
Scenario: Booking Functionality 
	When User Enters the First Name in the Input box 
	And User Enters the Last Name in the Input box 
	And User Enters the Address in the Input box 
	And User Enters the Credit Card NUmber in the Input box 
	And User Enters the Cvv Number in the Input box 
	And User Enters the Expiry Month in the Input box 
	And User Enters the Expiry Year in the Input box 
	And User Enters the Credit Crad Type in the Input box 
	Then User Click on the Book now Button and it Navigates To the Logout Page 
	
Scenario: Logout Functionlity 
	When User Clicks On the Logout Button And it Closes The Window 
