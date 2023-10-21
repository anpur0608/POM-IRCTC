package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC005";
		description = "To verify hotel booking with gst ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetName = "TC005";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void bookHotelsGstValidation(String email,String mobileNumber,String destination,String room,String adults,String title,String fristName,String lastName,String country,String state,String gst,String companyName,String companyAddress,String text) {
				
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.nextWindow()
		.clickOnHotel()
		.nextWindow()
		.clickOnMenu()
		.clickOnGuestLogin()
		.enterEmail(email)
		.enterMobileNo(mobileNumber)
		.clickOnLogin()
		.waitTime()
		.enterCity(destination)
		.waitTime()
		.clickOnselectedCity()
		.waitTime()
		.clickOnCheckIn()
		.waitTime()
		.clickOnMonth()
		.waitTime()
		.clickOnDateIn()
		.waitTime()
		.clickOnCheckOut()
		.waitTime()
		.clickOnDateOut()
		.clickOnRoomAndAdults()
		.selectRoom(room)
		.selectAdults(adults)
		.waitTime()
		.clickOnDone()
		.clickOnSearchHotel()
		.waitTime()
		.clickOnFirstHotel()
		.nextWindow()
		.clickOnContinueToBook()
		.selectTitle(title)
		.enterFirstName(fristName)
		.enterLastName(lastName)
		.selectCountry(country)
		.selectState(state)
		.selectGst(gst)
		.enterConpanyName(companyName)
		.enterCompanyAddress(companyAddress)
		.scrollDown()
		.waitTime()
		.clickOnContinueWithGst()
		.waitTime()
		.verifyTextOnGst(text);
		
		
		
	
		
	}

}
