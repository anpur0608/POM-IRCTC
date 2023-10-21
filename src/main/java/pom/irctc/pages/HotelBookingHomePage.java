package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingHomePage extends GenericWrappers {
	
	public HotelBookingHomePage nextWindow() {
		switchToLastWindow();
		return this;
	}
	
	public GuestLoginPage clickOnMenu() {
		clickByXpath("//a[text()='Login']");
		return new GuestLoginPage();
	}
	public HotelBookingHomePage waitTime() {
		waitProperty(9000);
		return this; 
	}
	public HotelBookingHomePage enterCity(String city) {
		enterByXpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']", city);
		return this;
	}
	public HotelBookingHomePage clickOnselectedCity() {
		clickByXpath("(//div[@class='left_city'])[1]");
		return this;
	}
	public HotelBookingHomePage clickOnCheckIn() {
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	public HotelBookingHomePage clickOnMonth() {
		clickByXpath("//button[@aria-label='Next month']");
		return this;
	}
	public HotelBookingHomePage clickOnDateIn() {
		clickByXpath("//td[@aria-label='05/09/2023']");
		return this;
	}
	public HotelBookingHomePage clickOnCheckOut() {
		clickByXpath("//input[@name='dt13']");
		return this;
	}
	public HotelBookingHomePage clickOnDateOut() {
		clickByXpath("//td[@aria-label='08/09/2023']");
		return this;
	}
	public HotelBookingHomePage clickOnRoomAndAdults() {
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}
	public HotelBookingHomePage selectRoom(String room) {
		selectVisibleTextByXpath("//select[@name='hotelRoom']", room);
		return this;
	}
	public HotelBookingHomePage selectAdults(String adults) {
		selectVisibleTextByXpath("//select[@name='hotelAdult']", adults);
		return this;
	}
	public HotelBookingHomePage clickOnDone() {
		clickByXpath("//a[text()='Done']");
		return this;
	}
	public HotelsSelectingPage clickOnSearchHotel() {
		clickByXpath("//input[@value='Search Hotel']");
		return new HotelsSelectingPage();
	}

}
