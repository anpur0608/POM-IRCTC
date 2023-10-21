package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC003";
		description = "To verify the irctc for the saloon check ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetName = "TC003";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void saloonMandatoryCheck(String name,String organization,String address,String mobileNumber,String email,String request,String origStation,String destStation,String tourDuration,String coaches,String passengers,String purpose,String additionalServices) {
		
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.nextWindow()
		.clickOnMenu()
		.clickOnChater()
		.nextWindow()
		.clickOnCloseMenu()
		.clickOnEnquiryForm()
		.enterName(name)
		.enterOrganisationName(organization)
		.enterAddress(address)
		.enterMobileNo(mobileNumber)
		.enterEmail(email)
		.selectRequest(request)
		.enterOriginStation(origStation)
		.enterDestnStation(destStation)
		.clickOnDepartureDate()
		.clickOnDepartureMonth()
		.clickOnDepartureDay()
		.clickOnArrivalDate()
		.clickOnArrivalMonth()
		.waitTime()
		.clickOnArrivalDay()
		.enterDuration(tourDuration)
		.enterCoachesRequired(coaches)
		.enterNoOfPassengers(passengers)
		.enterPurposeOfChater(purpose)
		.enterAdditionalServices(additionalServices);
		
		
	}

}
