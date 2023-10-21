package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage enterUserName(String userName) {
		enterByXpath("//input[@id='userName']", userName);
		return this;
	}
	public RegistrationPage enterPassword(String password) {
		enterByXpath("//input[@id='usrPwd']", password);
		return this;
	}
	public RegistrationPage enterConfrimPassword(String confrimPassword) {
		enterByXpath("//input[@id='cnfUsrPwd']", confrimPassword);
		return this;
	}
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath("//span[text()='Preferred Language']");
		return this;
	}
	public RegistrationPage clickOnSelectedLanguage() {
		clickByXpath("//span[text()='English']");
		return this;
	}
	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath("//span[text()='Security Question']");
		return this;
	}
	public RegistrationPage clickOnSelectedSecurityQuestion() {
		clickByXpath("//span[text()='What is your pet name?']");
		return this;
	}
	public RegistrationPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath("//input[@placeholder='Security Answer']", securityAnswer);
		return this;
	}
	public RegistrationPage clickOnContinue() {
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	public RegistrationPage enterFristName(String fristName) {
		enterByXpath("//input[@id='firstName']", fristName);
		return this;
	}
	public RegistrationPage enterMiddleName(String middleName) {
		enterByXpath("//input[@id='middleName']", middleName);
		return this;
	}
	public RegistrationPage enterLastName(String lastName) {
		enterByXpath("//input[@id='lastname']",lastName );
		return this;
	}
	public RegistrationPage clickOnOccupation() {
		clickByXpath("//span[text()='Select Occupation']");
		return this;
	}
	public RegistrationPage clickOnSelectedOccupation() {
		clickByXpath("//span[text()='PRIVATE']");
		return this;
	}
	public RegistrationPage clickOnDob() {
		clickByXpath("//input[@placeholder='Date Of Birth']");
		return this;
	}	
	public RegistrationPage selectYear(String year) {
		selectVisibleTextByXpath("(//select[@tabindex='0'])[2]",year );
		return this;
	}	
	public RegistrationPage selectMonth(String month ) {
		selectVisibleTextByXpath("(//select[@tabindex='0'])[1]", month);
		return this;
	}	
	public RegistrationPage clickOnDate() {
		clickByXpath("(//a[@draggable='false'])[6]");
		return this;
	}	
	public RegistrationPage clickOnUnmarried() {
		clickByXpath("(//div[@role='radio'])[2]");
		return this;
	}	
	public RegistrationPage selectCountry(String country) {
		enterByXpath("//select[@formcontrolname='resCountry']", country);
		return this;
	}	
	public RegistrationPage clickOnGender() {
		clickByXpath("//div[@aria-label='Male']");
		return this;
	}	
	public RegistrationPage enterEmail(String email ) {
		enterByXpath("//input[@id='email']",email );
		return this;
	}
	public RegistrationPage entermobileNumber(String mobileNumber) {
		enterByXpath("//input[@id='mobile']",mobileNumber );
		return this;
	}
	public RegistrationPage selectNationality(String nationality ) {
		selectVisibleTextByXpath("//select[@formcontrolname='nationality']", nationality);
		return this;
	}
	public RegistrationPage clickOnContinue1() {
		clickByXpath("(//button[@type='submit'])[2]");
		return this;
	}
	public RegistrationPage enterFlatNo(String flatNo) {
		enterByXpath("//input[@id='resAddress1']", flatNo);
		return this;
	}
	public RegistrationPage enterStreet(String street) {
		enterByXpath("//input[@id='resAddress2']",street );
		return this;
	}
	public RegistrationPage enterArea(String area) {
		enterByXpath("//input[@id='resAddress3']",area );
		return this;
	}
	public RegistrationPage enterPinCode(String pinCode) {
		enterByXpath("//input[@name='resPinCode']", pinCode);
		return this;
	}
	public RegistrationPage enterState(String state) {
		enterByXpath("//input[@id='resState']", state);
		return this;
	}
	public RegistrationPage waitTime() {
		waitProperty(10000);
		return this;
	}
	public RegistrationPage selectCity(String City) {
		selectVisibleTextByXpath("//select[@formcontrolname='resCity']", City);
		return this;
	}
	public RegistrationPage selectPostOffice(String postOffice) {
		selectVisibleTextByXpath("//select[@formcontrolname='resPostOff']", postOffice);
		return this;
	}
	public RegistrationPage enterPhoneNumber(String phoneNumber) {
		enterByXpath("//input[@id='resPhone']",phoneNumber );
		return this;
	}
	public RegistrationPage clickOnNo() {
		clickByXpath("(//div[@class='ui-radiobutton ui-widget'])[4]");
		return this;
	}
	public RegistrationPage enterOfficeFlatNo(String officeFlatNo) {
		enterByXpath("//input[@id='offAddress1']", officeFlatNo);
		return this;
	}
	public RegistrationPage enterOfficestreet(String officeStreet) {
		enterByXpath("//input[@id='offAddress2']",officeStreet );
		return this;
	}
	public RegistrationPage enterOfficeArea(String officeArea) {
		enterByXpath("//input[@id='offAddress3']", officeArea);
		return this;
	}
	public RegistrationPage clickOnOfficeCountry() {
		clickByXpath("//span[text()='Select a Country']");
		return this;
	}
	public RegistrationPage clickOnOfficeSelectedCountry() {
		clickByXpath("//li[@aria-label='India']");
		return this;
	}
	public RegistrationPage enterOfficePinCode(String officePinCode) {
		enterByXpath("//input[@id='offPinCode']", officePinCode);
		return this;
	}
	public RegistrationPage enterOfficeState(String officeState) {
		enterByXpath("//input[@id='offState']", officeState);
		return this;
	}
	public RegistrationPage enterOfficeCity(String officecity) {
		enterByXpath("//input[@id='offCity']", officecity);
		return this;
	}
	public RegistrationPage enterOfficePostOffice(String officePostOffice) {
		enterByXpath("//input[@id='offPostOff']", officePostOffice);
		return this;
	}
	public RegistrationPage enterOfficePhone(String officePhone) {
		enterByXpath("//input[@id='offPhone']", officePhone);
		return this;
	}
}
