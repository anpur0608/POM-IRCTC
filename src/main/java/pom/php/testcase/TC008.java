package pom.php.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpHomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC008";
		description = "To verify phptravels the sign up for new user ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.phptravels.org/login";
		sheetName = "TC008";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void phpTarvels(String firstName,String lastName,String email,String phoneNumber,String companyName,String streetName,
			String areaName,String city,String state,String pinCode,String country,String alternatePhone,String password,String
			confrimPassword) {
		
		new PhpHomePage()
		
		.clickOnCreataAccount()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.clickOnCountryCode()
		.clickOnSelectedCode()
		.enterPhoneNumber(phoneNumber)
		.enterCompanyName(companyName)
		.enterStreet(streetName)
		.enterArea(areaName)
		.enterCity(city)
		.enterState(state)
		.enterPinCode(pinCode)
		.selectCountry(country)
		.enterMobileNumber(alternatePhone)
		.enterPassword(password)
		.enterConfrimPassword(confrimPassword);
		
		
		
		
		
		
		
		
	}

}
