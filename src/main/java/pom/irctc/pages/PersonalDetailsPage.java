package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers{
	
	public PersonalDetailsPage nextWindow() {
		switchToLastWindow();
		return this;
	}
	
	public PersonalDetailsPage selectTitle(String title) {
		selectVisibleTextByXpath("//select[@name='title']", title);
		return this;
	}
	public PersonalDetailsPage  enterFirstName(String firstName) {
		enterByXpath("//input[@name='firstName']", firstName);
		return this;
	}
	public PersonalDetailsPage  enterLastName(String lastName) {
		enterByXpath("//input[@name='lastName']", lastName);
		return this;
	}
	public PersonalDetailsPage selectCountry(String country) {
		selectVisibleTextByXpath("//select[@name='country']", country);
		return this;
	}
	public PersonalDetailsPage selectState(String state) {
		selectVisibleTextByXpath("//select[@name='state']", state);
		return this;
	}
	public PersonalDetailsPage selectGst(String gst) {
		selectVisibleTextByXpath("//select[@name='gst']", gst);
		return this;
	}
	public PersonalDetailsPage  enterConpanyName(String companyName) {
		enterByXpath("//input[@name='companyName']", companyName);
		return this;
	}
	public PersonalDetailsPage  enterCompanyAddress(String companyAddress) {
		enterByXpath("//input[@name='companyAddress']", companyAddress);
		return this;
	}
	public PersonalDetailsPage clickOnContinueWithGst() {
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
		return this;
	}
	public PersonalDetailsPage  verifyTextOnGst(String text) {
		verifyTextContainsByXpath("//span[text()='gstNumber is required.']", text);
		return this;
	}
	public PersonalDetailsPage scrollDown() {
		pageDown();
		return this;
	}
	public PersonalDetailsPage waitTime() {
		waitProperty(7000);
		return this;
	}
	public PaymentsPage clickOnContinue() {
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
		return new PaymentsPage();
	}
	

}
