package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormCRegisterPage extends GenericWrappers{

	public FormCRegisterPage enterUserId(String userId) {
		enterByXpath("//input[@id='u_id']", userId);
		return this ;
	}
	public FormCRegisterPage enterPassword(String password) {
		enterByXpath("//input[@id='u_pwd']", password);
		return this ;
	}
	public FormCRegisterPage enterConfrimPassword(String confrimPassword) {
		enterByXpath("//input[@id='u_repwd']", confrimPassword);
		return this ;
	}
	public FormCRegisterPage selectSecurityQuestion(String securityQuestion) {
		selectVisibleTextByXpath("//select[@id='u_secques']", securityQuestion);
		return this ;
	}
	public FormCRegisterPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath("//input[@id='u_secans']", securityAnswer);
		return this ;
	}
	public FormCRegisterPage enterName(String name) {
		enterByXpath("//input[@id='u_name']", name);
		return this ;
	}
	public FormCRegisterPage selectGender(String gender) {
		selectVisibleTextByXpath("//select[@id='u_gender']", gender);
		return this ;
	}
	public FormCRegisterPage enterDob(String dob) {
		enterByXpath("//input[@id='u_dob']", dob);
		return this ;
	}
	public FormCRegisterPage enterDesignation(String designation) {
		enterByXpath("//input[@id='u_designation']", designation);
		return this ;
	}
	public FormCRegisterPage enterEmail(String email) {
		enterByXpath("//input[@id='u_emailid']", email);
		return this ;
	}
	public FormCRegisterPage enterMobileNo(String mobileNo) {
		enterByXpath("//input[@id='u_mobile']", mobileNo);
		return this ;
	}
	public FormCRegisterPage enterPhoneNo(String phoneNo) {
		enterByXpath("//input[@id='u_phone']", phoneNo);
		return this ;
	}
	public FormCRegisterPage selectNationality(String nationality) {
		selectVisibleTextByXpath("//select[@id='u_nationality']", nationality);
		return this ;
	}
	public FormCRegisterPage enterHotelName(String hotelName) {
		enterByXpath("//input[@id='name']", hotelName);
		return this ;
	}
	public FormCRegisterPage enterCapacity(String capacity) {
		enterByXpath("//input[@id='capacity']", capacity);
		return this ;
	}
	public FormCRegisterPage enterHotelAddress(String hotelAddress) {
		enterByXpath("//textarea[@id='address']", hotelAddress);
		return this ;
	}
	public FormCRegisterPage selectState(String state) {
		selectVisibleTextByXpath("//select[@id='state']", state);
		return this ;
	}
	public FormCRegisterPage waitTime() {
		waitProperty(9000);
		return this;
	}
	
	public FormCRegisterPage selectDistrict(String district) {
		selectVisibleTextByXpath("//select[@id='city_distr']", district);
		return this ;
	}
	public FormCRegisterPage selectAccomodationType(String accomodationType) {
		selectVisibleTextByXpath("//select[@id='acco_type']", accomodationType);
		return this ;
	}
	public FormCRegisterPage selectAccomodationGrade(String accomodationGrade) {
		selectVisibleTextByXpath("//select[@id='star_rat']", accomodationGrade);
		return this ;
	}
	public FormCRegisterPage enterHotelEmail(String hotelEmail) {
		enterByXpath("//input[@id='email']", hotelEmail);
		return this ;
	}
	public FormCRegisterPage enterHotelMobileNo(String hotelMobileNo) {
		enterByXpath("//input[@id='mcontact']", hotelMobileNo);
		return this ;
	}
	public FormCRegisterPage enterHotelPhoneNo(String hotelPhoneNo) {
		enterByXpath("//input[@id='contact']", hotelPhoneNo);
		return this ;
	}
	public FormCRegisterPage enterOwnerName(String ownerName) {
		enterByXpath("//input[@name='name_o']", ownerName);
		return this ;
	}
	public FormCRegisterPage enterOwnerAddresss(String ownerAddress) {
		enterByXpath("//input[@name='address_o']", ownerAddress);
		return this ;
	}
	public FormCRegisterPage selectOwnerState(String ownerState) {
		selectVisibleTextByXpath("//select[@id='state_o']", ownerState);
		return this ;
	}
	public FormCRegisterPage selectOwnerDistrict(String ownerDistrict) {
		selectVisibleTextByXpath("//select[@id='citydistr_o']", ownerDistrict);
		return this ;
	}
	public FormCRegisterPage enterOwnerEmail(String ownerEmail) {
		enterByXpath("//input[@name='emailid_o']", ownerEmail);
		return this ;
	}
	public FormCRegisterPage enterOwnerPhoneNo(String ownerPhoneNo) {
		enterByXpath("//input[@name='phoneno_o']", ownerPhoneNo);
		return this ;
	}
	public FormCRegisterPage enterOwnerMobileNo(String ownerMobileNo) {
		enterByXpath("//input[@name='mobile_o']", ownerMobileNo);
		return this ;
	}
	public FormCRegisterPage clickOnAdd() {
		clickByXpath("//input[@onclick='addInput()']");
		return this ;
	}
	public FormCRegisterPage enterName1(String name1) {
		enterByXpath("//input[@name='name_o']", name1);
		return this ;
	}
	public FormCRegisterPage enterAddress1(String address1) {
		enterByXpath("//input[@name='address_o']", address1);
		return this ;
	}
	public FormCRegisterPage selectState1(String state1) {
		selectVisibleTextByXpath("//select[@id='state_o']", state1);
		return this ;
	}
	public FormCRegisterPage selectDistrict1(String district1) {
		selectVisibleTextByXpath("//select[@id='citydistr_o']", district1);
		return this ;
	}
	public FormCRegisterPage enterEmail1(String email1) {
		enterByXpath("//input[@name='emailid_o']", email1);
		return this ;
	}
	public FormCRegisterPage enterPhoneNo1(String phoneNo1) {
		enterByXpath("//input[@name='phoneno_o']", phoneNo1);
		return this ;
	}
	public FormCRegisterPage enterMobileNo1(String mobileNo1) {
		enterByXpath("//input[@name='mobile_o']", mobileNo1);
		return this ;
	}
	public FormCRegisterPage clickOnAdd1() {
		clickByXpath("//input[@onclick='addInput()']");
		return this ;
	}
	public FormCRegisterPage enterName2(String name2) {
		enterByXpath("//input[@name='name_o']", name2);
		return this ;
	}
	public FormCRegisterPage enterAddress2(String address2) {
		enterByXpath("//input[@name='address_o']", address2);
		return this ;
	}
	public FormCRegisterPage selectState2(String state2) {
		selectVisibleTextByXpath("//select[@id='state_o']", state2);
		return this ;
	}
	public FormCRegisterPage selectDistrict2(String district2) {
		selectVisibleTextByXpath("//select[@id='citydistr_o']", district2);
		return this ;
	}
	public FormCRegisterPage enterEmail2(String email2) {
		enterByXpath("//input[@name='emailid_o']", email2);
		return this ;
	}
	public FormCRegisterPage enterPhoneNo2(String phoneNo2) {
		enterByXpath("//input[@name='phoneno_o']", phoneNo2);
		return this ;
	}
	public FormCRegisterPage enterMobileNo2(String mobileNo2) {
		enterByXpath("//input[@name='mobile_o']", mobileNo2);
		return this ;
	}
	public FormCRegisterPage clickOnAdd2() {
		clickByXpath("//input[@onclick='addInput()']");
		return this ;
	}
	public FormCRegisterPage enterName3(String name3) {
		enterByXpath("//input[@name='name_o']", name3);
		return this ;
	}
	public FormCRegisterPage enterAddress3(String address3) {
		enterByXpath("//input[@name='address_o']", address3);
		return this ;
	}
	public FormCRegisterPage selectState3(String state3) {
		selectVisibleTextByXpath("//select[@id='state_o']", state3);
		return this ;
	}
	public FormCRegisterPage selectDistrict3(String district3) {
		selectVisibleTextByXpath("//select[@id='citydistr_o']", district3);
		return this ;
	}
	public FormCRegisterPage enterEmail3(String email3) {
		enterByXpath("//input[@name='emailid_o']", email3);
		return this ;
	}
	public FormCRegisterPage enterPhoneNo3(String phoneNo3) {
		enterByXpath("//input[@name='phoneno_o']", phoneNo3);
		return this ;
	}
	public FormCRegisterPage enterMobileNo3(String mobileNo3) {
		enterByXpath("//input[@name='mobile_o']", mobileNo3);
		return this ;
	}
	
}
