package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrSignUpPage extends GenericWrappers{
	
	public FtrSignUpPage nextWindow() {
		switchToLastWindow();
		return this;
	}
	public FtrSignUpPage enterUserId(String userId) {
		enterByXpath("//input[@id='userId']", userId);
		return this;
	}
	public FtrSignUpPage enterPassword(String password) {
		enterByXpath("//input[@id='password']", password);
		return this;
	}
	public FtrSignUpPage enterConfrimPassword(String confrimPassword) {
		enterByXpath("//input[@id='cnfPassword']", confrimPassword);
		return this;
	}
	public FtrSignUpPage selectSecurityQuestion(String securityQuestion) {
		selectVisibleTextByXpath("//select[@id='secQstn']", securityQuestion);
		return this;
	}
	public FtrSignUpPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath("//input[@id='secAnswer']", securityAnswer);
		return this;
	}
	public FtrSignUpPage clickOnDob() {
		clickByXpath("//input[@id='dateOfBirth']");
		return this;
	}
	public FtrSignUpPage selectYear(String year) {
		selectVisibleTextByXpath("//select[@aria-label='Select year']", year);
		return this;
	}
	public FtrSignUpPage selectMonth(String month) {
		selectVisibleTextByXpath("//select[@aria-label='Select month']", month);
		return this;
	}
	public FtrSignUpPage clickOnDate() {
		clickByXpath("//a[text()='17']");
		return this;
	}
	public FtrSignUpPage clickOnGender() {
		clickByXpath("//input[@id='gender0']");
		return this;
	}
	public FtrSignUpPage clickOnMaritalStatus() {
		clickByXpath("//input[@id='maritalStatus1']");
		return this;
	}
	public FtrSignUpPage enterEmail(String email) {
		enterByXpath("//input[@id='email']", email);
		return this;
	}
	public FtrSignUpPage selectOccupation(String occupation) {
		selectVisibleTextByXpath("//select[@id='occupation']", occupation);
		return this;
	}
	public FtrSignUpPage enterFirstName(String firstName) {
		enterByXpath("//input[@id='fname']", firstName);
		return this;
	}
	public FtrSignUpPage enterMiddleName(String middleName) {
		enterByXpath("//input[@id='mname']", middleName);
		return this;
	}
	public FtrSignUpPage enterLastName(String lastName) {
		enterByXpath("//input[@id='lname']", lastName);
		return this;
	}
	public FtrSignUpPage selectNationality(String nationality) {
		selectVisibleTextByXpath("//select[@id='natinality']", nationality);
		return this;
	}
	public FtrSignUpPage enterFlatNo(String flatNo) {
		enterByXpath("//input[@id='flatNo']", flatNo);
		return this;
	}
	public FtrSignUpPage enterStreet(String street) {
		enterByXpath("//input[@id='street']", street);
		return this;
	}
	public FtrSignUpPage enterArea(String area) {
		enterByXpath("//input[@id='area']", area);
		return this;
	}
	public FtrSignUpPage selectCountry(String country) {
		selectVisibleTextByXpath("//select[@id='country']", country);
		return this;
	}
	public FtrSignUpPage enterMobileNo(String mobileNo) {
		enterByXpath("//input[@id='mobile']", mobileNo);
		return this;
	}
	public FtrSignUpPage enterPinCode(String pinCode) {
		enterByXpath("//input[@id='pincode']", pinCode);
		return this;
	}
	public FtrSignUpPage tabKey() {
		pressTabKeyByXpath("//input[@id='pincode']");
		return this;
	}
	public FtrSignUpPage selectCity(String city) {
		selectVisibleTextByXpath("//select[@id='city']", city);
		return this;
	}
	public FtrSignUpPage selectState(String state) {
		selectVisibleTextByXpath("//select[@id='state']", state);
		return this;
	}
	public FtrSignUpPage waitTime() {
		waitProperty(7000);
		return this;
	}
	public FtrSignUpPage selectPostOffice(String postOffice) {
		selectVisibleTextByXpath("//select[@id='postOffice']", postOffice);
		return this;
	}
	public FtrSignUpPage clickOnNo() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	public FtrSignUpPage enterOfficeFlatNo(String officeFlatNo) {
		enterByXpath("//input[@id='flatNoOffice']", officeFlatNo);
		return this;
	}
	public FtrSignUpPage enterOfficeStreet(String officeStreet) {
		enterByXpath("//input[@id='streetOffice']",officeStreet);
		return this;
	}
	public FtrSignUpPage enterOfficeArea(String officeArea) {
		enterByXpath("//input[@id='areaOffice']", officeArea);
		return this;
	}
	public FtrSignUpPage selectOfficeCountry(String officeCountry) {
		selectVisibleTextByXpath("//select[@id='countryOffice']", officeCountry);
		return this;
	}
	public FtrSignUpPage enterOfficeMobileNo(String officeMobileNo) {
		enterByXpath("//input[@id='mobileOffice']", officeMobileNo);
		return this;
	}
	public FtrSignUpPage enterOfficePincode(String officePincode) {
		enterByXpath("//input[@id='pincodeOffice']", officePincode);
		return this;
	}
	public FtrSignUpPage tabKeyOffice() {
		pressTabKeyByXpath("//input[@id='pincodeOffice']");
		return this;
	}
	public FtrSignUpPage selectOfficeCity(String officeCity) {
		selectVisibleTextByXpath("//select[@id='cityOffice']", officeCity);
		return this;
	}
	public FtrSignUpPage selectOfficeState(String officeState) {
		selectVisibleTextByXpath("//select[@id='stateOffice']", officeState);
		return this;
	}
	public FtrSignUpPage selectOfficePostOffice(String officePostOffice) {
		selectVisibleTextByXpath("//select[@id='postOfficeOffice']", officePostOffice);
		return this;
	}

}
