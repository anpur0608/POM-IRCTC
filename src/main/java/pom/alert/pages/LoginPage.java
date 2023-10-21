package pom.alert.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{

	
	public LoginPage clickOnLogin() {
		clickByXpath("//a[text()='Log in']");
		return this ;
	}
}
