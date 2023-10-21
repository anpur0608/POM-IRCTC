package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsSelectingPage extends GenericWrappers{
	
	public HotelsSelectingPage waitTime() {
		waitProperty(9000);
		return this;
	}
	
	public SelectedHotelPage clickOnFirstHotel() {
		clickByXpath("(//div[@class='mid-searchpack'])[1]");
		return new SelectedHotelPage();
	}

}
