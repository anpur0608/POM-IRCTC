package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC002";
		description = "To verify the ftr new user for the signup ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetName = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void bookYourCoach(String userId,String password,String confrimPassword,String secQuestion,String secAnswer,String year,String month,String email,String occupation,String fristName,String middleName,String lastName,String nationality,String flatNo,String street,String area,String country,String mobileNumber,String pinCode,String city,String state,String postOffice,String officeFlatNo,String officeStreet,String officeArea,String officeCountry,String officeMobileNumber,String officePinCode,String officeCity,String officeState,String officePostOffice) {
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.nextWindow()
		.clickOnMenu()
		.clickOnBookYourCoach()
		.nextWindow()
		.clickOnSignUp()
		.nextWindow()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfrimPassword(confrimPassword)
		.selectSecurityQuestion(secQuestion)
		.enterSecurityAnswer(secAnswer)
		.clickOnDob()
		.selectYear(year)
		.selectMonth(month)
		.clickOnDate()
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterEmail(email)
		.selectOccupation(occupation)
		.enterFirstName(fristName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.selectNationality(nationality)
		.enterFlatNo(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.selectCountry(country)
		.enterMobileNo(mobileNumber)
		.enterPinCode(pinCode)
		.tabKey()
		.selectCity(city)
		.selectState(state)
		.selectPostOffice(postOffice)
		.clickOnNo()
		.enterOfficeFlatNo(officeFlatNo)
		.enterOfficeStreet(officeStreet)
		.enterOfficeArea(officeArea)
		.selectOfficeCountry(officeCountry)
		.enterOfficeMobileNo(officeMobileNumber)
		.enterOfficePincode(officePinCode)
		.tabKeyOffice()
		.selectOfficeCity(officeCity)
		.selectOfficeState(officeState)
		.selectOfficePostOffice(officePostOffice);
	
		
	}

}
