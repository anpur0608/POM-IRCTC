package pom.irctc.pages;

import wrappers.GenericWrappers;

public class ChaterPage extends GenericWrappers{
	
	public ChaterPage nextWindow() {
		switchToLastWindow();
		return this;
	}
	public ChaterPage clickOnCloseMenu() {
		clickByXpath("//i[@class='fas fa-arrow-right']");
		return this;
	}
	public ChaterPage clickOnEnquiryForm() {
		clickByXpath("//a[text()='Enquiry Form']");
		return this;
	}
	public ChaterPage enterName(String name) {
		enterByXpath("//input[@name='name']", name);
		return this;
	}
	public ChaterPage enterOrganisationName(String organisationName) {
		enterByXpath("//input[@name='organization']", organisationName);
		return this;
	}
	public ChaterPage enterAddress(String address) {
		enterByXpath("//input[@name='address']", address);
		return this;
	}
	public ChaterPage enterMobileNo(String mobileNo) {
		enterByXpath("//input[@name='mobile']",mobileNo );
		return this;
	}
	public ChaterPage enterEmail(String email) {
		enterByXpath("(//input[@name='email'])[1]", email);
		return this;
	}
	public ChaterPage selectRequest(String request) {
		selectVisibleTextByXpath("//select[@name='requestFor']", request);
		return this;
	}
	public ChaterPage enterOriginStation(String originStation) {
		enterByXpath("//input[@name='originStation']", originStation);
		return this;
	}
	public ChaterPage enterDestnStation(String destnStation) {
		enterByXpath("//input[@name='destnStation']", destnStation);
		return this;
	}
	public ChaterPage clickOnDepartureDate() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	public ChaterPage clickOnDepartureMonth() {
		clickByXpath("(//span[@class='glyphicon glyphicon-chevron-right'])[1]");
		return this;
	}
	public ChaterPage clickOnDepartureDay() {
		clickByXpath("//span[text()='20']");
		return this;
	}
	public ChaterPage clickOnArrivalDate() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	
	public ChaterPage clickOnArrivalMonth() {
		clickByXpath("(//span[@class='glyphicon glyphicon-chevron-right'])[3]");
		return this;
	}
	public ChaterPage scrollDown() {
		pageDown();
		return this;
	}
	public ChaterPage waitTime() {
		waitProperty(7000);
		return this;
	}
	public ChaterPage clickOnArrivalDay() {
		clickByXpath("(//span[text()='25'])[2]");
		return this;
	}
	public ChaterPage enterDuration(String duration) {
		enterByXpath("//input[@name='durationPeriod']", duration);
		return this;
	}
	public ChaterPage enterCoachesRequired(String coachesRequired) {
		enterByXpath("//input[@name='coachDetails']", coachesRequired);
		return this;
	}
	public ChaterPage enterNoOfPassengers(String noOfPassengers) {
		enterByXpath("//input[@name='numPassenger'][1]", noOfPassengers);
		return this;
	}
	public ChaterPage enterPurposeOfChater(String purposeOfChater) {
		enterByXpath("//textarea[@name='charterPurpose']", purposeOfChater);
		return this;
	}
	public ChaterPage enterAdditionalServices(String additionalServices) {
		enterByXpath("//textarea[@name='services']", additionalServices);
		return this;
	}

}
