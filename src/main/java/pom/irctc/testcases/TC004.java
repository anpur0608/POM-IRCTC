package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC004";
		description = "To verify hotel booking with otp";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetName = "TC004";
	}
	@Test(dataProvider = "fetchData")
	
	public void bookHotelsOtpValidation(String email,String mobileNumber,String destination,String room,String adults,String title,String fristName,String lastName,String country,String state,String gst,String text) {
		
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
		.scrollDown()
		.waitTime()
		.clickOnContinue()
		.clickOnCheckBox()
		.clickOnMakePayment()
		.waitTime()
		.clickOnVerify()
		.verifytext(text);
		
	}

}
