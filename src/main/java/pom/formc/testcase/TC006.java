package pom.formc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC006";
		description = "To verify the form c sign up for the new user";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName = "TC006";
	}
	
	@Test(dataProvider = "fetchData")
	
	public void fromC(String userId,String password,String confrimPassword,String secQuestion,String secAnswer,String name,String gender,String dob,String designation,String email,String mobileNumber,String phoneNumber,String nationality,String hotelName,String capcity,String hoteladdress,String state,String district,String accomodationType,String accomodationGrade,String hotelEmail,String hotelMobileNumber,String hotelPhoneNumber,String ownerName,String ownerAddress,String ownerState,String ownerDistrict,String owneremail,String ownerPhoneNumber,String ownerMobileNumber,String name1,String address1,String state1,String district1,String email1,String phoneNumber1,String mobileNumber1,String name2,String address2,String state2,String district2,String email2,String phoneNumber2,String mobileNumber2,String name3,String address3,String state3,String district3,String email3,String phonenumber3,String mobileNumber3) {
		
		 new FormCHomePage()
		.clickOnSignUp()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfrimPassword(confrimPassword)
		.selectSecurityQuestion(secQuestion)
		.enterSecurityAnswer(secAnswer)
		.enterName(name)
		.selectGender(gender)
		.enterDob(dob)
		.enterDesignation(designation)
		.enterEmail(email)
		.enterMobileNo(mobileNumber)
		.enterPhoneNo(phoneNumber)
		.selectNationality(nationality)
		.enterHotelName(hotelName)
		.enterCapacity(capcity)
		.enterHotelAddress(hoteladdress)
		.selectState(state)
		.waitTime()
		.selectDistrict(district)
		.waitTime()
		.selectAccomodationType(accomodationType)
		.selectAccomodationGrade(accomodationGrade)
		.enterHotelEmail(hotelEmail)
		.enterHotelMobileNo(hotelMobileNumber)
		.enterHotelPhoneNo(hotelPhoneNumber)
		.enterOwnerName(ownerName)
		.enterOwnerAddresss(ownerAddress)
		.selectOwnerState(ownerState)
		.selectOwnerDistrict(ownerDistrict)
		.enterOwnerEmail(owneremail)
		.enterOwnerPhoneNo(ownerPhoneNumber)
		.enterOwnerMobileNo(ownerMobileNumber)
		.clickOnAdd()
		.enterName1(name1)
		.enterAddress1(address1)
		.selectState1(state1)
		.waitTime()
		.selectDistrict1(district1)
		.enterEmail1(email1)
		.enterPhoneNo1(phoneNumber1)
		.enterMobileNo1(mobileNumber1)
		.clickOnAdd1()
		.waitTime()
		.enterName2(name2)
		.enterAddress2(address2)
		.selectState2(state2)
		.waitTime()
		.selectDistrict2(district2)
		.enterEmail2(email2)
		.enterPhoneNo2(phoneNumber2)
		.enterMobileNo2(mobileNumber2)
		.clickOnAdd2()
		.waitTime()
		.enterName3(name2)
		.enterAddress3(address3)
		.selectState3(state3)
		.waitTime()
		.selectDistrict3(district3)
		.enterEmail3(email3)
		.enterPhoneNo3(phonenumber3)
		.enterMobileNo3(mobileNumber3);
		
		
	}

}
