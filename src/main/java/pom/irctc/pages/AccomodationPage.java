package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers{
	
	public AccomodationPage nextWindow() {
		switchToLastWindow();
		return this;
	}
	public HotelBookingHomePage clickOnHotel() {
		clickByXpath("//span[text()='Hotels']");
		return new HotelBookingHomePage();
	}
	
	public AccomodationPage clickOnMenu() {
		clickByXpath("//a[@class='nav-link loginicon']");
		return this;	
	}
	
	public ChaterPage clickOnChater() {
		clickByXpath("//a[text()='Charter']");
		return new ChaterPage();
	}
	public FtrServicesHomePage clickOnBookYourCoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new FtrServicesHomePage();
	}

}
