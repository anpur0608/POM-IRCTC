package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PaymentsPage extends GenericWrappers{
	
	public PaymentsPage nextWindow() {
		switchToLastWindow();
		return this;
	}
	
	public PaymentsPage clickOnCheckBox() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	public OtpPage clickOnMakePayment() {
		clickByXpath("//button[text()='Make Payment'] ");
		return new OtpPage();
	}

}
