package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrServicesHomePage extends GenericWrappers {
	
	public FtrServicesHomePage nextWindow() {
		switchToLastWindow();
		return this;
	}
	public FtrSignUpPage clickOnSignUp() {
		clickByXpath("//a[text()='New User? Signup']");
		return new FtrSignUpPage();
	}

}
