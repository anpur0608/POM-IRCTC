package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers{
	
	public GuestLoginPage clickOnGuestLogin() {
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
	}
	public GuestLoginPage enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	public GuestLoginPage enterMobileNo(String mobileNo) {
		enterByXpath("//input[@name='mobileNo']", mobileNo);
		return this;
	}
	public HotelBookingHomePage clickOnLogin() {
		clickByXpath("(//button[text()='Login'])[2]");
		return new HotelBookingHomePage();
	}

}
