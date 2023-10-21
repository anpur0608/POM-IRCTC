package pom.ssc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.SscHomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeclass() {
		
		testName = "TC009";
		description = "To verify ssc the sign up for new user ";
		author = "arshad";
		category = "somke";
		
		browserName = "chrome";
		url = "https://ssc.nic.in/";
		sheetName = "TC009";
	}
	
	@Test(dataProvider = "fetchData")
		
	public void sscRegistration(String aadharNumber,String verifyAadharNumber,String name,String verifyName,String newName,String fatherName,String verifyFatherName,String motherName,String verifyMotherName,String dob,String verifyDob,String educationBoard,String verifyEducationBoard,String rollNumber,String verifyRollNumber,String year,String verifyYear,String qualification,String mobileNumber,String verifyMobileNumber,String email,String verifyEmail,String state) {
		
		new SscHomePage()
		
		.clickOnRegister()
		.clickOnAadhar()
		.enterAadharNumber(aadharNumber)
		.enterVerifyAadharNumber(verifyAadharNumber)
		.enterName(name)
		.enterVerifyName(verifyName)
		.clickOnChangeName()
		.enterChangedName(newName)
		.enterFatherNmae(fatherName)
		.enterVerifyFatherName(verifyFatherName)
		.enterMotherName(motherName)
		.enterVerifyMotherName(verifyMotherName)
		.enterDob(dob)
		.enterVerifyDob(verifyDob)
		.selectEducationBoard(educationBoard)
		.selectVerifyEducationBoard(verifyEducationBoard)
		.enterRollNumber(rollNumber)
		.enterVerifyRollNumber(verifyRollNumber)
		.selectYearPassing(year)
		.selectVerifyYearPassing(verifyYear)
		.clickOnGender()
		.clickOnVerifyGender()
		.selectEducationQualification(qualification)
		.enterMobileNumber(mobileNumber)
		.enterVerifyMobileNumber(verifyMobileNumber)
		.enterEmail(email)
		.enterVerifyEmail(verifyEmail)
		.selectState(state);
		
	}

}
