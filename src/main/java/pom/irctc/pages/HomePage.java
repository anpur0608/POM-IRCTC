package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public RegistrationPage clickOnRegister() {
		clickByXpath("//a[text()=' REGISTER ']");
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
	mouseHoverByXpath("//a[text()=' HOLIDAYS ']");
		return this;
	}
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath("(//span[text()='Stays'])[1]");
		return this;
	}
	public AccomodationPage clickOnLounge() {
		clickByXpath("(//span[text()='Lounge'])[1]");
		return new AccomodationPage();
	}
	

}
