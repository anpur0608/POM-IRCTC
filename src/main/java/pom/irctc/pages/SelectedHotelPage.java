package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectedHotelPage extends GenericWrappers{
	
	public SelectedHotelPage nextWindow() {
		switchToLastWindow();
		return this;
	}
	
	public PersonalDetailsPage clickOnContinueToBook() {
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-2']");
		return new PersonalDetailsPage();
	}

}
