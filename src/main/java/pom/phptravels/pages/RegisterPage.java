package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class RegisterPage extends GenericWrappers{
	
	public RegisterPage enterFirstName(String firstName) {
		enterByXpath("//input[@id='inputFirstName']", firstName);
		return this;
	}
	public RegisterPage enterLastName(String lastName) {
		enterByXpath("//input[@id='inputLastName']", lastName);
		return this;
	}
	public RegisterPage enterEmail(String email) {
		enterByXpath("//input[@id='inputEmail']", email);
		return this;
	}
	public RegisterPage clickOnCountryCode() {
		clickByXpath("//div[@class='selected-dial-code']");
		return this;
	}
	public RegisterPage clickOnSelectedCode() {
		clickByXpath("//span[text()='India (भारत)']");
		return this;
	}
	public RegisterPage enterPhoneNumber(String phoneNumber) {
		enterByXpath("//input[@id='inputPhone']", phoneNumber);
		return this;
	}
	public RegisterPage enterCompanyName(String companyName) {
		enterByXpath("//input[@id='inputCompanyName']", companyName);
		return this;
	}
	public RegisterPage enterStreet(String street) {
		enterByXpath("//input[@id='inputAddress1']", street);
		return this;
	}
	public RegisterPage enterArea(String area) {
		enterByXpath("//input[@id='inputAddress2']",area);
		return this;
	}
	public RegisterPage enterCity(String city) {
		enterByXpath("//input[@id='inputCity']",city );
		return this;
	}
	public RegisterPage enterState(String state) {
		enterByXpath("//input[@id='stateinput']", state);
		return this;
	}
	public RegisterPage enterPinCode(String pinCode) {
		enterByXpath("//input[@id='inputPostcode']", pinCode);
		return this;
	}
	public RegisterPage selectCountry(String country) {
		selectVisibleTextByXpath("//select[@id='inputCountry']", country);
		return this;
	}
	public RegisterPage enterMobileNumber(String mobileNumber) {
		enterByXpath("//input[@id='customfield2']", mobileNumber);
		return this;
	}
	public RegisterPage enterPassword(String password) {
		enterByXpath("//input[@id='inputNewPassword1']", password);
		return this;
	}
	public RegisterPage enterConfrimPassword(String confrimPassword) {
		enterByXpath("//input[@id='inputNewPassword2']", confrimPassword);
		return this;
	}
	
}
