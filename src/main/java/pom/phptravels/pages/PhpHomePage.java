package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpHomePage extends GenericWrappers{
	
	public RegisterPage clickOnCreataAccount() {
		clickByXpath("//a[text()='Create account']");
		return new RegisterPage();
	}

}
