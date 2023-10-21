package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers{
	
	public AccountPage  clickOnCreataAccount() {
		
		clickByXpath("//a[text()='Create new account']");
		
		return new AccountPage();
	} 

}
