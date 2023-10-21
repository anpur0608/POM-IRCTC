package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC001";
		description = "To verify the irctc new user for the signup ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void irctcRegistration(String userName,String password,String confrimPassword,String securityAnswer,String fristName,String middleName,String lastName,String year,String month,String country,String email,String mobile,String nationality,String flatNo,String street,String area,String pinCode,String state,String city,String postOffice,String phone,String officeFlatNo,String officeStreet,String officeArea,String officePinCode,String officeState,String officeCity,String officePostoffice,String officePhone){
		
		new HomePage()
		.clickOnRegister()
		.waitTime()
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfrimPassword(confrimPassword)
		.clickOnPreferredLanguage()
		.clickOnSelectedLanguage()
		.clickOnSecurityQuestion()
		.clickOnSelectedSecurityQuestion()
		.enterSecurityAnswer(securityAnswer)
		.clickOnContinue()
		.enterFristName(fristName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.clickOnOccupation()
		.clickOnSelectedOccupation()
		.clickOnDob()
		.selectYear(year)
		.selectMonth(month)
		.clickOnDate()
		.clickOnUnmarried()
		.clickOnGender()
		.enterEmail(email)
		.entermobileNumber(mobile)
		.selectNationality(nationality)
		.clickOnContinue1()
		.enterFlatNo(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.enterPinCode(pinCode)
		.enterState(state)
		//.waitTime()
		.selectCity(city)
		//.waitTime()
		.selectPostOffice(postOffice)
		.enterPhoneNumber(phone)
		.clickOnNo()
		.enterOfficeFlatNo(officeFlatNo)
		.enterOfficestreet(officeStreet)
		.enterOfficeArea(officeArea)
		.clickOnOfficeCountry()
		.clickOnOfficeSelectedCountry()
		.enterOfficePinCode(officePinCode)
		.enterOfficeState(officeState)
		.enterOfficeCity(officeCity)
		.enterOfficePostOffice(officePostoffice)
		.enterOfficePhone(officePhone);
		
		
		
		
		
		
	}

}
