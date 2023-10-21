package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SscRegisterPage extends GenericWrappers{
	
	public SscRegisterPage clickOnAadhar() {
		clickByXpath("//input[@id='rbAadharYes']");
		return this;
	}
	public SscRegisterPage enterAadharNumber(String aadharNumber) {
		enterByXpath("//input[@id='AadharNumber']", aadharNumber);
		return this;
	}
	public SscRegisterPage enterVerifyAadharNumber(String verifyAadharNumber) {
		enterByXpath("//input[@id='VerifyAadharNumber']", verifyAadharNumber);
		return this;
	}
	public SscRegisterPage enterName(String name) {
		enterByXpath("//input[@id='Name']", name);
		return this;
	}
	public SscRegisterPage enterVerifyName(String verifyName) {
		enterByXpath("//input[@id='VerifyName']", verifyName);
		return this;
	}
	public SscRegisterPage clickOnChangeName() {
		clickByXpath("//input[@id='rbHaveEverChangedNameYes']");
		return this;
	}
	public SscRegisterPage enterChangedName(String changedName) {
		enterByXpath("//input[@id='NewName']", changedName);
		return this;
	}
	public SscRegisterPage enterFatherNmae(String fatherName) {
		enterByXpath("//input[@id='FatherName']", fatherName);
		return this;
	}
	public SscRegisterPage enterVerifyFatherName(String verifyFatherName) {
		enterByXpath("//input[@id='VerifyFatherName']", verifyFatherName);
		return this;
	}
	public SscRegisterPage enterMotherName(String motherName) {
		enterByXpath("//input[@id='MotherName']", motherName);
		return this;
	}
	public SscRegisterPage enterVerifyMotherName(String verifyMotherName) {
		enterByXpath("//input[@id='VerifyMotherName']", verifyMotherName);
		return this;
	}
	public SscRegisterPage enterDob(String dob) {
		enterByXpath("//input[@id='DateOfBirth']", dob);
		return this;
	}
	public SscRegisterPage enterVerifyDob(String verifyDob) {
		enterByXpath("//input[@id='VerifyDateOfBirth']", verifyDob);
		return this;
	}
	public SscRegisterPage selectEducationBoard(String educationBoard) {
		selectVisibleTextByXpath("//select[@id='EducationBoard']", educationBoard);
		return this;
	}
	public SscRegisterPage selectVerifyEducationBoard(String verifyEducationBoard) {
		selectVisibleTextByXpath("//select[@id='ddlEducationBoard']", verifyEducationBoard);
		return this;
	}
	public SscRegisterPage enterRollNumber(String rollNumber) {
		enterByXpath("//input[@id='SecondaryRollNum']", rollNumber);
		return this;
	}
	public SscRegisterPage enterVerifyRollNumber(String verifyRollNumber) {
		enterByXpath("//input[@id='VerifySecondaryRollNum']", verifyRollNumber);
		return this;
	}
	public SscRegisterPage selectYearPassing(String yearPassing) {
		selectVisibleTextByXpath("//select[@id='Yearofpassing']", yearPassing);
		return this;
	}
	public SscRegisterPage selectVerifyYearPassing(String verifyYearPassing) {
		selectVisibleTextByXpath("//select[@id='ddlYearofpassing']", verifyYearPassing);
		return this;
	}
	public SscRegisterPage clickOnGender() {
		clickByXpath("//input[@id='rbMale']");
		return this;
	}
	public SscRegisterPage clickOnVerifyGender() {
		clickByXpath("//input[@id='rbVerifyMale']");
		return this;
	}
	public SscRegisterPage selectEducationQualification(String educationQualification) {
		selectVisibleTextByXpath("//select[@id='Levelofeducationqualification']", educationQualification);
		return this;
	}
	public SscRegisterPage enterMobileNumber(String mobileNumber) {
		enterByXpath("//input[@id='MobileNum']", mobileNumber);
		return this;
	}
	public SscRegisterPage enterVerifyMobileNumber(String verifyMobileNumber) {
		enterByXpath("//input[@id='VerifyMobileNum']", verifyMobileNumber);
		return this;
	}
	public SscRegisterPage enterEmail(String email) {
		enterByXpath("//input[@id='EmailID']", email);
		return this;
	}
	public SscRegisterPage enterVerifyEmail(String verifyEmail) {
		enterByXpath("//input[@id='VerifyEmailID']", verifyEmail);
		return this;
	}
	public SscRegisterPage selectState(String state) {
		selectVisibleTextByXpath("//select[@id='OriginState']", state);
		return this;
	}

}
