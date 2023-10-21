package pom.facebook.pages;

import wrappers.GenericWrappers;

public class AccountPage extends GenericWrappers{
	
	public AccountPage enterFristName(String fristName) {
		enterByXpath("//input[@name='firstname']", fristName);
		return this;
	}
	public AccountPage enterSurName(String surName) {
		enterByXpath("//input[@name='lastname']", surName);
		return this;
	}
	public AccountPage enterEmail(String email) {
		enterByXpath("//input[@name='reg_email__']", email);
		return this;
	}
	public AccountPage enterConfrimEmail(String confrimEmail) {
		enterByXpath("//input[@name='reg_email_confirmation__']", confrimEmail);
		return this;
	}
	public AccountPage enterPassword(String password) {
		enterByXpath("//input[@name='reg_passwd__']", password);
		return this;
	}
	public AccountPage selectDay(String day) {
		selectVisibleTextByXpath("//select[@id='day']", day);
		return this;
	}
	public AccountPage waitTime() {
		waitProperty(7000);
		return this;
	}
	public AccountPage selectMonth(String month) {
		selectVisibleTextByXpath("//select[@id='month']", month);
		return this;
	}
	public AccountPage selectYear(String year) {
		selectVisibleTextByXpath("//select[@id='year']", year);
		return this;
	}
	public AccountPage clickOnGender(String gender) {
		clickByXpath("//label[text()='"+gender+"']");
		return this;
	}
	
}
