package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers{
	
	public FormCRegisterPage clickOnSignUp() {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new FormCRegisterPage();
		
	}

}
