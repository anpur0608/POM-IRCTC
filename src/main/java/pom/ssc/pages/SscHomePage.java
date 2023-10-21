package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SscHomePage extends GenericWrappers {
	
	public SscRegisterPage clickOnRegister() {
		clickByXpath("//a[text()='New User ? Register Now']");
		return new SscRegisterPage();
		
	}

}
